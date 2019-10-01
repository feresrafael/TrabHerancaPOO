/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

public class Bolsista extends Aluno {
	private int bolsa;
	public void RenovarBolsa() {
		System.out.println("Bolsa Renovada");
	}
	public int getBolsa() {
		return bolsa;
	}
	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	@Override
	public void PagarMensalidade() {
		System.out.println("Estado da mensalidade de " + getNome() + ": PAGA (bolsa de R$ "+ bolsa + ")");
	}	
}