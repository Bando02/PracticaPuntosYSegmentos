package clases;

public class Segmento {
	
	Punto a;
	Punto b;
	
	/**
	 * Constructor por defecto que crea un Segmento con ambos puntos
	 * 
	 */
	public Segmento() {
			
		a = new Punto();
		b = new Punto(1,1);
	}
	
	/**
	 * Constructor que crea segmento segun los puntos que se pase por parametros
	 * 
	 * @param a
	 * @param b
	 */
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	
	
	/**
	 * metodo que al ingresar un segmento calcula la distancia de ambos puntos
	 * 
	 * @param segmento
	 * @return
	 */
	public double distancia(Segmento segmento) {
		
		double distancia = Math.sqrt(Math.pow(b.getX() - a.getX(), 2)+Math.pow(b.getY() - a.getY(), 2));
		return distancia;
	}
	
	
	/**
	 * Funcion que devuelve el valor del punto a
	 * 
	 * @return
	 */
	public Punto getA() {
		return a;
	}
	
	/**
	 * Funcion que devuelve el valor del punto b 
	 * 
	 * @return
	 */
	public Punto getB() {
		return b;
	}
	
	/**
	 * Metodo que añade el valor del punto a
	 * 
	 * @param a
	 */
	public void setA(Punto a) {
		this.a = a;
	}
	
	/**
	 * Metodo que añade el valor del punto b
	 * 
	 * @param b
	 */
	public void setB(Punto b) {
		this.b = b;
	}
	
	/**
	 * Metodo toString que devuelve los valores de ambos puntos
	 * 
	 */
	@Override
	public String toString() {
		return"["+a.toString()+","+b.toString()+"]";
	}
	

}
