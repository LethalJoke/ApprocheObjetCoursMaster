package fr.ubordeaux.ao;

public abstract class ContactSearcher{
	
	public static Contacts searchContact(String s, Contacts list)
	{
		Contacts cts = new Contacts();
		for(Contact c : list.getContacts(0, list.size()))
		{
			if(c.getFirstName().contains(s) || c.getSecondName().contains(s))
				cts.addContact(c);
		}
		return cts;
	}
}