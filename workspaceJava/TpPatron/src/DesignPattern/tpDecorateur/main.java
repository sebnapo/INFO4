package DesignPattern.tpDecorateur;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList array = new ArrayList<>();
		DecorateurNbElement dn = new DecorateurNbElement(4, array);
		dn.add("lol");
		dn.add("lol");
		dn.add("lol");
		dn.add("lol");
		dn.add("lol");
		
		DecorateurRemove dr = new DecorateurRemove(array);
		dr.remove("");
	}

}
