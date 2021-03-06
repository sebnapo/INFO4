package DesignPattern.tpVisiteur.etudiant;

import java.util.*;

public class Test {
	public static void main(String[] argv){
		Statement p = new Assignment(
				new VariableRef("y"),
				new BinExpression( new VariableRef("x"), "*", new Integer(4)));
		
		Statement p2 = new Assignment(
				new VariableRef("z"),
				new BinExpression( new VariableRef("x"), "-", new Integer(2)));
		
		Statement p3 = new Print(new Integer(5));
		ArrayList<Statement> list = new ArrayList<Statement>();
		list.add(p);
		list.add(p2);
		list.add(p3);
		
		VisitorStats visiteur = new VisitorStats();
		VisitorCodeGenerator visiteurCode = new VisitorCodeGenerator();
		ProgramNode s = new Block(list);
		visiteur.visit((Block)s);
		visiteurCode.visit((Block)s);
		System.out.println(visiteur.getPrint());
	
	}
}
