package ferramentas;

public class ChaveInglesa extends Chave implements Validavel {
	
	private static final double TAMANHO_MIN = 100.0;
    private static final double TAMANHO_MAX = 250.0;
    private static final double PESO_MIN = 0.3;
    private static final double PESO_MAX = 1.0;

	public ChaveInglesa(double tamanho, double peso) {
		super("Chave Inglesa (ajustável)", tamanho, peso);
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
