package DesignPatter.tpObservateur;

public class SommeInteger extends Observer {
	public EnsembleInteger ensembleInt;

	public SommeInteger(EnsembleInteger ensemble) {
		// TODO Auto-generated constructor stub
		ensembleInt = ensemble;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		int somme = 0;
		for(Integer in : ensembleInt.listeInteger) {
			somme += in;
		}
		System.out.println("La somme est de : " + somme);
	}
}
