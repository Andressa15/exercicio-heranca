package com.br.heranca;

public class Programador extends Pessoa{

	private String linguagens;
	private  int anosDeExperiencia;
	private  boolean gostaDeCafe;
	
	public Programador(String nome, String sobrenome, int idade, String linguagens, int anosDeExperiencia,
			boolean gostaDeCafe) {
		super(nome, sobrenome, idade);
		this.linguagens = linguagens;
		this.anosDeExperiencia = anosDeExperiencia;
		this.gostaDeCafe = gostaDeCafe;
	}

	public String getLinguagens() {
		return linguagens;
	}

	public void setLinguagens(String linguagens) {
		this.linguagens = linguagens;
	}

	public int getAnosDeExperiencia() {
		return anosDeExperiencia;
	}

	public void setAnosDeExperiencia(int anosDeExperiencia) {
		this.anosDeExperiencia = anosDeExperiencia;
	}

	public boolean isGostaDeCafe() {
		return gostaDeCafe;
	}

	public void setGostaDeCafe(boolean gostaDeCafe) {
		this.gostaDeCafe = gostaDeCafe;
	}
 












}