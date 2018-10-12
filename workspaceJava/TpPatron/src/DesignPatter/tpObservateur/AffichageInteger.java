package DesignPatter.tpObservateur;

public class AffichageInteger extends Observer{

	public EnsembleInteger ensembleInt;
	
	public AffichageInteger(EnsembleInteger ensemble) {
		// TODO Auto-generated constructor stub
		this.ensembleInt = ensemble;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		for(Integer in : ensembleInt.listeInteger) {
			System.out.println(in);
		}
	}

}
