package com.dao;
import java.util.List;
import com.beans.Pizza;
import com.exception.NoPizzaFoundExceptions;
import com.exception.PizzaAlreadyExistsException;


public interface PizzaStore 
{
	void addNewPizza(Pizza e)throws PizzaAlreadyExistsException;
	Pizza getPizzaByName(String pizzaname) throws NoPizzaFoundExceptions;
	Pizza[] getPizzaNamesBySize(int size) throws NoPizzaFoundExceptions;
	
}


