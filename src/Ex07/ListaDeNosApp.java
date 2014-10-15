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
////////////////////////////////////////////////////////////////
class ListaDeNosApp
   {
   public static void main(String[] args)
      {
      ListaDeNos theList = new ListaDeNos();  // criamos uma nova lista

      theList.insertFirst("Palavra1", "Jasmin");      // inserimos quatro itens nela
      theList.insertFirst("Palavra2", "Jana");
      theList.insertFirst("Palavra3", "Roberto");
      theList.insertFirst("Palavra4", "Alexandre");
            
      theList.displayList();              // mostramos a lista
      System.out.print("\n"); 
      
      No search = theList.find("Jasmin");
        if (search != null)
            search.displayNo();
        else
            System.out.println("\nNao encontrado");
        
      System.out.print("\n\n"); 
      while( !theList.isEmpty() )         // until it's empty,
         {
         No aLink = theList.deleteFirst();   // deletamos o primeiro nó da lista e colocamos em aLink
         System.out.print("Deletado ");         // 
         aLink.displayNo();                     // mostramos o nó deletado
         System.out.println("");
         }
      theList.displayList();              // mostramos a lista
      }  // final do método main()
   }  // final da classe usuária
////////////////////////////////////////////////////////////////

