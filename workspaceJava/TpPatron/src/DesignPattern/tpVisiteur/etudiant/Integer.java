package DesignPattern.tpVisiteur.etudiant;

public class Integer extends Expression {
	private int value;
	
	public Integer(int v){
		this.value =v;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
