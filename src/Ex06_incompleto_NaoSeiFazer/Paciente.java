/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex06_incompleto_NaoSeiFazer;

/**
 *
 * @author Aluno
 */
public class Paciente 
{
    private String nome;
    private int prior;
    
    public Paciente (String n, int p) //método construtor
    {
        nome = n;
        prior = p;
    }
    
    public void displayPaciente()
    {
        System.out.println("Nome do Paciente: " + nome);
        System.out.println("......Prioridade: " + prior);
    }
    
    public String getNome()           
    { 
        return nome; 
    }
   
    public int getPrioridade()           
    { 
        return prior; 
    }
}
