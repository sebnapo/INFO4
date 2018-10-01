package DesignPattern.tpVisiteur.etudiant;

public class Read extends Statement {
	private VariableRef var;

	public Read(VariableRef variableRef) {
		// TODO Auto-generated constructor stub
	}

	public VariableRef getVar() {
		return var;
	}

	public void setVar(VariableRef var) {
		this.var = var;
	}

	@Override
	void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
}
