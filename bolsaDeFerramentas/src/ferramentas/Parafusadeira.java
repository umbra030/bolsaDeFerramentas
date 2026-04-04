package ferramentas;

public class Parafusadeira extends FerramentaElétrica {

    private static final double TAMANHO_MIN = 150.0;   // mm
    private static final double TAMANHO_MAX = 300.0;   // mm
    private static final double PESO_MIN = 0.8;        // kg
    private static final double PESO_MAX = 2.0;        // kg

    public Parafusadeira(double tamanho, double peso) {
        super("Parafusadeira elétrica", tamanho, peso);
    }

    public boolean tamanhoValido() {
        return verificarTamanho(TAMANHO_MIN, TAMANHO_MAX);
    }

    public boolean pesoValido() {
        return verificarPeso(PESO_MIN, PESO_MAX);
    }
    
}