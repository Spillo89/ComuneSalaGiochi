package rb;

import java.util.*;

public class MazzoDiCarte {

	/**
	 * @param args
	 */
	private Carta mazzo[]; //array oggetti delle carte
	private int proxcarta;
	private final int NUM_CARTE=40; //numero delle carte nel mazzo
	private Random numCasuale; // genera numeri casuali

	//costruttore che riempie il mazzo di carte

	public MazzoDiCarte(){

		String valori[] = {"Asso", "due", "tre", "quattro", "cinque", "sei", "sette",
				"fante", "cavallo", "re"};
		String semi[] 	= {"Bastoni","Spade","Coppe","Denari"};

		 mazzo = new Carta[NUM_CARTE]; // array di OGGETTI carta
		proxcarta = 0;
		numCasuale = new Random();

		// riempio il mazzo di oggetti carta 
		for(int i=0; i<mazzo.length; i++){
			mazzo[i]= new Carta(valori[i%10],semi[i/10]);
		}
	}
	// costruttore mescola mazzo
	public void mescola(){

		// inizializzo
		proxcarta = 0;

		for(int prima = 0; prima<mazzo.length; prima++){

			//prendo un numero casuale fra 0 e 40
			int secondo 	= numCasuale.nextInt(NUM_CARTE);

			//scambio la carta corrente con la carta casuale pescata
			Carta temp 		= mazzo[prima];
			mazzo[prima] 	= mazzo[secondo];
			mazzo[secondo]	= temp;

		} // end for
		// end mecola
	}
	// metodo distribuisce carta
	public Carta distribuisciCarta(){
		// controllo se ci sono abbastanza carte nel mazzo
		if(proxcarta<mazzo.length)
			return mazzo[proxcarta++]; // restituisco la prossima carta
		else
			return null; //restituisc nulla per indicare il mazzo vuoto
	}
}
