package ferramentas;

public class BrocaConcreto extends Broca{
	
	private static final double TAMANHO_MIN = 4.0;
    private static final double TAMANHO_MAX = 12.0;
    private static final double PESO_MIN = 15.0;
    private static final double PESO_MAX = 100.0;

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
