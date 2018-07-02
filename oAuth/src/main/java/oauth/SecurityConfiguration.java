package oauth;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@Order(value=1)
@EnableOAuth2Sso
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
	  http.antMatcher("/**").authorizeRequests()
	      .antMatchers("/","/np**","/login**", "/error**","/webjars/**", "/logout**").permitAll()
	      .anyRequest().authenticated()
	      .and().logout().logoutSuccessUrl("/").permitAll()
	      .and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).disable();
    }
    
    @Bean
	public OAuth2RestTemplate oauth2RestTemplate(OAuth2ProtectedResourceDetails resource
						     , OAuth2ClientContext context) {
	    return new OAuth2RestTemplate(resource, context);
	}

	@Bean
	public AuthoritiesExtractor authoritiesExtractor(OAuth2RestOperations template) {
	    return new GithubOrgsAuthoritiesExtractor(template);
	}
}
