package co.simplon.mydiet.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "commentable")
@Inheritance(strategy = InheritanceType.JOINED)
public class Commentable implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9162768215062223281L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
		
	@Column(name = "name")
    private String name;
	
	@OneToMany(mappedBy = "commentable",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Comment> comments = new ArrayList<Comment>();
	
	
	public Commentable() {
		
	}
	
	public Commentable(String name) {
		this.name = name;			
	}
	
	public void Comment(String text) {
		Comment comment = new Comment(text);
		comments.add(comment);
		comment.setCommentable(this);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
