/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mun Chan
 */
public class book {

    
	int id, amount;
	String name_book;
	float price;
	public book() {
		super();
	}
	
	public book(String name_book,float price, int amount) {
		super();
		
		this.name_book = name_book;
		
		this.price = price;
		this.amount = amount;
		
	}

    public book(int id,String name_book, float price, int amount) {
        this.id = id;
        this.amount = amount;
        this.name_book = name_book;
        this.price = price;
    }

        
 

   

    

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getName_book() {
		return name_book;
	}
	public void setName_book(String name_book) {
		this.name_book = name_book;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
