package DesignPatter.tpObservateur;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnsembleInteger ensemble = new EnsembleInteger();
		
		Observer AffichageInteger = new AffichageInteger(ensemble);
		Observer SommeInteger = new SommeInteger(ensemble);
		
		ensemble.attach(SommeInteger);
		ensemble.attach(AffichageInteger);
		
		ensemble.ajoutInteger(5);
		ensemble.ajoutInteger(12);
		ensemble.removeInteger(1);
	}

}
