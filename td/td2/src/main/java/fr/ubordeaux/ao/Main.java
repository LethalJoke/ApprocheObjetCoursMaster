package fr.ubordeaux.ao;

import java.util.Date;

public class Main {
	
	public static void main(String[] args)
	{
		Account a = new Account("DracoV");
		a.addTransaction(new Transaction("Pain au chocolat", 120));
		a.addTransaction("Azazel en Peluche",666);
		Account b = new Account("Matthieu Marramarco");
		b.addTransaction(new Transaction("Cartes Yu-Gi-Oh!",2000));
		System.out.println(a);
		System.out.println(b);
		a.deleteTransaction("Pain au chocolat", new Date(), 120);
		System.out.println(a);
	}

}
