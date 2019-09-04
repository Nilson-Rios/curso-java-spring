
public class Calculadora implements Calculos {

	@Override
	public Double soma(Double x, Double y) {
		return x + y;
	}

	@Override
	public Double subtracao(Double x, Double y) {
		return x - y;
	}

	@Override
	public Double multiplicacao(Double x, Double y) {
		return x * y;

	}

}
