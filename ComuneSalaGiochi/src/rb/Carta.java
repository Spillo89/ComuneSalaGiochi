package rb;


public class Carta {

	/**
	 * @param args
	 */
	private String valore; 	// valore della carta (asso, 2, 3, ... )
	private String seme; 	// valore del seme (bastoni, spade, ..)
	
	// costruttore dei 2 argomenti
	public Carta ( String valoreCarta, String semeCarta){
		valore 	= valoreCarta; 	// assegno valore al valoreCarta preso da parametro
		seme	= semeCarta;	// assegno seme al semeCarta preso da parametro
	}
	
	// restituisco la carta
	public String toString(){
		return valore + " di "+ seme;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

	public String getSeme() {
		return seme;
	}

	public void setSeme(String seme) {
		this.seme = seme;
	}
}
