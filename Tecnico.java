/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;


public class Tecnico extends Aluno{
	private String registroProfissional;
	public void Praticar() {
		System.out.println(getNome() +" está praticando!");
	}
	public String getRegistroProfissional() {
		return registroProfissional;
	}
	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
}