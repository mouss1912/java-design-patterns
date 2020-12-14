package fr.diginamic.composite;

public class TestComposite {
	
	public static void main(String[] args) {
		Service fff = new Service("DSIN");
		fff.add(new Employe("Zidane1", "Zinedine", 30000)).add(new Employe("kylian", "mbapé", 20000));
		//fff.add(new Service("CM").add(new Employe("pogba", "paul", 9000)).add(new Employe("girou", "olivier", 5000)));
		//fff.add(new Service("JO").add(new Employe("loris", "loris",8000)).add(new Employe("clement", "Langlet", 5000)));
		
		System.out.println(fff.calculerSalaire());
		
	}


}
