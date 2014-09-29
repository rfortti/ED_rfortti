/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package equipebasquete;

/**
 *
 * @author Roberto Forti
 */
public class Estrutura 
{
    private Jogador[] a; // cria a referência para um vetor do tipo Pessoa
    private int nElems; // nElems controla quantos elementos o vetor terá ...
//--------------------------------------------------------------

    public Estrutura(int max) // método construtor
    {
        a = new Jogador[max]; // cria o vetor ...
        nElems = 0; // inicialmente sem itens ...
    }

//--------------------------------------------------------------
//Método que retorna quantidade de itens do vetor ....
//--------------------------------------------------------------
    public int size() 
    {
        return nElems;
    }

//--------------------------------------------------------------
//Método de pesquisa binária por idade 
//--------------------------------------------------------------
    public int findByIdade(int searchKey) 
    {
        int upperBound = 0;
        int lowerBound = nElems - 1;
        int curIn;

       while (true) 
       {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn].getIdade() == searchKey) //mudamos aqui para comparar nome
            {
                //Se encontrou, ele irá rodar pra cima e pra baixo, imprimindo os valores
                for (int i = curIn; (a[i].getIdade() == searchKey); i++) 
                { //mudado p/desafio
                    a[i].displayJogador(); //mudado p/ imprimir todos os dados da pessoa
                    System.out.println("==============================================");
                }
                for (int j = curIn - 1; (a[j].getIdade() == searchKey); j--) 
                { //mudado p/ desafio
                    a[j].displayJogador();//mudado p/ imprimir todos os dados da pessoa
                    System.out.println("==============================================");
                }
                return curIn;
            } 
            else if (lowerBound > upperBound) 
            {
                System.out.println("Não foi encontrado");
                return curIn;
            }// não pude encontra-lo
            else // divide o range
            {
             //O metodo compareTo do tipo String, retorna positivo se a primeira
                //String for maior que a segunda e negativo se for o contrário
                if (a[curIn].getIdade() < searchKey) //mudamos aqui para comparar nome
                {
                    lowerBound = curIn + 1; // esta na metade de cima
                } 
                else 
                {
                    upperBound = curIn - 1; // esta na metade de baixo
                }
            }  // fim do else de divisão de range
        }  // fim do while
    }  // fim do método de pesquisa binária()  
//--------------------------------------------------------------
//Método de pesquisa binária para imprimir valores iguais   POR idade
//--------------------------------------------------------------
    public boolean findAd(String searchKey) 
    {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) 
        {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn].getNome().charAt(0) == searchKey.charAt(0)) 
            {  //mudado p/ desafio ...
                //Se encontrou, ele irá rodar pra cima e pra baixo, imprimindo os valores
                for (int i = curIn; (a[i].getNome().charAt(0) == searchKey.charAt(0)); i++) 
                { //mudado p/desafio
                    a[i].displayJogador(); //mudado p/ imprimir todos os dados da pessoa
                    System.out.println("==============================================");
                }
                for (int j = curIn - 1; (a[j].getNome().charAt(0) == searchKey.charAt(0)); j--) 
                { //mudado p/ desafio
                    a[j].displayJogador();//mudado p/ imprimir todos os dados da pessoa
                    System.out.println("==============================================");
                }
                return true;
            } 
            else if (lowerBound > upperBound) 
            {
                return false;
            } 
            else // divide o range
            {
                //O metodo compareTo do tipo String, retorna positivo se a primeira
                //String for maior que a segunda e negativo se for o contrário
                if (a[curIn].getNome().compareTo(searchKey) < 0) //mudado aqui p/ desafio
                {
                    lowerBound = curIn + 1; // esta na metade de cima
                } 
                else 
                {
                    upperBound = curIn - 1; // esta na metade de baixo
                }
            }  // fim do else de divisão de range
        }  // fim do while
    }  // fim do método de pesquisa binária()  

//--------------------------------------------------------------
//Método de linear  por nome!!! ....
//--------------------------------------------------------------
    public boolean find(String searchKey) { // metodo buscará o valor que a classe usuaria pedir ...
        int j;
        for (j = 0; j < nElems; j++) // varrerá o vetor buscando ...
        {
            if (a[j].getNome().equals(searchKey)) // encontrou o item?
            {
                break; // sai do for antes de finalizar ...
            }
        }
        if (j == nElems) // precisou chegar no final??
        {
            return false; // se sim, retorna falso
        } 
        else 
        {
            return true; // se não, encontrou ...
        }
    }  // fim da busca

//--------------------------------------------------------------
//Método de inserção ORDENADA por idade!!! ....
//--------------------------------------------------------------
    public void insert(String name, int age, float height) // insere o elemento no vetor
    {
        int j = 0;
        for (j = 0; j < nElems; j++) // localiza onde esse elemento se encaixa
        //usamos aqui o metodo compareTo para String
        {
            if (a[j].getIdade() > age) //mudado
            {
                break;
            }
        }
        for (int k = nElems; k > j; k--) // move os elementos maiores uma posição p/ frente
        {
            a[k] = a[k - 1];
        }
        //Apos abrir um espaço no lugar certo, ele cria o nome objeto Pessoa na posição aberta!!!
        a[j] = new Jogador(name, age, height); // insere o elemento na posição necessária
        nElems++; // incrementa a variavel de controle de tamanho
    }  // finaliza o método de inserção

//--------------------------------------------------------------
//Método de remoção ....
//--------------------------------------------------------------
    public boolean delete(int value) {
        int j = findByIdade(value);        //Utiliza a busca binária para remover!!!
        if (j == nElems) // caso não encontre, retorna false!
        {
            return false;
        } else // caso encontre...
        {
            for (int k = j; k < nElems; k++) // move os elementos uma posição pra tras
            {
                a[k] = a[k + 1];
            }
            nElems--; // decrementa o tamanho
            return true;
        }
    }  // finaliza remoção

//--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------
    public void display() // mostra o conteúdo do vetor
    {
        for (int j = 0; j < nElems; j++) 
        {
            a[j].displayJogador();
        }
    }
    //----------------------------------------------------------
}