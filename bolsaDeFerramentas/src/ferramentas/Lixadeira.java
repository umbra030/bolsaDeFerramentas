package ferramentas;

public class Lixadeira extends FerramentaElétrica implements Validavel {

    private static final double TAMANHO_MIN = 250.0;   // mm
    private static final double TAMANHO_MAX = 450.0;   // mm
    private static final double PESO_MIN = 1.2;        // kg
    private static final double PESO_MAX = 4.0;        // kg

    public Lixadeira(double tamanho, double peso) {
        super("Lixadeira elétrica", tamanho, peso);
    }

    public boolean tamanhoValido() {
        return verificarTamanho(TAMANHO_MIN, TAMANHO_MAX);
    }

    public boolean pesoValido() {
        return verificarPeso(PESO_MIN, PESO_MAX);
    }
    
}