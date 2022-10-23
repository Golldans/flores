package br.com.flores.flores.models;

import java.util.Objects;

public class User {
	private Long id_user;
	private String name;
	private String email;
	private String password;

	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public User() {
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(email, id_user, name, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(id_user, other.id_user) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}
	public Long getId() {
		return id_user;
	}
	public void setId(Long id) {
		this.id_user = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
