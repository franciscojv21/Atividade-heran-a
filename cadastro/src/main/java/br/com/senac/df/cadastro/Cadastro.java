/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.df.cadastro;

/**
 *
 * @author francisco62977666
 */
public class Cadastro {

    public static void main(String[] args) {
       Aluno aluno1 = new Aluno("9","9","Jonas","7857473356", "Ceilândia");                                                                             
       Professor professor1 = new Professor("9500","564820","Júlia","2453682211","Taguatinga");
    
       aluno1.apresentacao();
       professor1.apresentacao();
   
    }
    
}
