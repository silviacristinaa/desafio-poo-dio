package com.github.silviacristinaa.desafiopoodio.models;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Mentoria extends Conteudo{
	private LocalDate data;

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	@Override
	public String toString() {
		return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
	}
}
