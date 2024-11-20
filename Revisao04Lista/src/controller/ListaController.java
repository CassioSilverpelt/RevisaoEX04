package controller;

import biblio.cassio.model.Lista;

public class ListaController {
	
	Lista<Integer> lista = new Lista<>();
	
	public ListaController(Lista<Integer> lista) {
		this.lista = lista;
	}
	
	public void popularLista(int[] vetor) {
		int tamanho = vetor.length;
		for (int i = 0; i < tamanho; i++) {
			lista.addLast(vetor[i]);
		}
	}
	
	public void consultaLista() {
		int tamanho = lista.size();
		for (int i = 0; i < tamanho; i++) {
			try {
				System.out.print(lista.get(i) + " ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void encontraMenor() throws Exception {
		int tamanho = lista.size();
		int menor = lista.get(0);
		for (int i = 0; i < tamanho; i++) {
			if (lista.get(i) < menor) {
				menor = lista.get(i);
			}
		}
		for (int i = 0; i < tamanho; i++) {
			if (lista.get(i) == menor) {
				lista.remove(i);
				lista.addFirst(menor);
			}
		}
		
	}
	
}
