
public abstract class Animal {
	private String ruido; // atributo de classe abstata

	public void setRuido(String ruido) {
		this.ruido = ruido;
	}

	public Animal(String ruido) { // construtor
		this.ruido = ruido;
	}

	public abstract void fazerRuido();// m�todos abstratos

	public abstract void comer();

	// get e set
	public String getRuido() {
	return ruido;

}

}
