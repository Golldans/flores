package br.com.flores.flores.controllers.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.flores.flores.models.Flor;

public class FlorDto {
	private Long id;
	private String name;
	private String scientific_name;
	private String description;
	private LocalDateTime created_at;

	public FlorDto(Flor flor) {
		this.id = flor.getId_flor();
		this.name = flor.getName();
		this.scientific_name = flor.getScientific_name();
		this.description = flor.getDescription();
		this.created_at = flor.getCreated_at();
	}
	
	public static List<FlorDto> convertFromFlor(List<Flor> flores) {
		return flores.stream().map(FlorDto::new).collect(Collectors.toList());
	}
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getScientific_name() {
		return scientific_name;
	}
	public String getDescription() {
		return description;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
}
