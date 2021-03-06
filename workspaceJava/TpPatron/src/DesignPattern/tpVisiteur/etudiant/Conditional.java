package DesignPattern.tpVisiteur.etudiant;

public class Conditional extends Statement {

	private Expression cond;
	private Block thenPart,elsePart;
	
	
	public Conditional(Expression cond, Block thenPart, Block elsePart) {
		super();
		this.cond = cond;
		this.thenPart = thenPart;
		this.elsePart = elsePart;
	}

	public Expression getCond() {
		return cond;
	}


	public void setCond(Expression cond) {
		this.cond = cond;
	}


	public Block getThenPart() {
		return thenPart;
	}


	public void setThenPart(Block thenPart) {
		this.thenPart = thenPart;
	}


	public Block getElsePart() {
		return elsePart;
	}


	public void setElsePart(Block elsePart) {
		this.elsePart = elsePart;
	}


	@Override
	void accept(Visitor v) {
		v.visit(this);
		v.visit(thenPart);
		v.visit(elsePart);
	}

}
