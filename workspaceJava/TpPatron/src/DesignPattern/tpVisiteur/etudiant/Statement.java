package DesignPattern.tpVisiteur.etudiant;

public abstract class Statement extends ProgramNode {
	abstract void accept(Visitor v);
}
