/**
 * 
 * @author Sergio Castillo
 * @version 1.2
 */
public class Rectangulo_SCV extends FiguraGeometrica_SCV {
	private double l1;
	private double l2;
	/**
	 * Es el constructor de la figura geom�trica
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_SCV(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	@Override
	/**
	 * @return el area del rect�ngulo
	 */
	public double area() {
		return l1 * l2;
	}
	
	@Override
	/**
	 * @return el per�metro del rect�ngulo
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
