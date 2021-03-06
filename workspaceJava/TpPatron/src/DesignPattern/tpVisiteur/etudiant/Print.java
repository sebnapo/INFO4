package DesignPattern.tpVisiteur.etudiant;

public class Print extends Statement {
	private Expression print;
	
	
	public Print(Expression p){
		this.print = p;
	}

	public Expression getPrint() {
		return print;
	}

	public void setPrint(Expression print) {
		this.print = print;
	}

	@Override
	void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
