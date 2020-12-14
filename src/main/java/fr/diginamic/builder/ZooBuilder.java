package fr.diginamic.builder;
import java.util.Optional;

import  fr.diginamic.builder.Animal;

public class ZooBuilder {
	private Zoo zoo;

	public ZooBuilder(String nom) {
		zoo = new Zoo(nom);
	}
	
	public ZooBuilder appendZone(String nomZone, int capacite) {
		
		Zone zone = new Zone(nomZone, capacite);
		zoo.getZones().add(zone);
		
		return this;
	}
	
	public ZooBuilder appendAnimal(String nomZone, Animal animal) throws Exception {
		
		Optional<Zone> opt = zoo.getZones().stream().filter(z -> z.getNom().equals(nomZone)).findFirst();

		if (opt.isPresent()) {
			Zone z = opt.get();
			if (z.getAnimaux().size() < z.getCapacite()) {
				z.getAnimaux().add(animal);
			}
			else {
				throw new Exception(nomZone+"pleine");
			}
		}
		else {
			throw new Exception(nomZone+"inexistant");
		}
		
		return this;
}
	public Zoo get() {
		return this.zoo;
}
}
