package ferramentas;

public abstract class Broca extends Ferramenta {

	public Broca(String nome, double tamanho, double peso) {
		super(nome, tamanho, peso);
	}
	
	@Override
    public String toString() {
        return "Broca: " + super.toString();
    }

}
