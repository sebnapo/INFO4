package DesignPatter.tpEtat;

public class Etat3 implements EtatMachine{
	
	private final MachineTuring machine;
	
	public Etat3(MachineTuring machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}
	
	@Override
	public void lireChar(char test) {
		// TODO Auto-generated method stub
		if(test == 'b') {
			this.machine.setState(new Etat4(this.machine));
			System.out.println("lecture d'un char en etat 3");
		}
	}

}
