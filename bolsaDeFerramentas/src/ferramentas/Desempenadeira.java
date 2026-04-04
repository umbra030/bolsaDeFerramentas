package ferramentas;

public class Desempenadeira extends FerramentaPedreiro {

    private static final double TAMANHO_MIN = 250.0;   // mm
    private static final double TAMANHO_MAX = 400.0;   // mm
    private static final double PESO_MIN = 0.4;        // kg
    private static final double PESO_MAX = 1.0;        // kg

    public Desempenadeira(double tamanho, double peso) {
        super("Desempenadeira", tamanho, peso);
    }

    public boolean tamanhoValido() {
        return verificarTamanho(TAMANHO_MIN, TAMANHO_MAX);
    }

    public boolean pesoValido() {
        return verificarPeso(PESO_MIN, PESO_MAX);
    }
    
}