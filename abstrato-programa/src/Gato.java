
public class Gato extends Animal {

	public Gato(String ruido) {
		super("Miaaauuuu, miaaau");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fazerRuido() {
		// TODO Auto-generated method stub
		System.out.println("Miar = " + this.getRuido());
	}

	@Override
	public void comer() {
		System.out.println("Come rato");
		// TODO Auto-generated method stub

	}

}
