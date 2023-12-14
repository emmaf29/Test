package ciu.objetos2.patterns.mvc.rest.model;

public class Cuchillo extends Arma {

	private static final Integer POTENCIA_DESTRUCTIVA = Integer.valueOf(1);

	public Cuchillo(Integer puntosDeHonor) {
		super(puntosDeHonor, POTENCIA_DESTRUCTIVA);
	}

}
