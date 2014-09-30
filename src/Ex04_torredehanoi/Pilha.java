/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex04_torredehanoi;

/**
 *
 * @author aleaguado
 */
class Pilha
{
    private int topo;
    private int capacidade;
    private char[] pilhaArray;
   
//--------------------------------------------------------------
   public Pilha(int cap)       // constructor
      {
      capacidade = cap;
      pilhaArray = new char[capacidade];
      topo = -1;
      }
//--------------------------------------------------------------
   public void inserir(char j)  // insere item
      {
      pilhaArray[++topo] = j;
      }
//--------------------------------------------------------------
   public char remove()         // remove item
      {
      return pilhaArray[topo--];
      }
//--------------------------------------------------------------
   public char pegaitem()        // pega o item do topo
      {
      return pilhaArray[topo];
      }
//--------------------------------------------------------------
   public boolean estaVazio()    // retorna verdadeiro se estiver vazio
      {
      return (topo == -1);
      }
//--------------------------------------------------------------
}  // fim da classe
