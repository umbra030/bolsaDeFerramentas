package ferramentas;

public class BrocaParaMadeira extends Broca implements Validavel {
	
	private static final double TAMANHO_MIN = 5.0;
    private static final double TAMANHO_MAX = 20.0;
    private static final double PESO_MIN = 0.05;
    private static final double PESO_MAX = 0.2;

	public BrocaParaMadeira(double tamanho, double peso) {
		super("Broca para madeira", tamanho, peso);
	}
	
	@Override
    public String toString() {
        return "Broca: " + super.toString();
    }
	
	public boolean tamanhoValido() {
        return verificarTamanho(TAMANHO_MIN, TAMANHO_MAX);
    }

    public boolean pesoValido() {
        return verificarPeso(PESO_MIN, PESO_MAX);
    }
    
}
