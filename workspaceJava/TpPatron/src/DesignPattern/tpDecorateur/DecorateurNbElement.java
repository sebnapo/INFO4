package DesignPattern.tpDecorateur;

import java.util.Collection;

public class DecorateurNbElement extends DecorateurArrayList {
	
	protected int tailleMax;
	public DecorateurNbElement(int tailleMax) {
		this.tailleMax = tailleMax;
	}
	public boolean add(Object o) {
		if(this.list.size() < tailleMax) {
			this.list.add(o);
			return true;
		}
		return false;
	}
	
	public boolean addAll(Collection c) {
		if(this.list.size() + c.size() < tailleMax) {
			for(Object o : c) {
				this.list.add(o);
			}
			return true;
		}
		return false;
	}
	
	public boolean addAll(int index,Collection c) {
		if(this.list.size() + c.size() < tailleMax) {
			for(Object o : c) {
				this.list.add(o);
			}
			return true;
		}
		return false;
	}
}
