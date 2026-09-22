/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.cadastro;

/**
 *
 * @author francisco62977666
 */
public class Professor extends Pessoa{
   private String salario;
   private String ncontrato;
   
  public String getSalario(){
   return this.salario;
  }
  public void setSalario(String salario){
   this.salario = salario;
  }
  
  public String getNcontrato(){
    return this.ncontrato;  
  }
  public void setNcontrato(String ncontrato){
    this.ncontrato = ncontrato;  
  }
  
  public Professor(String salario, String ncontrato, String nome, String telefone, String endereco){
    super(nome,telefone,endereco);
    this.salario = salario;
    this.ncontrato = ncontrato;
  }
  
   @Override
  public void apresentacao(){
      System.out.println("Olá, sou o professor. Me chamo " + this.getNome());
  }
  
  
  
}
