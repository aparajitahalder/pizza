package com.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.beans.Pizza;

import com.demo.comparators.NameComparator;
import com.exception.NoPizzaFoundExceptions;
import com.exception.PizzaAlreadyExistsException;

public class PizzaListStoreImpl implements PizzaStore{
	
	private static List<Pizza> pizzaList;

	static {
		pizzaList = new ArrayList<>();
		pizzaList.add(new Pizza("Margarita", 10, "Onion","Bread", "Tomato",27,100));
		pizzaList.add(new Pizza("LeanCrust", 20, "Beans","Bread", "Tomato",17,200));
		pizzaList.add(new Pizza("Cheese", 30, "Cheese","Bread", "Sauce",31,300));	
	}

	public void addNewPizza(Pizza p) throws PizzaAlreadyExistsException {
		if(pizzaList.contains(p))
			  throw new PizzaAlreadyExistsException(" Pizza Already Exists");
		pizzaList.add(p);

	}

	public List<Pizza> getPizzaByName(String pizzaname) throws NoPizzaFoundExceptions {
		List<Pizza> L1 = new ArrayList<>();
		for(Pizza p:pizzaList) {
			if(p.getPizzaName().equals(pizzaname)) {
				L1.add(p);
			}
		}
		if(L1.size()>0)
			  return L1;
		throw new NoPizzaFoundExceptions("No Pizza Found..");
	}
	
		
	
	

	public Pizza[] getPizzaNamesBySize(int size) throws NoPizzaFoundExceptions {
		int pos=pizzaList.indexOf(new Pizza(size));
		if(pos==-1) {
			throw new NoPizzaFoundExceptions("No Pizza Found..");
		}
		else {
			return pizzaList.get(pos);
		
	}
	
	
	
		public List<Pizza> sortByName() {
			List<Pizza> copySlist=new ArrayList<>(100);
			Collections.sort(pizzaList, new NameComparator());
			return copySlist;
		}
	
	
	


}
