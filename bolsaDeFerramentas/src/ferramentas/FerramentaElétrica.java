package ferramentas;

public abstract class FerramentaElétrica extends Ferramenta {

	public FerramentaElétrica(String nome, double tamanho, double peso) {
		super(nome, tamanho, peso);
	}
	
	@Override
    public String toString() {
        return "Ferramenta elétrica: " + super.toString();
    }

}
