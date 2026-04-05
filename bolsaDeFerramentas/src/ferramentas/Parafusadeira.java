package ferramentas;

public class Parafusadeira extends FerramentaElétrica implements Validavel {

    private static final double TAMANHO_MIN = 180.0;   // mm
    private static final double TAMANHO_MAX = 350.0;   // mm
    private static final double PESO_MIN = 0.8;        // kg
    private static final double PESO_MAX = 2.5;        // kg

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