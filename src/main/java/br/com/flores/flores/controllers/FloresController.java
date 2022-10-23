package br.com.flores.flores.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flores.flores.controllers.dto.FlorDto;
import br.com.flores.flores.models.Flor;
import br.com.flores.flores.models.Root;
import br.com.flores.flores.models.Stalk;
import br.com.flores.flores.models.User;

@RestController
public class FloresController {

	@RequestMapping("/flores")
	public List<FlorDto> getFlores() {
		User user = new User("Cristo", "cristo@gmail.com", "123");
		Stalk stalk = new Stalk("Simpodial", "Nome doido também", user);
		Root root = new Root("Sapopema", "Que nome doido", user);
		
		Flor flor = new Flor("Calêndula", "Calendula officinalis", "Nice flower", stalk, root, user);

		return FlorDto.convertFromFlor(Arrays.asList(flor, flor, flor));
	}
	
}
