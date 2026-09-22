/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.cadastro;

/**
 *
 * @author francisco62977666
 */
public class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    
    public String getNome(){
     return this.nome;  
   }
    public void setNome(String nome){
      this.nome = nome;   
    }
    
    public String getTelefone(){
      return this.telefone;
    }
    public void setTelefone(String telefone){
      this.telefone = telefone;  
    }
    
    public String getEndereco(){
      return this.endereco;  
    }
    public void setEndereco(String endereco){
      this.endereco = endereco;  
    }
    
public Pessoa(String nome, String telefone, String endereco) {
    this.nome = nome;
    this.telefone = telefone;
    this.endereco = endereco;


}   
 public void apresentacao(){}

}
