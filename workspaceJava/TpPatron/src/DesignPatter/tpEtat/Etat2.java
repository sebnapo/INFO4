package DesignPatter.tpEtat;

public class Etat2 implements EtatMachine {

	private final MachineTuring machine;
	
	public Etat2(MachineTuring machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}
	
	@Override
	public void lireChar(char test) {
		// TODO Auto-generated method stub
		System.out.println("lecture d'un char en etat 2");
		if(test == 'a') {
			this.machine.setState(new Etat4(this.machine));
			System.out.println("lecture d'un char en etat 2 passage au 4");
		}
	}

}
