package ferramentas;

public class BrocaConcreto extends Broca implements Validavel {
	
	private static final double TAMANHO_MIN = 6.0;
    private static final double TAMANHO_MAX = 30.0;
    private static final double PESO_MIN = 0.1;
    private static final double PESO_MAX = 0.4;

	public BrocaConcreto(double tamanho, double peso) {
		super("Broca de vídea (para concreto/alvenaria)", tamanho, peso);
	}
	
	@Override
    public String toString() {
        return "Broca: " + super.toString();
    }
	
	public boolean tamanhoValido() {
        return verificarTamanho(TAMANHO_MIN, TAMANHO_MAX);
    }

    public boolean pesoValido() {
        return verificarPeso(PESO_MIN, PESO_MAX);
    }

}
