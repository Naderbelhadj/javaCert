package lessonStaticFields;

public class Test {

	public static void main(String[] args) {
		// difference entre variable de classe static et variable d'instance

		Voiture v1 = new Voiture();
		Voiture v2 =new Voiture();
		Voiture v3=new Voiture();
		//v1, v2 et v3 sont des instances d'objets
		v1.nom="Golf";
		v1.vitMax=255;
		v2.nom="Nissan";
		v2.vitMax=300;
		
		v3.nom="passat";
	    v3.vitMax=320;
	System.out.println("voiture1: " +v1.nom + " sa vitesse est: " +v1.vitMax + "\n voiture2 :" +v2.nom + " sa vitesse est: " + v2.vitMax + "\n voiture3 :" + v3.nom + " sa vitesse est: " + v3.vitMax);
	
	}

}
