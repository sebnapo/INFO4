package DesignPattern.tpVisiteur.etudiant;

public class VariableRef extends Expression {
	private String name;
	
	public VariableRef(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
