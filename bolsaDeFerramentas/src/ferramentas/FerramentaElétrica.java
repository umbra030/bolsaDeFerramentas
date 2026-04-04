package ferramentas;

public abstract class FerramentaElétrica extends Ferramenta {

	public FerramentaElétrica(String nome, double tamanho, double peso) {
		super(nome, tamanho, peso);
	}
	
	@Override
    public String toString() {
        return "Ferramenta elétrica: " + super.toString();
    }
	
	protected boolean verificarTamanho(double min, double max) {
        return getTamanho() >= min && getTamanho() <= max;
    }

    protected boolean verificarPeso(double min, double max) {
        return getPeso() >= min && getPeso() <= max;
    }

}
