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
public class TorreDeHanoi // método Construtor
{
    // Método que realiza (imprime) o movimento de um disco entre dois pinos
    private static void mover(int pO, int pD) 
    {
        System.out.println(pO + " -> " + pD);
    }
    // Método que implementa a recursão 
    // pO = pino origem 
    // pD = pino destino 
    // pT = pino de trabalho

    static void hanoi(int n, int pO, int pD, int pT) 
    {
        if (n > 0) 
        { 
            hanoi(n - 1, pO, pT, pD); 
            mover(pO, pD); 
            hanoi(n - 1, pT, pD, pO); 
        }
    }
}
