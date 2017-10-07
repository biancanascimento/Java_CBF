package br.ucb.modelo;

import java.io.Serializable;

public class Time implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private int totalPontos;
	private int numeroVitorias;
	private int saldoGols;
	private int golsPro;
	
	public Time() {
	}
	
	public void adicionarPontos(int pontos) {
		this.totalPontos += pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTotalPontos() {
		return totalPontos;
	}

	public void setTotalPontos(int totalPontos) {
		this.totalPontos = totalPontos;
	}

	public int getNumeroVitorias() {
		return numeroVitorias;
	}

	public void setNumeroVitorias(int numeroVitorias) {
		this.numeroVitorias = numeroVitorias;
	}

	public int getSaldoGols() {
		return saldoGols;
	}

	public void setSaldoGols(int saldoGols) {
		this.saldoGols = saldoGols;
	}

	public int getGolsPro() {
		return golsPro;
	}

	public void setGolsPro(int golsPro) {
		this.golsPro = golsPro;
	}

}
