package fr.diginamic.factory;

public class ObjetConnecteFactory implements IObjetConnecteFactory{

	@Override
	public ObjetConnecte getInstance(Type type, int limiteVolts) {
		// TODO Auto-generated method stub
		if (type==null) {
			return null;
		}
		
		ObjetConnecte objet = null;
		switch (type) {
		case Tel:
			objet = new TelephonePortable(limiteVolts);
			break;
		case Tab:
			objet = new Tablette(limiteVolts);
			break;
		case Enceinte:
			objet = new EnceinteConnecte(limiteVolts);
			break;
		default:
			break;
		}
		return objet;
	}

}
