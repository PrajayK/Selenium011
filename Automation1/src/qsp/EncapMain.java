package qsp;

public class EncapMain {

	public static void main(String[] args) 
	{
		encap e=new encap(10);
		int x=e.Getvalue();
		System.out.println(x);
		e.SetValues(40);
		System.out.println(e.Getvalue());
	}

}
