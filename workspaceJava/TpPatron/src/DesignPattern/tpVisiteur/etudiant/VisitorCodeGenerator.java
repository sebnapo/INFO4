package DesignPattern.tpVisiteur.etudiant;

public class VisitorCodeGenerator extends Visitor {

	@Override
	void visit(BinExpression bex) {
		// TODO Auto-generated method stub
		bex.getLhs().accept(this);
		System.out.printf(bex.getOperator());
		bex.getRhs().accept(this);
		System.out.println();
	}

	@Override
	void visit(Integer in) {
		// TODO Auto-generated method stub
		System.out.print(in.getValue());
	}

	@Override
	void visit(Block bl) {
		// TODO Auto-generated method stub
		for(Statement st : bl.getS()) {
			st.accept(this);
		}
	}

	@Override
	void visit(Print pr) {
		// TODO Auto-generated method stub
		pr.getPrint().accept(this);
	}

	@Override
	void visit(Read rd) {
		// TODO Auto-generated method stub
		rd.getVar().accept(this);
	}

	@Override
	void visit(Assignment ass) {
		// TODO Auto-generated method stub
		ass.getVar().accept(this);
		System.out.printf("=");
		ass.getRhs().accept(this);
		System.out.println();
	}

	@Override
	void visit(Conditional cond) {
		// TODO Auto-generated method stub
		cond.getCond().accept(this);
		cond.getThenPart().accept(this);
		cond.getElsePart().accept(this);
	}

	@Override
	void visit(While wh) {
		// TODO Auto-generated method stub
		wh.getCond().accept(this);
		wh.getBody().accept(this);
	}

	@Override
	void visit(VariableRef variableRef) {
		// TODO Auto-generated method stub
		System.out.printf(variableRef.getName());
	}

}
