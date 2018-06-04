package co.simplon.mydiet.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "comment")
public class Comment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -783812199084791927L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
	
	@Column(name = "text")
    private String text;
	
	@Column(name="date")
	@Temporal(TemporalType.DATE)
	Date date;
		
	@ManyToOne
	Commentable commentable;
	
	public Comment() {
		
	}
	
	public Comment(String text) {
		this.text = text;
		date = new Date();
	}

	public  void setCommentable(Commentable commentable) {
		this.commentable = commentable;
	}
	
	
	public Commentable getMenuComponent() {
		return commentable;
	}
}
