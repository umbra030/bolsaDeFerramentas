package ferramentas;

public class MarteloDePedreiro extends FerramentaPedreiro implements Validavel {

    private static final double TAMANHO_MIN = 250.0;   // mm
    private static final double TAMANHO_MAX = 400.0;   // mm
    private static final double PESO_MIN = 1.0;        // kg
    private static final double PESO_MAX = 3.0;        // kg

    public MarteloDePedreiro(double tamanho, double peso) {
        super("Martelo de pedreiro", tamanho, peso);
    }

    public boolean tamanhoValido() {
        return verificarTamanho(TAMANHO_MIN, TAMANHO_MAX);
    }

    public boolean pesoValido() {
        return verificarPeso(PESO_MIN, PESO_MAX);
    }
}