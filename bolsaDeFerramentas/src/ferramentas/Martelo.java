package ferramentas;

public abstract class Martelo extends Ferramenta {

	public Martelo(String nome, double tamanho, double peso) {
		super(nome, tamanho, peso);
	}
	
	@Override
    public String toString() {
        return "Martelo: " + super.toString();
    }
	
	protected boolean verificarTamanho(double min, double max) {
        return getTamanho() >= min && getTamanho() <= max;
    }

    protected boolean verificarPeso(double min, double max) {
        return getPeso() >= min && getPeso() <= max;
    }

}
