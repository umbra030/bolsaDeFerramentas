package bolsa;

import java.util.ArrayList;
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
	
	public void adicionarFerramenta(Ferramenta ferramenta) {
		if(ferramenta != null) {
			this.ferramentas.add(ferramenta);
		}
	}
	
	public void removerFerramenta(Ferramenta ferramenta) {
		this.ferramentas.remove(ferramenta);
	}
	
	public void listarFerramentas() {
		if(ferramentas.isEmpty()) {
			System.out.println("A bolsa está vazia.");
		} else {
			System.out.println("\n\nFerramentas na bolsa: ");
			for(Ferramenta f: ferramentas) {
				System.out.println("\n- " + f);
			}
		}
	}

}
