package br.com.flores.flores.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flores.flores.controllers.dto.FlorDto;
import br.com.flores.flores.models.Flor;
import br.com.flores.flores.repository.FlorRepository;

@RestController
public class FloresController {

	@Autowired
	private FlorRepository florRepository;

	@RequestMapping("/flores")
	public List<FlorDto> getFlores() {
		List<Flor> flores = florRepository.findAll();
		return FlorDto.convertFromFlor(flores);
	}
	
}
