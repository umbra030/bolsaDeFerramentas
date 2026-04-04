package ferramentas;

public class ChaveDeFenda extends Chave{
	
	private static final double TAMANHO_MIN = 75.0;   // mm
    private static final double TAMANHO_MAX = 300.0;  // mm
    private static final double PESO_MIN = 50.0;      // g
    private static final double PESO_MAX = 250.0;     // g


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
