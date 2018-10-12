package DesignPattern.tpFabriqueAbstraite;

public class GentilFactory {
	
	public Batman createBatman() {
		return new Batman();
	}
	
	public Superman createSuperman() {
		return new Superman();
	}
}
