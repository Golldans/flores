package br.com.flores.flores.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Root {
	private Long id_root;
	private String name;
	private String description;
	private LocalDateTime created_at = LocalDateTime.now();
	private User author;
	
	@Override
	public int hashCode() {
		return Objects.hash(author, created_at, description, id_root, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Root other = (Root) obj;
		return Objects.equals(author, other.author) && Objects.equals(created_at, other.created_at)
				&& Objects.equals(description, other.description) && Objects.equals(id_root, other.id_root)
				&& Objects.equals(name, other.name);
	}
	public Long getId_root() {
		return id_root;
	}
	public void setId_root(Long id_root) {
		this.id_root = id_root;
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
