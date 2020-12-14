package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service implements IElement{
	
	private String nom;
	private List<IElement> elements;
	
	public Service(String nom) {
		super();
		this.nom = nom;
		this.elements = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<IElement> getElements() {
		return elements;
	}

	public void setElements(List<IElement> elements) {
		this.elements = elements;
	}

	/*   Methodes */
	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return elements.stream().mapToDouble(e -> e.calculerSalaire()).sum();
	}

	public Service add(IElement element) {
		elements.add(element);
		return this;
	}
	
	public Service add(IElement... elements) {
		this.elements.addAll(Arrays.asList(elements));
		return this;
	}
	
}
