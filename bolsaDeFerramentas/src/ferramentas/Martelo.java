package ferramentas;

public abstract class Martelo extends Ferramenta {

	public Martelo(String nome, double tamanho, double peso) {
		super(nome, tamanho, peso);
	}
	
	@Override
    public String toString() {
        return "Martelo: " + super.toString();
    }

}
