package ferramentas;

public class MarteloBola extends Martelo implements Validavel {

    private static final double TAMANHO_MIN = 250.0;   // mm
    private static final double TAMANHO_MAX = 400.0;   // mm
    private static final double PESO_MIN = 0.5;        // kg
    private static final double PESO_MAX = 1.5;        // kg

    public MarteloBola(double tamanho, double peso) {
        super("Martelo bola", tamanho, peso);
    }

    public boolean tamanhoValido() {
        return verificarTamanho(TAMANHO_MIN, TAMANHO_MAX);
    }

    public boolean pesoValido() {
        return verificarPeso(PESO_MIN, PESO_MAX);
    }
}