package com.dao;

import com.beans.Pizza;
import com.exception.NoPizzaFoundExceptions;
import com.exception.PizzaAlreadyExistsException;



public interface Storage {
	
	void addNewPizza(Pizza e)throws PizzaAlreadyExistsException;
	Pizza getPizzaByName(String pizzaname)throws NoPizzaFoundExceptions;
	Pizza[] getPizzaNamesBySize(int size)throws NoPizzaFoundExceptions;

}
