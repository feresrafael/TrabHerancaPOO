/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public void PagarMensalidade() {
		System.out.println("Status da mensalidade de " + getNome() + ": PAGA");
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}