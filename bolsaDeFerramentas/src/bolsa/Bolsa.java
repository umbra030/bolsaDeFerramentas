package bolsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ferramentas.Ferramenta;

public class Bolsa {
	
	private List<Ferramenta> ferramentas;
	
	public Bolsa() {
		this.ferramentas = new ArrayList<>();
	}

	public List<Ferramenta> getFerramentas() {
		return ferramentas;
	}

	public void setFerramentas(List<Ferramenta> ferramentas) {
		this.ferramentas = ferramentas;
	}
	
	// Adicionar ferramenta
	public void adicionarFerramenta(Ferramenta ferramenta) {
		if(ferramenta != null) {
			this.ferramentas.add(ferramenta);
			System.out.println(ferramenta.getNome() + " adicionada à bolsa.");
		}
	}
	
	// Remover ferramenta
	public void removerFerramenta(Ferramenta ferramenta) {
		if(this.ferramentas.remove(ferramenta)) {
			System.out.println(ferramenta.getNome() + " removida da bolsa.");
		} else {
			System.out.println("Ferramenta não encontrada.");
		}
	}
	
	// Listar ferramentas
	public void listarFerramentas() {
		if(ferramentas.isEmpty()) {
			System.out.println("A bolsa está vazia.");
		} else {
			System.out.println("\nFerramentas na bolsa: ");
			for(Ferramenta f: ferramentas) {
				System.out.println("- " + f);
			}
		}
	}

	// Buscar ferramenta por nome
	public Ferramenta buscarPorNome(String nome) {
		for(Ferramenta f : ferramentas) {
			if(f.getNome().equalsIgnoreCase(nome)) {
				return f;
			}
		}
		return null;
	}

	// Organizar ferramentas por peso
	public void organizarPorPeso() {
		Collections.sort(ferramentas, Comparator.comparingDouble(Ferramenta::getPeso));
		System.out.println("Ferramentas organizadas por peso.");
	}

	// Organizar ferramentas por tamanho
	public void organizarPorTamanho() {
		Collections.sort(ferramentas, Comparator.comparingDouble(Ferramenta::getTamanho));
		System.out.println("Ferramentas organizadas por tamanho.");
	}
	
	public boolean vazia() {
		return ferramentas.isEmpty();
	}
}