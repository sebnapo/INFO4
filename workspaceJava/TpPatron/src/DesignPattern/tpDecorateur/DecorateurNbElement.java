package DesignPattern.tpDecorateur;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DecorateurNbElement extends Decorateur {
	
	
	protected int tailleMax;
	public DecorateurNbElement(int tailleMax,List list) {
		super(list);
		this.tailleMax = tailleMax;
	}
	public boolean add(Object o) {
		if(this.list.size() < tailleMax) {
			this.list.add(o);
			return true;
		}
		System.out.println("Nombre d'élément depassé.");
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
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
