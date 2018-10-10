package DesignPatter.tpEtat;

public class Etat1 implements EtatMachine {

	private final MachineTuring machine;
	
	public Etat1(MachineTuring machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}
	
	@Override
	public void lireChar(char test) {
		// TODO Auto-generated method stub
		System.out.println("lecture d'un char en etat 1");
		if(test == 'a') {
			this.machine.setState(new Etat2(this.machine));
		} else {
			this.machine.setState(new Etat3(this.machine));
		}
	}

}
