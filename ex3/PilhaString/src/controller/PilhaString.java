package controller;

public class PilhaString {
	//Classe da pilha
	 No topo; // topo da pilha

	 public PilhaString() {
	     topo = null; // pilha começa vazia
	 }

	 // Método para empilhar
	 public void push(String num) {
	     No novo = new No(); // cria novo nó
	     novo.valor = num;
	     if(isEmpty()) {
	    	 topo = novo ;
	    	 
	     }else {
	    	 novo.prox = topo;        // aponta para o topo atual
	         topo = novo; 
	     }
	                 
	 }

	 // Método para desempilhar
	 public String pop() throws Exception{
	     if (isEmpty()) {
	    	 throw new Exception("Pilha vazia");
	         
	     }
	     
	     String valor = topo.valor; // pega o valor do topo
	     topo = topo.prox;       // move o topo para o próximo
	     return valor;           // retorna o valor removido
	 }

	 // Ver topo
	 public String top() throws Exception {
		 if (isEmpty()) {
	    	 throw new Exception("Pilha vazia");
	         
	     }
		 
	     return topo.valor; // retorna o valor do topo
	 }

	 // Verificar se vazia
	 public boolean isEmpty() {
	     return (topo == null) ? true:false  ; // true se não tiver elementos
	 }

	 // Tamanho da pilha
	 public int size() {
	     int cont = 0;        // contador
	     No aux = topo;       // começa do topo
	     if (!isEmpty()) {
	    	 
	    	 cont++;
	    	 while (aux != null) { // percorre a pilha
	             cont++;           // soma 1
	             aux = aux.prox;   // vai para o próximo
	         }
	    	  }
	     
	     return cont; // retorna total
	 }
	}
	
	
	
	

