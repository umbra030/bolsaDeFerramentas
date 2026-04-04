package ferramentas;

public class ChavePhillips extends Chave{
	
	private static final double TAMANHO_MIN = 75.0;
    private static final double TAMANHO_MAX = 250.0;
    private static final double PESO_MIN = 50.0;
    private static final double PESO_MAX = 200.0;

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
