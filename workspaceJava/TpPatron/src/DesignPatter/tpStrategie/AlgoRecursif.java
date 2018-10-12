package DesignPatter.tpStrategie;

public class AlgoRecursif implements Strategie{

	@Override
	public void afficher(String chaine) {
		if(chaine.length() > 0) {
			afficher(chaine.substring(1));
	        System.out.print(chaine.charAt(0));
	    }
	}

}
