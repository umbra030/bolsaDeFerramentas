package ferramentas;

public abstract class Chave extends Ferramenta {

	public Chave(String nome, double tamanho, double peso) {
		super(nome, tamanho, peso);
	}
	
	@Override
    public String toString() {
        return "Chave: " + super.toString();
    }

}
