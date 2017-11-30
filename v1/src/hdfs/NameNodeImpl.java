package hdfs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.swing.text.AbstractDocument.BranchElement;

public class NameNodeImpl implements NameNode {
	
	/*****************************************
	ATTRIBUTS
	*****************************************/
	
	private int facteurDeReplication;
	private List<Machine> machines;
		
	private List<Fichier> fichiers;
		
	/*****************************************
	CONSTRUCTEUR
	*****************************************/
	
	/*****************************************
	MAIN
	*****************************************/
	
	public static void main(String[] args) {
		
		//Récupérer les serveurs et les numéros de port depuis le fichier spécifié
		if(args.length != 1){
			System.out.println("Usage : java NameNodeImple <file>");
		} else {
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(args[0]));
			} catch (FileNotFoundException e) {
				System.out.println("Fichier " + args[0] + " introuvable");
			}
			String ligne;
			servers = new ArrayList<>();
			ports = new ArrayList<>();
			int i = 0;
			try {
				while ((ligne = br.readLine()) != null){
					String[] machine = ligne.split(" ");
					ports.add(Integer.parseInt(machine[0]));
					servers.add(machine[1]);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		System.out.println("Liste des machines et des ports initialisées");
		}
	}

	/*****************************************
	METHODES
	*****************************************/
	
	@Override
	public Collection<String> getFragments(String nomFichier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMachineFragment(String nomFragment, Collection<String> replicationsUilisees) {
		// TODO Auto-generated method stub
		return null;
	}

	/*****************************************
	GETS && SETS
	*****************************************/
}
