package ferramentas;

public abstract class FerramentaPedreiro extends Ferramenta {

	public FerramentaPedreiro(String nome, double tamanho, double peso) {
		super(nome, tamanho, peso);
	}
	
	@Override
    public String toString() {
        return "Ferramenta de pedreiro: " + super.toString();
    }

}
