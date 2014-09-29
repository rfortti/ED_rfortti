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
public class Pessoa 
{
    private String nome;
    private int idade;
    private String profissao;
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    public String getProfissao()
    {
        return this.profissao;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public void setProfissao(String profissao)
    {
        this.profissao = profissao;
    }
} 
