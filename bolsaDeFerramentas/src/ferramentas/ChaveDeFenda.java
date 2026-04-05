package ferramentas;

public class ChaveDeFenda extends Chave implements Validavel {
	
	private static final double TAMANHO_MIN = 75.0;   // mm
    private static final double TAMANHO_MAX = 300.0;  // mm
    private static final double PESO_MIN = 0.2;      // Kg
    private static final double PESO_MAX = 0.6;     // Kg


	public ChaveDeFenda(double tamanho, double peso) {
		super("Chave de fenda (reta)", tamanho, peso);
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
