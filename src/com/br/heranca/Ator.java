package com.br.heranca;

import java.util.List;

public class Ator extends Pessoa {

	private List<String> filmeParticipados;
	private int anosExperiencia;
	private boolean temOscar;
	private double anoDeNascimento;
	private String melhorFilme;
	
	public String toString() {
		String modelo = "";
		modelo += " nome >" + this.getNome() + "\n";
		modelo += " sobrenome>"+this.getIdade()+ " \n";
		modelo += " filmeParticipados" + this.getFilmeParticipados()+ "\n";
		modelo += " ano de nascimento " + this.getAnoDeNascimento()+ "\n";
		modelo += " melhor filme" + this.getMelhorFilme()+ "\n";

		return modelo;
	}
	public Ator(String nome, String sobrenome, int idade, List<String> filmeParticipados, int anosExperiencia,
			boolean temOscar, double anoDeNascimento, String melhorFilme) {
		super(nome, sobrenome, idade);
		this.filmeParticipados = filmeParticipados;
		this.anosExperiencia = anosExperiencia;
		this.temOscar = temOscar;
		this.anoDeNascimento = anoDeNascimento;
		this.melhorFilme = melhorFilme;
	}

	public List<String> getFilmeParticipados() {
		return filmeParticipados;
	}
	public void setFilmeParticipados(List<String> filmeParticipados) {
		this.filmeParticipados = filmeParticipados;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}

	public boolean isTemOscar() {
		return temOscar;
	}

	public void setTemOscar(boolean temOscar) {
		this.temOscar = temOscar;
	}

	public double getAnoDeNascimento() {
		return anoDeNascimento;
	}

	public void setAnoDeNascimento(double anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}

	public String getMelhorFilme() {
		return melhorFilme;
	}

	public void setMelhorFilme(String melhorFilme) {
		this.melhorFilme = melhorFilme;
	}

}
