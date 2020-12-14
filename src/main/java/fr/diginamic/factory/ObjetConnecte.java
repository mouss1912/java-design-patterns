package fr.diginamic.factory;
import fr.diginamic.factory.Type;

public abstract class ObjetConnecte {
	public  int limitVolts;

	public ObjetConnecte(int limitVolts) {
		super();
		this.limitVolts = limitVolts;
	}

	public int getLimitVolts() {
		return limitVolts;
	}

	public void setLimitVolts(int limitVolts) {
		this.limitVolts = limitVolts;
	}
		

	}
	


