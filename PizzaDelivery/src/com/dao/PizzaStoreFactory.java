package com.dao;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.dao.StudentHashSetDaoImpl;

public class PizzaStoreFactory {
	
	public static PizzaStore getPizzaStore(int num)
	{
		if (num==1)
			return PizzaStoreImpl();
		else if (num==2)
			return PizzaListStoreImpl();
		else if (num==3)
			return PizzaSortedStoreImpl();
		else
			return PizzaMapStoreImpl();
			
		
	}

}

