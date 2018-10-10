package DesignPatter.tpEtat;

public class MachineTuring {

	private String stringEntre;
	private EtatMachine state = new Etat1(this);
	
	public MachineTuring(String stringEntre) {
		this.stringEntre = stringEntre;
		this.lireChar(stringEntre);
		
	}
	
	public void setState(EtatMachine state) {
		this.state = state;
	}
	
	public void lireChar(String entre) {
		for(int i = 0; i < entre.length(); i++ ) {
			this.state.lireChar(entre.charAt(i));
		}
	}
}
