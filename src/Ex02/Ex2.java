/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex02;

/**
 *
 * @author Janaina
 */
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ex2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>(); //Vetor de Objetos
        
        for (int i = 0; i < 3; i++)
        {
            Pessoa p;
        
            p = new Pessoa();
        
            //System.out.printf("Informe um Nome: ");
            String nome = JOptionPane.showInputDialog("Informe um Nome:").toUpperCase();
            //String nome = scan.nextLine();
            //JOptionPane.showMessageDialog(null, "Hello " + nome);
        
            //System.out.printf("Informe a Idade: ");
            String idade = JOptionPane.showInputDialog("Informe a Idade:");
            //int idade = scan.nextInt();
            //JOptionPane.showMessageDialog(null, Integer.parseInt(idade));
        
            //System.out.printf("Informe a Profissão: ");
            String profissao = JOptionPane.showInputDialog("Informe a Profissão:").toUpperCase();
            //String profissao = scan.nextInt();
            //JOptionPane.showMessageDialog(null, profissao);
        
            p.setNome(nome);
            p.setIdade(Integer.parseInt(idade));
            p.setProfissao(profissao);
            lista.add(p);//armazena em cada posição do Vetor
        }
        
        String msg = "[ Lista de Pessoas no Vetor: ]\n\n";
        for (int i = 0; i < lista.size(); i++) // lista.size = verifica quantas posições tem o Vetor
        {
            msg += "Posição [" + i + "] " + "do Vetor:\n";
            msg += "Nome: " + lista.get(i).getNome() + "\n";
            msg += "Idade: " + lista.get(i).getIdade() + "\n";
            msg += "Profissão: " + lista.get(i).getProfissao() + "\n\n";
        }
        
        //System.out.printf(msg);
        JOptionPane.showMessageDialog(null, msg, "Exercício 02 - Roberto Forti", JOptionPane.INFORMATION_MESSAGE);
    }  
}
