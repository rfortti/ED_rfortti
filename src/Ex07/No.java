/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex07;

/**
 *
 * @author aleaguado traduzido de Robert Lafore
 */
public class No
   {
   private String nome;              // vai armazenar uma string qualquer
   private String palavra;           // vai armazenar uma string qualquer
   private No next;              // referência para o próximo item da lista
// -------------------------------------------------------------
   public No(String word, String name) // metodo construtor
      {
      this.nome = name;                 // initializa os dois atributos do No
      this.palavra = word;                 // o No next a principio fica como null
      }                           // 
// -------------------------------------------------------------
   public void displayNo()      // mostra os valores do proprio nó
      {
       System.out.print("{" + nome + ", " + palavra + "} ");
      // return "{" + nome + ", " + palavra + "} ";
      }
   
   public void setNext(No n){
       next = n;
   }
   
   public No getNext(){
       return next;
   }   
   
   public String getNome()
   {
       return nome;
   }
   
   public String getPalavra() {
        return palavra;
    }
   }  // fim da classe nó
////////////////////////////////////////////////////////////////