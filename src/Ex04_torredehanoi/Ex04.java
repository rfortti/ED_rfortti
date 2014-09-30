/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex04_torredehanoi;

/**
 *
 * @author Multas
 */
import java.util.Scanner;

/* Utilizando os conhecimentos adquiridos até o momento e sua criatividade, crie 
um programa implementando pilha para alguma funcionalidade!!! */

public class Ex04 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n; // número de discos 
        
        // recebe o número de discos digitado pelo usuário 
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite o número de discos: "); 
        n = entrada.nextInt(); 
        
        // executa o hanoi! 
        TorreDeHanoi.hanoi(n, 1, 3, 2);
    }
    
}
