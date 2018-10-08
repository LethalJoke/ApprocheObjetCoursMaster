package fr.ubordeaux.ao.ui;

import java.util.ArrayList;
import java.util.Scanner;
import fr.ubordeaux.ao.infrastructure.inmemory.CatalogImpl;
import fr.ubordeaux.ao.domain.model.Reference;

public class CommandLine{
	
	private static int mode = 0;
	// 0-> Rien, 1-> Create, 2-> Delete, 3-> Add
	private static String nom, desc;
	private static CatalogImpl ctl = new CatalogImpl();
	private static ArrayList<Reference> refs = new ArrayList<>();
	
	public static void start()
	{
		Scanner sc = new Scanner(System.in);
		String command;
		while(sc.hasNext())
		{
			command = sc.next();
			if(command != null)
				traiterCommande(command);

		}
	}
	
	private static void traiterCommande(String command)
	{
		if(mode == 0)
		{
			if(command.equals("showrefs"))
				for(Reference r : refs)
					System.out.println(r);
			else
				if(command.equals("createref"))
				{
					System.out.println("* Donnez un nom, description puis prix.*");
					mode = 1;
				}
			else
				if(command.equals("rmcatalogue"))
				{
					System.out.println("* Donnez un ID.*");
					mode = 2;
				}
			else
				if(command.equals("addref"))
				{
					System.out.println("* Donnez un ID.*");
					mode = 3;
				}
			else
				if(command.equals("showcatalog"))
					System.out.println(ctl);
		}
		else
		if(mode == 1)
		{
			if(nom == null)
				nom = new String(command);
			else if(desc == null)
				desc = new String(command);
			else
			{
				try
				{
					Reference r = new Reference(nom,desc,Double.parseDouble(command));
					refs.add(r);
					System.out.println("Référence ajoutée : \n" + r);
				}
				catch(Exception e)
				{
					System.out.println("<!> ERROR : LE PRIX N'ETAIT PAS UN NOMBRE <!>");
				}
				nom = null;
				desc = null;
				mode = 0;
			}
		}
		else
		if(mode == 2)
		{
			try
			{
				long l = Long.parseLong(command);
				if(ctl.deleteReference(l))
					System.out.println("Référence supprimée du catalogue");
				else
					System.out.println("ID introuvable");
			}
			catch(Exception e)
			{
				System.out.println("<!> ERROR : L'ID  N'ETAIT PAS UN ENTIER <!>");
			}
		}
		else
		{
			
		}
	}
	
}