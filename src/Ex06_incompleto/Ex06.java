/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex06_incompleto;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex06 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int maxSize = 5;
        Estrutura e = new Estrutura(maxSize); 
        Scanner entInt = new Scanner(System.in);
        Scanner entString = new Scanner(System.in);
        
        String nome;
        int prior;
        
        while(true)
        {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Para Inserir Paciente: ");
            System.out.println("2 - Para Chamar o próximo: ");
            System.out.println("3 - Para Sair do Sistema: ");
            int opcao = entInt.nextInt();
            
            switch(opcao)
            {
                case 1:
                {
                    System.out.println("Digite o nome do paciente: ");
                    nome = entString.nextLine();
                    System.out.println("Digite a prioridade do paciente: ");
                    prior = entInt.nextInt();
                    
                    if(e.isFull())
                    {
                        System.out.println("Não há espaço !");
                    }
                    else
                    {
                        e.insert(prior);
                    }
                    break;
                }
            }
        }
    }
}
