package DesignPattern.tpFabriqueAbstraite;

public class CryptonMan implements Mechant {


	@Override
	public void seBattre(Gentil gentil) {
		if(gentil.getClass() != Superman.class) {
			System.out.println("Impossible de se battre contre " + gentil.getClass() + ", je me bats que contre"
					+ " Superman");
		} else {
			System.out.println("Combat entre le CryptonMan et Superman en cours !");
		}
	}
}
