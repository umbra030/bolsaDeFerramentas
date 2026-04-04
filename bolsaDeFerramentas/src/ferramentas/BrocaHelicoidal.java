package ferramentas;

public class BrocaHelicoidal extends Broca{
	
	private static final double TAMANHO_MIN = 1.0;
    private static final double TAMANHO_MAX = 13.0;
    private static final double PESO_MIN = 5.0;
    private static final double PESO_MAX = 100.0;


	public BrocaHelicoidal(String nome, double tamanho, double peso) {
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
