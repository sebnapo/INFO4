package DesignPattern.tpFabriqueAbstraite;

public class Joker implements Mechant {

	@Override
	public void seBattre(Gentil gentil) {
		if(gentil.getClass() != Batman.class) {
			System.out.println("Impossible de se battre contre " + gentil.getClass() + ", je me bats que contre"
					+ " Batman");
		} else {
			System.out.println("Combat entre le Joker et Batman en cours !");
		}
	}

}
