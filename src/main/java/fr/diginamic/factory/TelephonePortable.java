package fr.diginamic.factory;

public class TelephonePortable extends ObjetConnecte{

	public TelephonePortable(int limitVolts) {
		super(limitVolts);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null) {
			return false;
		
		}
		return true;
	}
}
