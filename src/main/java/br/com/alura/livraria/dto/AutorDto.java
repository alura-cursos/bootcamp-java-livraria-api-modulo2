package br.com.alura.livraria.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutorDto {

	private String nome;
	private String email;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;
	private String miniCurriculo;

}
