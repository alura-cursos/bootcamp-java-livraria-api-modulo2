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
public class Livro {

	private String titulo;
	private LocalDate dataLancamento;
	private int numeroDePaginas;
	private Autor autor;

}
