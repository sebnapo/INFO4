package DesignPattern.tpFabriqueAbstraite;

public class Superman implements Gentil {

	@Override
	public void seBattre(Mechant mechant) {
		if(mechant.getClass() != CryptonMan.class) {
			System.out.println("Impossible de se battre contre " + mechant.getClass() + ", je me bats que contre"
					+ " le CryptonMan");
		} else {
			System.out.println("Combat entre Superman et CryptonMan en cours !");
		}
	}

}
