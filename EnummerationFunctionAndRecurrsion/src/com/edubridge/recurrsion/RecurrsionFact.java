package com.edubridge.recurrsion;

public class RecurrsionFact {
	int fact(int num)
	{
		if (num<=1)
		{
			return 1;
		}
		else
		{
			return num=num*fact(num-1);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurrsionFact R = new RecurrsionFact();
		System.out.println(R.fact(5));
		 
	}

}