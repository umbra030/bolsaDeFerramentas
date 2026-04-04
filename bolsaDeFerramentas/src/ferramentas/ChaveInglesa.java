package ferramentas;

public class ChaveInglesa extends Chave{
	
	private static final double TAMANHO_MIN = 100.0;
    private static final double TAMANHO_MAX = 300.0;
    private static final double PESO_MIN = 150.0;
    private static final double PESO_MAX = 600.0;

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
