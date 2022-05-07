package com.sgtesting.reflection;

import java.lang.reflect.Method;

public class Class3 {

	public static void main(String[] args) {
	 Sample obj=new Sample();
	{
		try
		{
			Method[] method=obj.getClass().getDeclaredMethods();
			for(int i=0;i<method.length;i++)
			{
				String methodname=method[i].getName();
				System.out.println(methodname);
				method[i].invoke(obj);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	}

}
