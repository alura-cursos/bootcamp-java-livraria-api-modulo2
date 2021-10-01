package br.com.alura.livraria.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutorFormDto {

	@NotBlank
	private String nome;

	@NotBlank
	private String email;

	@NotNull
	@PastOrPresent
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;

	@NotBlank
	private String miniCurriculo;

}
