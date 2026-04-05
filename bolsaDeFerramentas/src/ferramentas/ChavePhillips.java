package ferramentas;

public class ChavePhillips extends Chave implements Validavel {
	
	private static final double TAMANHO_MIN = 100.0;
    private static final double TAMANHO_MAX = 250.0;
    private static final double PESO_MIN = 0.2;
    private static final double PESO_MAX = 0.6;

	public ChavePhillips(double tamanho, double peso) {
		super("Chave Phillips (cruzada)", tamanho, peso);
	}
	
	@Override
    public String toString() {
        return "Chave: " + super.toString();
    }
	
	public boolean tamanhoValido() {
        return verificarTamanho(TAMANHO_MIN, TAMANHO_MAX);
    }

    public boolean pesoValido() {
        return verificarPeso(PESO_MIN, PESO_MAX);
    }

}
