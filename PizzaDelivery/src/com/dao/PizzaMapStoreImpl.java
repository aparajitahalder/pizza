package com.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.beans.Pizza;
import com.demo.comparators.NameComparator;
import com.exception.NoPizzaFoundExceptions;
import com.exception.PizzaAlreadyExistsException;


public class PizzaMapStoreImpl implements PizzaStore{
	
	private static Map<String,Pizza> pz;
	static {
		pz=new HashMap<>();
	}
	
	public void addNewPizza(Pizza p) throws PizzaAlreadyExistsException {
		if(pz.containsKey(p.getSizeInCms()))
			  throw new PizzaAlreadyExistsException(" Pizza Already Exists");
		pz.put(p.getSizeInCms(), p);
		
	}

	
	public List<Pizza> getPizzaByName(String pizzaname) throws NoPizzaFoundExceptions {
		Set<String> keys = pz.keySet();
		List<Pizza> L1=new ArrayList<>();
		for(String nm:keys) {
			if(p.getPizzaName().equals(pizzaname)) {
				L1.add(p);
			}
		}
		if(L1.size()>0)
			  return L1;
		throw new NoPizzaFoundExceptions("No Pizza Found..");
	}
	
	


	public Pizza[] getPizzaNamesBySize(int size) throws NoPizzaFoundExceptions {
		Pizza p=pz.get(size));
		if(p!=null) {
			return p;
		}
		else {
			throw new NoPizzaFoundExceptions("No Pizza Found..");
		
	}
	}
	

	public Map<String,Student> sortByName() {
		Map<String,Student> sm=new TreeMap<>();
		Set<Map.Entry<String,Pizza>> keys=pz.entrySet();
		for(Map.Entry<String,Pizza> entry:keys) {
			Pizza p=entry.getValue();
			sm.put(p.getPizzaName(),p);
		}
		return tm;
	}

	

	
}
	

	