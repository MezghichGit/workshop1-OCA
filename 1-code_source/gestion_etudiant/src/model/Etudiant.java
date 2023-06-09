package model;

public class Etudiant {
	
	private String nom;
	private int age;
	private double moyenne;
	private String adresse;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if(nom.length()<8 || nom.length()>30)
		{
			System.out.println("Nom invalide");
			return;
		}
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<18 || age >28)
		{
			System.out.println("Age invalide");
			return;
		}
		this.age = age;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		if(moyenne<0 || moyenne>20)
		{
			System.out.println("Moyenne invalide");
			return;
		}
		this.moyenne = moyenne;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	
	public Etudiant(String nom, int age, double moyenne, String adresse) {
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		this.adresse = adresse;
	}
	
	public Etudiant() {
	}
	
	public void info() {
		System.out.println("Etudiant [nom=" + nom + ", age=" + age + ", moyenne=" + moyenne + ", adresse=" + adresse + "]");
	}
	
	

}
