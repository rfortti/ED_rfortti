/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex06_incompleto;

/**
 *
 * @author Aluno
 */
public class Estrutura 
{
    private long[] Paciente;
    private int index;
    private int maxSize;
    
    public Estrutura(int max) //método construtor
    {
        Paciente = new long[max];
        index = 0;
        maxSize = max;
    }
    
    public void insert(long item)    // Metodo de Inserção ...podemos dizer "Enfilar" ...
      {
      int j;

      if(index == 0)                         // Se não tiver nenhum item na FILA...
         Paciente[index++] = item;         // ... inserimos na posição 0 e depois incrementamos nItems
      else                                // ... se tiver algo na fila ...
         {
         for(j = index-1; j >= 0; j--)         // ... começando pelo final da fila ... 
            {
            if( item > Paciente[j] )      // ... comparamos se o item que queremos inserir é maior do que cada um que já esta na fila
               Paciente[j+1] = Paciente[j]; // ... se for, eles vão pular uma posição "pra traz" na fila!!!
            else                          // ... no momento em que o item que queremos inserir for menor do que os itens na fila...
               break;                     // paramos nessa posição e ...
            }  // end for
         Paciente[j+1] = item;            // inserimos na posição de traz ...
         index++;
         }  // final do else
      }  // final do insert ...
    
 //-------------------------------------------------------------
   public long remove()             // remove!!!
   { 
       return Paciente[--index]; 
   }
//-------------------------------------------------------------
   public long peekMin()            // pega o último item
   { 
       return Paciente[index-1]; 
   }
//-------------------------------------------------------------
   public boolean isEmpty()         // vê se esta vazio
   { 
       return (index == 0); 
   }
//-------------------------------------------------------------
   public boolean isFull()          // vê se esta cheio!!!
   { 
       return (index == maxSize); 
   }
//-------------------------------------------------------------
}
