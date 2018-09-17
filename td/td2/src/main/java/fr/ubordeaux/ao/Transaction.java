package fr.ubordeaux.ao;

import java.util.Date;

public class Transaction {
    private Date date;
    private String title;
    private int amount;

    public Transaction(String title, int amount) {
    	
    	if(amount <= 0)
    		throw new IllegalArgumentException();
    	
        this.title = title;
        this.amount = amount;
        this.date = new Date();
    }
    
    public Transaction(String title, int amount, Date date) {
    	
    	if(amount <= 0 || date == null)
    		throw new IllegalArgumentException();
    	
        this.title = title;
        this.amount = amount;
        this.date = date;
    }
    
    /*public Transaction(Transaction transaction)
    {
    	this.date = transaction.date;
    	this.amount = transaction.amount;
    	this.title = transaction.title;
    }*/

    public Date getDate() {
    	return date;
    }

    public String getTitle() {
    	return this.title;
    }

    public int getAmount() {
    	return amount;
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof Transaction) {
        	Transaction otherTransaction = (Transaction) other;
            return (otherTransaction.getTitle().equals(title) && otherTransaction.getDate().equals(date) && otherTransaction.getAmount() == amount);
        }
        return false;
    }
}
