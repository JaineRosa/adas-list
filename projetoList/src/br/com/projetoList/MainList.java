package br.com.projetoList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainList {

	public static void main(String[] args) {

		//declarar e inicializar  uma lista
		
		List<String> listaNomes = new ArrayList<String>();
		
		//Descobrindo o tamanho da lista
		
		System.out.println(listaNomes.size());
		
		//Aplicando o Crud
		//Create: Inserindo elementos
		
		listaNomes.add("Harry");
		listaNomes.add("Rony");
		listaNomes.add("Hermione");
		listaNomes.add("Luna");
	
		//Read: Listar os elementos
		System.out.println("-lista de presença-");
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
		
		//Encontrar o index de um elemento
		
		int indexAlterar = listaNomes.indexOf("Rony");
		int indexExcluir = listaNomes.indexOf("Luna");
		
		// Edit: Editar elementos7
		
		listaNomes.set(indexAlterar, "Rony Weasley");
		
		
		//Delete: remover elementos
		
		listaNomes.remove(indexExcluir);
		
		System.out.println("-----------");
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
		
		
		
	}

}
