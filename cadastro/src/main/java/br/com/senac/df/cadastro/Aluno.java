/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.cadastro;

/**
 *
 * @author francisco62977666
 */
public class Aluno extends Pessoa {
   private String nota;
   private String media;
    
  public String getNota(){  
   return this.nota;
   }
  public void setNota(String nota) {
    this.nota = nota;
  }
  public String getMedia(){
    return this.media;
  } 
  public void setMedia(String media) {
    this.media = media;
  }
  public Aluno(String nota, String media, String nome, String telefone, String endereco){
    super(nome,telefone,endereco);
    this.nota = nota;
    this.media = media;         
  } 
  
   @Override
  public void apresentacao(){
      System.out.println("Olá, sou aluno.");
  }
  
  
  
}
