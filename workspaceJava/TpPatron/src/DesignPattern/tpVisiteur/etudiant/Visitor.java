package DesignPattern.tpVisiteur.etudiant;

public abstract class Visitor {
	abstract void visit(BinExpression bex);
	abstract void visit(Integer in);
	abstract void visit(Print pr);
	abstract void visit(Read rd);
	abstract void visit(Assignment ass);
	abstract void visit(Conditional cond);
	abstract void visit(Block bl);
	abstract void visit(While wh);
	abstract void visit(VariableRef variableRef);
}
