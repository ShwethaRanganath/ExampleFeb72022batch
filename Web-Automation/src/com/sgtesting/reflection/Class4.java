package com.sgtesting.reflection;

public class Class4 {

	public static void main(String[] args) {
		try 
		{
         Class.forName("com.sgtesting.reflection.Sample");
	}catch(Exception e) 
		{
		 e.printStackTrace();
	}

}
}