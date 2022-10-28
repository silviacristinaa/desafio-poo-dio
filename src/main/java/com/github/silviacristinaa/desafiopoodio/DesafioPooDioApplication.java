package com.github.silviacristinaa.desafiopoodio;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.silviacristinaa.desafiopoodio.models.Bootcamp;
import com.github.silviacristinaa.desafiopoodio.models.Curso;
import com.github.silviacristinaa.desafiopoodio.models.Dev;
import com.github.silviacristinaa.desafiopoodio.models.Mentoria;

@SpringBootApplication
public class DesafioPooDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioPooDioApplication.class, args);
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		System.out.println("------");
		
		Bootcamp bootcamp = new Bootcamp();
	    bootcamp.setNome("Bootcamp Java Developer");
	    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
	    bootcamp.getConteudos().add(curso1);
	    bootcamp.getConteudos().add(curso2);
	    bootcamp.getConteudos().add(mentoria);

	    Dev devSilvia = new Dev();
	    devSilvia.setNome("Silvia");
	    devSilvia.inscreverBootcamp(bootcamp);
	    System.out.println("Conteúdos Inscritos Silvia:" + devSilvia.getConteudosInscritos());
	    devSilvia.progredir();
	    devSilvia.progredir();
	    System.out.println("-");
	    System.out.println("Conteúdos Inscritos Silvia:" + devSilvia.getConteudosInscritos());
	    System.out.println("Conteúdos Concluídos Silvia:" + devSilvia.getConteudosConcluidos());
	    System.out.println("XP:" + devSilvia.calcularTotalXp());
	    
	    System.out.println("------");
	    
	    Dev devJoao = new Dev();
	    devJoao.setNome("João");
	    devJoao.inscreverBootcamp(bootcamp);
	    System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
	    devJoao.progredir();
	    devJoao.progredir();
	    devJoao.progredir();
	    System.out.println("-");
	    System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
	    System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
	    System.out.println("XP:" + devJoao.calcularTotalXp());
	}
}
