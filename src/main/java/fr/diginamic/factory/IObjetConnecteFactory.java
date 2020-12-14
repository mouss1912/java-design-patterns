package fr.diginamic.factory;

public interface IObjetConnecteFactory {
	ObjetConnecte getInstance(Type type, int limiteVolts);
}
