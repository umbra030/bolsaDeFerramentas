package ferramentas;

public class BrocaParaMadeira extends Broca{
	
	private static final double TAMANHO_MIN = 3.0;
    private static final double TAMANHO_MAX = 12.0;
    private static final double PESO_MIN = 10.0;
    private static final double PESO_MAX = 70.0;

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
