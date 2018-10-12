package DesignPatter.tpStrategie;

public class Envers {
	
	private String chaineChar;
	private Strategie strategie;
	
	public Envers(String chaine) {
		this.chaineChar = chaine;
		if(chaine.length() < 10) {
			strategie = new AlgoIteratif();
		} else {
			strategie = new AlgoRecursif();
		}
	}
	
	public void affiche() {
		strategie.afficher(chaineChar);
	}
	
	
}
