/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex03;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class ClasseUsuaria 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      int maxSize = 100;            // coloca em uma constante o tamanho do vetor
              EstruturaDados arr = new EstruturaDados(maxSize); // instancia a estrutura de dados
              
              Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
              Scanner entradadouble = new Scanner (System.in);
              System.out.println("Bem Vindo ao Programa de Vetores!!!");
              System.out.println("");
              /*for (int i = 1; i <= 2; i++) 
              {
                 System.out.println("Informe a espécie do animal " + i);
                 String nome = entrada.nextLine();
                 System.out.println("Informe a cor do(a) " + nome);
                 String cor = entrada.nextLine();
                 System.out.println("Informe o tamanho do(a) " + nome);
                 double tam = entradadouble.nextDouble();
                 
                 arr.insert(nome, cor, tam);
                 System.out.println("*********************************");
              }*/
              
              arr.insert("Tiranossauro Rex", "vermelho", 10.5);
              arr.insert("Tricerátopo", "cinza", 9.5);
              arr.insert("Anhanguera", "preto", 13.0);
              arr.insert("Algoassauro", "marrom", 10.7);
              arr.insert("Velociraptor", "verde", 8.3);

              System.out.println(">> Sem ordenação:");
              arr.display();
              arr.bubbleSort();
              System.out.println(">> Com ordenação por Cor:");
              arr.display();
              
               System.out.println("Muito bem! Vamos fazer uma busca binária de uma cor? Digite:");
              
              int posicao = arr.findByCor(entrada.nextLine());           
              
              if (posicao != arr.size())
              {
                    System.out.println("Encontrei na posicao " + posicao);
                    arr.display(posicao);
              }
              else
              {
                    System.out.println("Não encontrado!");
              }
    }      
}
