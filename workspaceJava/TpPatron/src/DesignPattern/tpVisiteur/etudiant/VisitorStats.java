package DesignPattern.tpVisiteur.etudiant;

public class VisitorStats extends Visitor {

	private int ass,condit,print,read,whil = 0;
	@Override
	void visit(BinExpression bex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void visit(Integer in) {
		// TODO Auto-generated method stub
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
		this.print++;
	}

	@Override
	void visit(Read rd) {
		// TODO Auto-generated method stub
		rd.accept(this);
		this.read++;
	}

	@Override
	void visit(Assignment ass) {
		// TODO Auto-generated method stub
		this.ass++;
	}

	@Override
	void visit(Conditional cond) {
		// TODO Auto-generated method stub
		this.condit++;
	}

	@Override
	void visit(While wh) {
		// TODO Auto-generated method stub
		this.whil++;
	}

	public int getAss() {
		return ass;
	}

	public int getCondit() {
		return condit;
	}

	public int getPrint() {
		return print;
	}

	public int getRead() {
		return read;
	}

	public int getWhil() {
		return whil;
	}

	@Override
	void visit(VariableRef variableRef) {
		// TODO Auto-generated method stub
		
	}

	
	

}
