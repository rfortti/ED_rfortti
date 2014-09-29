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
public class EstruturaDados 
{
   private Animais[] a; // criamos a referência para um vetor tipo Animais
   private int nElems; // nElems controla quantos elementos o vetor terá ...
//--------------------------------------------------------------
   public EstruturaDados(int max) // Método construtor
   {
      a = new Animais[max]; // Instancia um novo array
      nElems = 0; // coloca no inicio a variavel nElems c/ zero elemento
   }
//--------------------------------------------------------------
   public int size() // Método que retorna quantidade de itens do vetor ....
   { 
       return nElems; 
   }
//--------------------------------------------------------------   
   public int findByCor(String searchKey) // Método de pesquisa binária com String
   {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
      {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn].getCor().equals(searchKey)) //mudamos aqui para comparar nome
            return curIn; // encontrei!
         else if(lowerBound > upperBound)
            return nElems; // não pude encontra-lo
         else // divide o range
         {
             //O metodo compareTo do tipo String, retorna positivo se a primeira
             //String for maior que a segunda e negativo se for o contrário
            if(a[curIn].getCor().compareTo(searchKey) < 0) //mudamos aqui para comparar nome
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
         }  // fim do else de divisão de range
      }  // fim do while
   }  // fim do método de pesquisa binária()  
//-------------------------------------------------------------- 
   public int findByTamanho(double searchKey) // Método de pesquisa binária com String
   {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn].getTamanho() == (searchKey)) //mudamos aqui para comparar nome
            return curIn; // encontrei!
         else if(lowerBound > upperBound)
            return nElems; // não pude encontra-lo
         else // divide o range
            {
             //O metodo compareTo do tipo String, retorna positivo se a primeira
             //String for maior que a segunda e negativo se for o contrário
            if(a[curIn].getTamanho() < (searchKey)) //mudamos aqui para comparar nome
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
   }  // fim do método de pesquisa binária()  
//-------------------------------------------------------------- 
   public void insert(String n, String c, double t) // insere o elemento no vetor (inserção DESORDENADA)
   {      
      a[nElems] = new Animais(n, c, t); // insere o elemento na posição necessária
      nElems++; // incrementa a variavel de controle de tamanho
   }  // finaliza o método de inserção
//--------------------------------------------------------------
   public void bubbleSort() // Rotina de Ordenação pelo método Bolha (BubbleSort)
   {
      int out, in;

      for(out=nElems-1; out>1; out--)   // este for roda até que tenhamos certeza que até o primeiro item esta ordenado
         for(in=0; in<out; in++)        // este for que irá caminhar uma posição a direita comparando os itens
            if(a[in].getCor().compareTo(a[in+1].getCor()) > 0 )       // out aqui que comparamos um valor com o outro e quado o da esquerda for maior
               swap(in, in+1);          // nós chamamos o método que faz a troca.
   }
//--------------------------------------------------------------
   public void display() // mostra todo o conteúdo do vetor
   {
      for(int j=0; j<nElems; j++)      
         a[j].displayAnimal();
   }
//--------------------------------------------------------------
   public void display(int posicao) // mostra uma posição específica do vetor
   {
       a[posicao].displayAnimal();
   }
//--------------------------------------------------------------
   private void swap(int one, int two) //Simples rotina onde é efetuada a troca!!!
   {
      Animais temp = a[one];
      a[one] = a[two];
      a[two] = temp;
   }
//--------------------------------------------------------------
}
