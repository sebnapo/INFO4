package DesignPattern.tpFabriqueAbstraite;

public class Batman implements Gentil{

	public void seBattre(Mechant mechant) {
		// TODO Auto-generated method stub
		if(mechant.getClass() != Joker.class) {
			System.out.println("Impossible de se battre contre " + mechant.getClass() + ", je me bats que contre"
					+ " le Joker");
		} else {
			System.out.println("Combat entre Batman et Joker en cours !");
		}
	}
}
