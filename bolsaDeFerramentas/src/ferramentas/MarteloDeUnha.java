package ferramentas;

public class MarteloDeUnha extends Martelo {

    private static final double TAMANHO_MIN = 250.0;   // mm
    private static final double TAMANHO_MAX = 350.0;   // mm
    private static final double PESO_MIN = 0.4;        // kg
    private static final double PESO_MAX = 1.0;        // kg

    public MarteloDeUnha(double tamanho, double peso) {
        super("Martelo de unha", tamanho, peso);
    }

    public boolean tamanhoValido() {
        return verificarTamanho(TAMANHO_MIN, TAMANHO_MAX);
    }

    public boolean pesoValido() {
        return verificarPeso(PESO_MIN, PESO_MAX);
    }
    
}