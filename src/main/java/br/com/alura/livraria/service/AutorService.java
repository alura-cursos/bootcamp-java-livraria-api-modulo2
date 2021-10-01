package br.com.alura.livraria.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.alura.livraria.dto.AutorDto;
import br.com.alura.livraria.dto.AutorFormDto;
import br.com.alura.livraria.modelo.Autor;

@Service
public class AutorService {

	private ModelMapper modelMapper = new ModelMapper();
	private List<Autor> autores = new ArrayList<>();

	public List<AutorDto> listar() {
		return autores.stream().map(a -> modelMapper.map(a, AutorDto.class)).collect(Collectors.toList());
	}

	public void cadastrar(AutorFormDto dto) {
		Autor autor = modelMapper.map(dto, Autor.class);
		autores.add(autor);
	}

	public Autor buscarPorNome(String nome) {
		return autores
				.stream()
				.filter(autor -> autor.getNome().equals(nome))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Autor inexistente!"));
	}

}
