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
public class Animais 
{
    private String nome;
    private String cor;
    private double tamanho;
    
    public Animais(String n, String c, double t) // método construtor
    {
        nome = n;
        cor = c;
        tamanho = t;
    }
    
    public void displayAnimal()
    {
        System.out.println("Espécie de Animal: " + nome);
        System.out.println("..............Cor: " + cor);
        System.out.println("..........Tamanho: " + tamanho);
    }
    
    public String getNome()           
    { 
        return nome; 
    }
   
    public String getCor()           
    { 
        return cor; 
    }
    
    public double getTamanho()           
    { 
        return tamanho; 
    }
}
