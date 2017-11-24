package modele;
import java.util.ArrayList;

import exceptions.ContrainteDoublonListeException;
import exceptions.IndiceListeDepasseException;
import exceptions.IndiceNegatifException;

public class Matrice {

	private ArrayList<ArrayList<Double>> donnees; //QUESTION ArrayList ou List
	
	
	//creation du constructeur
	public Matrice()	
	{
		donnees=new ArrayList<ArrayList<Double>>();
	}
	//surcharge de constructeur pour la methode clone
	private Matrice(ArrayList<ArrayList<Double>> copieListe)
	{
		donnees=copieListe;
	}
	
	public void ajouterLigne(ArrayList<Double> ligne) throws ContrainteDoublonListeException
	{
		if(donnees.contains(ligne)) //verifier que equal est bien dans a classe Double
		{
			throw new ContrainteDoublonListeException();
		}
		else
		{
			donnees.add(ligne);
		}
	}
	public void modifierLigne(int indice,ArrayList<Double> ligne) throws IndiceListeDepasseException,IndiceNegatifException
	{
		if(indice>=donnees.size())
		{
			throw new IndiceListeDepasseException();
		}
		else if(indice<0)
		{
			throw new IndiceNegatifException();
		}
		else
		{
			donnees.set(indice, ligne);
		}
	}
	
	public ArrayList<Double> chercherLigne(int indice) throws IndiceListeDepasseException,IndiceNegatifException
	{
		if(indice>=donnees.size())
		{
			throw new IndiceListeDepasseException();
		}
		else if(indice<0)
		{
			throw new IndiceNegatifException();
		}
		else
		{
			return donnees.get(indice);
		}
	}
	
	public Matrice clone()
	{
		return new Matrice(this.donnees);
	}
	//getteur de l'ArrayList !!a retravailler
	public ArrayList<ArrayList<Double>> getDonnees() {
		return donnees;
	}

	//setteurs de l'ArraysList !!a retravailler
	public void setDonnees(ArrayList<ArrayList<Double>> donnees) {
		this.donnees = donnees;
	}

	
	//!!a retravailler
	@Override
	public String toString() {
		return "Matrice [donnees=" + donnees + "]\n";
	}

	

}
