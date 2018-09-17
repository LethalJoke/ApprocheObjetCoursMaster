package fr.ubordeaux.ao;

import java.rmi.server.UID;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Account {
    private int balance;
    private UID id;
    private String name;
    private Set<Transaction> transactions;

    public Account(String name) {
        this.balance = 0;
        transactions = new HashSet<Transaction>();
        this.name = name;
        this.id = new UID();
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        balance += transaction.getAmount();
    }
    
    
    //Add != Creation + Ajout
    public void addTransaction(String title, int amount) {
        transactions.add(new Transaction(title, amount));
        balance += amount;
    }
    
    public void deleteTransaction(String title, Date date, int amount)
    {
    	Transaction toCheck = new Transaction(title, amount, date);
    	boolean found = false;
    	for(Transaction t : transactions)
    		if(t.equals(toCheck))
    		{
    			found = true;
    			break;
    		}
    	if(found)
    	{
    		balance -= toCheck.getAmount();
    		transactions.remove(toCheck);
    	}
    }
    
    public Set<Transaction> getTransactionSince(Date date) {
    	Set<Transaction> values = new HashSet<Transaction>();
    	for(Transaction t : transactions)
    		if(t.getDate().after(date))
    			values.add(t);
    	return values;
    }
    

    @Override
    public boolean equals(Object other) {
        if (other instanceof Account) {
            Account otherAccount = (Account) other;
            return this.id.equals(otherAccount.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    @Override
    public String toString() {
        return "Account "+this.name+" (id="+this.id+"), balance = "+this.balance;
    }
    
}