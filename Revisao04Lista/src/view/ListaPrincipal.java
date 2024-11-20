package view;

import biblio.cassio.model.Lista;
import controller.ListaController;

public class ListaPrincipal {
	public static void main (String[] args) {
		
		Lista<Integer> lista = new Lista<>();
		ListaController listCon = new ListaController(lista);
		
		int[] vetor = {24, 23, 13, 33, 18, 3, 15, 29, 8, 9, 94, 14, 85, 38};
		
		
		try {
			listCon.popularLista(vetor);
			listCon.encontraMenor();
			listCon.consultaLista();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
