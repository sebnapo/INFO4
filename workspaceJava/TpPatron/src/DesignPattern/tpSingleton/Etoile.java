package DesignPattern.tpSingleton;

public class Etoile {
	private Etoile()
	{}
	
	private Planete[] listePlanet;
	
	private static Etoile INSTANCE = new Etoile();
	
	
	public static Etoile getInstance() {
		return INSTANCE;
	}
	
	public void setListePLanete(Planete[] planete) {
		this.listePlanet = planete;
	}
	
	public void sysoPLanet() {
		for(Planete p : listePlanet) {
			System.out.println(p.getNom());
		}
		
	}
	
	
}
