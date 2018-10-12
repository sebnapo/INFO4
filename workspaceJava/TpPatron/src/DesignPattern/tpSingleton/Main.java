package DesignPattern.tpSingleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etoile soleil = Etoile.getInstance();
		
		Planete terre = new Planete("terre");
		Planete mars = new Planete("mars");
		Planete uranus = new Planete("uranus");
		Planete mercure = new Planete("mercure");
		Planete saturne = new Planete("saturne");
		Planete venus = new Planete("venus");
		Planete jupiter = new Planete("jupiter");
		Planete neptune = new Planete("neptune");
		Planete[] listePlanete = new Planete[8];
		listePlanete[0] = terre;
		listePlanete[1] = mars;
		listePlanete[2] = uranus;
		listePlanete[3] = mercure;
		listePlanete[4] = saturne;
		listePlanete[5] = venus;
		listePlanete[6] = jupiter;
		listePlanete[7] = neptune;
		soleil.setListePLanete(listePlanete);
		soleil.sysoPLanet();
	}

}
