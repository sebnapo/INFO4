package DesignPattern.tpFabriqueAbstraite;

public class MechantFactory {
	public Joker createJoker() {
		return new Joker();
	}
	
	public CryptonMan createCryptonMan() {
		return new CryptonMan();
	}
}
