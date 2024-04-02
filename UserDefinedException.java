package com.java;
class MeraException extends Exception
{
	private int ex;
	
	public MeraException(int ex)
	{
		super();
		this.ex=ex;
	}

	@Override
	public String toString() {
		return "MeraException [ex=" + ex + "]";
	}
	
}
public class UserDefinedException {
	
	void sum(int a,int b) throws MeraException
	{
		if(a<0)
		{
			throw new MeraException(a);
		}
	}

	public static void main(String[] args) {
		

	}

}
