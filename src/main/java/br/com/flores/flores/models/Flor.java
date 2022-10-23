package br.com.flores.flores.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Flor {
	private Long id_flor;
	private String name;
	private String scientific_name;
	private String description;
	private Stalk stalk;
	private Root root;
	private LocalDateTime created_at = LocalDateTime.now();
	private User author;
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(author, created_at, description, id_flor, name, root, scientific_name, stalk);
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
				&& Objects.equals(description, other.description) && Objects.equals(id_flor, other.id_flor)
				&& Objects.equals(name, other.name) && Objects.equals(root, other.root)
				&& Objects.equals(scientific_name, other.scientific_name) && Objects.equals(stalk, other.stalk);
	}

	public Long getId_flor() {
		return id_flor;
	}
	public void setId_flor(Long id_flor) {
		this.id_flor = id_flor;
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
