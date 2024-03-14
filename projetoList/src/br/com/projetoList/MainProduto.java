package br.com.projetoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcao;
		String adicionar, alterar, alterado, excluir;
		List<String> listaProdutos = new ArrayList<String>();

		do {

			System.out.println("---------------------");
			System.out.println("Menu de opções");
			System.out.println("[1] Adicionar Produto     ");
			System.out.println("[2] Lista de Produtos     ");
			System.out.println("[3] Alterar Produto     ");
			System.out.println("[4] Excluir  Produto     ");
			System.out.println("[0] Sair");
			System.out.println("---------------------");
			opcao = scan.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("/nInforme o Produto para adicionar: ");
				adicionar = scan.next();
				listaProdutos.add(adicionar);

				System.out.println("/nProduto adicionado com sucesso");

				break;

			case 2:

				if (listaProdutos.size() > 0) {
					System.out.println("/nLista de produtos");

					for (String nomeProduto : listaProdutos) {
						System.out.println(nomeProduto);
					}
				} else {
					System.out.println("/nNenhum produto cadastrado ainda ...");
				}
				System.out.println("/n");

				break;

			case 3:
				System.out.println("/nInforme o produto para alterar? ");
				alterar = scan.next();
				int indexAlterar = listaProdutos.indexOf(alterar);

				if (indexAlterar >= 0) {
					System.out.println("/nInforme o novo nome do produto?");
					alterado = scan.next();
					listaProdutos.set(indexAlterar, alterado);

					System.out.println("/nProduto alterado com sucesso");
				} else {
					System.out.println("/nProduto não encontrado");
				}

				break;

			case 4:

				System.out.println("/nInforme o nome do produto para excluir");
				excluir = scan.next();
				int indexExcluir = listaProdutos.indexOf(excluir);
				listaProdutos.remove(indexExcluir);

				System.out.println("/nProduto excluido");

				break;

			case 0:

				System.out.println("/nSaindo do menu!!");

			}

		} while (opcao != 0);

		scan.close();

	}

}
