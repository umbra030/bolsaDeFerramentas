package ferramentas;

public class BrocaHelicoidal extends Broca implements Validavel {
	
	private static final double TAMANHO_MIN = 5;
    private static final double TAMANHO_MAX = 25;
    private static final double PESO_MIN = 0.05;
    private static final double PESO_MAX = 0.25;


	public BrocaHelicoidal(double tamanho, double peso) {
		super("Broca helicoidal (Torção)", tamanho, peso);
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
