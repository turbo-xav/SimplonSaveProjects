package server;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogServlet extends GenericServlet {

	private List<String> listUrlLog = Collections.synchronizedList(new ArrayList<String>());
	private long counteur1 = 0;
	private final AtomicLong counteur2 = new AtomicLong(0);
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		counteur1++;
		counteur2.incrementAndGet();
		
		listUrlLog.add(request.toString());
		response.getWriter().println(request.toString());
		response.getWriter().println("Taille :"+listUrlLog.size());
		response.getWriter().println("Taille1 :"+counteur1);
		response.getWriter().println("Taille2 :"+counteur2.get());
		
		Connection  db = SqlQuery.getConnection();
		
	
		try {
			db.setAutoCommit(false);
			PreparedStatement st = db.prepareStatement("UPDATE \"requestCounter\" SET counter = counter + 1;");
			st.executeUpdate();
			st = db.prepareStatement("INSERT INTO public.request( req) VALUES ( ?);");
			st.setString(1,request.toString());
			st.executeUpdate();
			db.commit();
			
		} catch (SQLException e) {
			try {
				db.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
