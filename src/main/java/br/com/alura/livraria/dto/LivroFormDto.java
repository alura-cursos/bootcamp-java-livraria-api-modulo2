package br.com.alura.livraria.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroFormDto {

	@NotNull
	@Size(min = 10)
	private String titulo;

	@NotNull
	@PastOrPresent
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataLancamento;

	@Min(100)
	private int numeroDePaginas;

	@NotBlank
	private String nomeAutor;

}
