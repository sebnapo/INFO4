package DesignPatter.tpStrategie;

public class AlgoIteratif implements Strategie{

	@Override
	public void afficher(String chaine) {
		// TODO Auto-generated method stub
		for (int i = 0, n = chaine.length(); i < n; i++) {
		    System.out.println(chaine.charAt(chaine.length()- (i+1)));
		}
	}

}
