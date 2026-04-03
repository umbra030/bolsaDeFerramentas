package ferramentas;

public abstract class Ferramenta {
	
	private String nome;
	private double tamanho;
	private double peso;
	
	public Ferramenta(String nome, double tamanho, double peso) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
    public String toString() {
        return nome + " (Tamanho = " + tamanho + ", Peso = " + peso + ")";
    }

}
