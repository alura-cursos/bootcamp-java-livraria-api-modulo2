package br.com.alura.livraria.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.livraria.dto.LivroDto;
import br.com.alura.livraria.dto.LivroFormDto;
import br.com.alura.livraria.modelo.Autor;
import br.com.alura.livraria.modelo.Livro;

@Service
public class LivroService {

	private ModelMapper modelMapper = new ModelMapper();
	private List<Livro> livros = new ArrayList<>();

	@Autowired
	private AutorService autorService;

	public List<LivroDto> listar() {
		return livros.stream().map(l -> modelMapper.map(l, LivroDto.class)).collect(Collectors.toList());
	}

	public void cadastrar(LivroFormDto dto) {
		Autor autor = autorService.buscarPorNome(dto.getNomeAutor());
		Livro livro = modelMapper.map(dto, Livro.class);
		livro.setAutor(autor);
		livros.add(livro);
	}

}
