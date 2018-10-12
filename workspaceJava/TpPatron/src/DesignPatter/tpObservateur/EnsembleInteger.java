package DesignPatter.tpObservateur;

import java.util.ArrayList;

public class EnsembleInteger{
	
	public ArrayList<Integer> listeInteger;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	
	public EnsembleInteger(ArrayList<Integer> list) {
		this.listeInteger = list;
	}
	
	public EnsembleInteger() {
		listeInteger = new ArrayList<Integer>();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for(Observer o : observers) {
			o.update();
		}
	}
	
	public void ajoutInteger(Integer in) {
		listeInteger.add(in);
		notifyAllObservers();
	}
	
	public void removeInteger(int index) {
		listeInteger.remove(index);
		notifyAllObservers();
	}
}
