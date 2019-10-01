/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

public class Professor extends Pessoa {
	private String especialidade;
	private int salario;
	
	public void receberAumento() {
		System.out.println("O salario teve um aumentode 10 %, passando de R$ " + salario + " para R$ " + (salario*0.10+salario) + " (aumento de R$ " + (salario*0.10) + ")");
		this.salario += salario*0.10;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
}
