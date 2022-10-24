package br.com.flores.flores.models;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name =  "flor", schema = "public")
public class Flor {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String scientific_name;
	private String description;
	@ManyToOne
	@JoinColumn(name="id_stalk")
	private Stalk stalk;
	@ManyToOne
	@JoinColumn(name="id_root")
	private Root root;
	@ManyToOne
	@JoinColumn(name="id_user")
	private User author;
	private LocalDateTime created_at = LocalDateTime.now();

	public Flor(String name, String scientific_name, String description, Stalk stalk, Root root, User author) {
		super();
		this.name = name;
		this.scientific_name = scientific_name;
		this.description = description;
		this.stalk = stalk;
		this.root = root;
		this.author = author;
	}

	public Flor() {
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(author, created_at, description, id, name, root, scientific_name, stalk);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flor other = (Flor) obj;
		return Objects.equals(author, other.author) && Objects.equals(created_at, other.created_at)
				&& Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(root, other.root)
				&& Objects.equals(scientific_name, other.scientific_name) && Objects.equals(stalk, other.stalk);
	}

	public Long getId_flor() {
		return id;
	}
	public void setId_flor(Long id_flor) {
		this.id = id_flor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScientific_name() {
		return scientific_name;
	}
	public void setScientific_name(String scientific_name) {
		this.scientific_name = scientific_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Stalk getStalk() {
		return stalk;
	}
	public void setStalk(Stalk stalk) {
		this.stalk = stalk;
	}
	public Root getRoot() {
		return root;
	}
	public void setRoot(Root root) {
		this.root = root;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	
	
}
