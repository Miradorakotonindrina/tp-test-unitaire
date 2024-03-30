package iut.bad;

public class Humain {

	private String nom ;
	private String prenom;
	private int age;



public void Detail() {
	System.out.println ("nom: "+nom+ "prenom: "+prenom+ "age: "+age);
}



@Override
public String toString() {
	return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
} 

public void manger() {
	
}

public void boire () {
	
}

}