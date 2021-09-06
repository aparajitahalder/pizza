package com.dao;


import com.beans.Pizza;
import com.exception.NoPizzaFoundExceptions;
import com.exception.PizzaAlreadyExistsException;

public class PizzaStoreImpl implements Storage {
	private static Pizza[] pizzaDB=new Pizza[10]; 
	private static int indexCounter=0;
	
	
	public void addNewPizza(Pizza e) throws PizzaAlreadyExistsException
	{
		if(indexCounter!=0)
		{
		for(int i=0; i<pizzaDB.length; i++)
		{
			Pizza arr=pizzaDB[i];
			if(arr.getPizzaName().equals(e.getPizzaName()))
			{
				throw new PizzaAlreadyExistsException("Already present!");
			}
		}
		}
		//e.setPizzaName("Pizza "+(indexCounter+1));
		pizzaDB[indexCounter++]=e;	
	}

	
	public Pizza getPizzaByName(String pizzaname)throws NoPizzaFoundExceptions
	{
		Pizza p=null;
		int flag=0;
		Pizza available[]=availablePizza();
		for(int i=0; i<available.length; i++)
		{
			Pizza pi=available[i];
			if(pi.getPizzaName().equals(pizzaname))
				{
				p=pi;
				flag=1;
				break;
				}
		}
		if(flag==0)
			throw new NoPizzaFoundExceptions("No pizza found!");
		return p;
	}

	
	public Pizza[] getPizzaNamesBySize(int size) throws NoPizzaFoundExceptions {
		// TODO Auto-generated method stub
		Pizza pizzaTempSize[]=new Pizza[indexCounter];
		Pizza pizzaSize[]=new Pizza[indexCounter];
		Pizza available[]=availablePizza();
		int count=0;
		int flag=0;
		for(int i=0; i<available.length; i++)
		{
			Pizza pi=available[i];
			if(pi.getSizeInCms()==size)
			{
				pizzaTempSize[count++]= pi;
				flag=1;
			}
		}
		for(int i=0;i<count;++i)
			pizzaSize[i]=pizzaTempSize[i];
		if(flag==0)
			throw new NoPizzaFoundExceptions("No pizza found!");
		return pizzaSize;
	}
	
	public Pizza[] availablePizza()
	{
		Pizza[] availablePizzas=new Pizza[indexCounter];
		for(int i=0;i<indexCounter;++i)
			availablePizzas[i]=pizzaDB[i];
		return availablePizzas;
	}

}
