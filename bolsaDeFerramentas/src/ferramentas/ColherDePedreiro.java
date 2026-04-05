package ferramentas;

public class ColherDePedreiro extends FerramentaPedreiro implements Validavel {

    private static final double TAMANHO_MIN = 200.0;   // mm
    private static final double TAMANHO_MAX = 350.0;   // mm
    private static final double PESO_MIN = 0.3;        // kg
    private static final double PESO_MAX = 0.8;        // kg

    public ColherDePedreiro(double tamanho, double peso) {
        super("Colher de pedreiro", tamanho, peso);
    }

    public boolean tamanhoValido() {
        return verificarTamanho(TAMANHO_MIN, TAMANHO_MAX);
    }

    public boolean pesoValido() {
        return verificarPeso(PESO_MIN, PESO_MAX);
    }
    
}