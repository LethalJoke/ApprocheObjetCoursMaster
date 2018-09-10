package fr.ubordeaux.ao;

public class Main {
    private static  final int MAX = 3000;
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        Towns towns = new Towns();
        TownFactory tf = new TownFactory();

        for (int i = 0 ; i < MAX ; i++) {
            towns.addTown(tf.getNextTown());
            Address address = new Address(351, "Cours de la libération", towns.getTown(i,i).iterator().next());
            Contact newContact = new Contact("John", "Do", address);
            contacts.addContact(newContact);
        }
        System.out.println(MAX+" contacts created !");
        
        if(ContactSearcher.searchContact("Jo", contacts).size() != 0)
        	System.out.println("Jo trouvé");
        if(ContactSearcher.searchContact("Do", contacts).size() != 0)
        	System.out.println("Do trouvé");
        if(ContactSearcher.searchContact("John", contacts).size() != 0)
        	System.out.println("John trouvé");
        if(ContactSearcher.searchContact("Michel", contacts).size() != 0)
        	System.out.println("Michel trouvé");
        

        try {
            Thread.sleep(200000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
}