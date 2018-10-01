package DesignPattern.tpVisiteur.etudiant;

public abstract class Expression extends ProgramNode  {
	abstract void accept(Visitor v);
}
