package DesignPattern.tpDecorateur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Decorateur implements List {
	protected List list;
	
	public Decorateur(List list) {
		this.list = list;
	}
}
