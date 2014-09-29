/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula1_desafio;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Aula1_Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String[] aluno = new String[5];
        Scanner scan = new Scanner(System.in);      
                
        for (int i=0; i<5; i++)
        {
            System.out.println("Digite o nome do " + (i+1) + "o Aluno:");
            aluno[i] = scan.nextLine();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Digite a 1a letra do nome para pesquisar:");
        String letra = scan.nextLine(); 
        
        for (int i=0; i<5; i++)
        {
            if (aluno[i].charAt(0) == letra.charAt(0)) // chart(0) pega a primeira posição da string no vetor 
            {
                System.out.println("Posiçao[" + i +"] = " + aluno[i]);
            }
            else
            {
                System.out.println("Posiçao[" + i +"] = Nao existe nome com essa letra!");
            }
        }
    }  
}
