package br.com.flores.flores.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Stalk {
	private Long id_stalk;
	private String name;
	private String description;
	private LocalDateTime created_at = LocalDateTime.now();
	private User author;
	
	public Stalk(String name, String description, User author) {
		super();
		this.name = name;
		this.description = description;
		this.author = author;
	}

	public Stalk() {
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(author, created_at, description, id_stalk, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stalk other = (Stalk) obj;
		return Objects.equals(author, other.author) && Objects.equals(created_at, other.created_at)
				&& Objects.equals(description, other.description) && Objects.equals(id_stalk, other.id_stalk)
				&& Objects.equals(name, other.name);
	}
	public Long getId_stalk() {
		return id_stalk;
	}
	public void setId_stalk(Long id_stalk) {
		this.id_stalk = id_stalk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
