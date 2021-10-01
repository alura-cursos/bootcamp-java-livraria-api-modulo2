package br.com.alura.livraria.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.livraria.dto.LivroDto;
import br.com.alura.livraria.dto.LivroFormDto;
import br.com.alura.livraria.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	private LivroService livroService;

	@GetMapping
	public List<LivroDto> listar() {
		return livroService.listar();
	}

	@PostMapping
	public void cadastrar(@RequestBody @Valid LivroFormDto dto) {
		livroService.cadastrar(dto);
	}

}
