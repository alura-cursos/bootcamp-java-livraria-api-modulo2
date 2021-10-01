package br.com.alura.livraria.modelo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Autor {

	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private String miniCurriculo;

}
