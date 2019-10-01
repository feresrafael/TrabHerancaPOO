/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

public class PessoaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a1 = new Aluno();
		a1.setNome("Maria");
		a1.setIdade(30);
		a1.setMatricula(005001000);
		a1.setCurso("SI");
		a1.setSexo("F");
                a1.PagarMensalidade();
		
		Professor prof = new Professor();
		prof.setNome("Pedro");
		prof.setIdade(40);
		prof.setSexo("M");
		prof.setSalario(3000);
		prof.setEspecialidade("Doutor");
		
		Tecnico tec = new Tecnico();
		tec.setNome("Carlos Maia");
		tec.setMatricula(4787498);
		tec.setCurso("Engenharia ds Computação");
		tec.setIdade(41);		
		tec.setSexo("M");
		tec.Praticar();
		tec.PagarMensalidade();
		tec.setRegistroProfissional("Mestre em Redes");
                
		Visitante visit = new Visitante();
		visit.setNome("Jose");
		visit.setIdade(10);
		visit.setSexo("M");
		
		Bolsista bol = new Bolsista();
		bol.setBolsa(100);
		bol.setNome("Bruna");
		bol.setIdade(19);
		bol.PagarMensalidade();
		
		
		
		
		

	}

}
