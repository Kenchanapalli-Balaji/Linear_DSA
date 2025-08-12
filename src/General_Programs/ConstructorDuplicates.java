package General_Programs;

import java.util.Arrays;

public class ConstructorDuplicates 
{
	int id;
	String name;
	double per;
	
	ConstructorDuplicates(){}
	
	ConstructorDuplicates(int id, String name, double per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	
	ConstructorDuplicates(ConstructorDuplicates dp)
	{
		this.id=dp.id;
		this.name=dp.name;
		this.per=dp.per;
	}
	
	public static void main(String[] args) 
	{
		ConstructorDuplicates o1=new ConstructorDuplicates(1,"Balaji",82.33);
		System.out.println(o1);
		
		ConstructorDuplicates o2=o1; // o2 is alias of o1.. One object can have multiple references
		System.out.println(o2);
		
		ConstructorDuplicates o3=new ConstructorDuplicates(o1);
		System.out.println(o3);// Duplication of constructor it contains different memory location
		
		ConstructorDuplicates o4=new ConstructorDuplicates(new ConstructorDuplicates(2,"Meena",99.99));
		//Here we are creating 2 objects ..one is anonymous .it does not have reference
		System.out.println(o4);
		
		String st=new String("Balaji");
		// here also we are creating 2 Objects.."Balaji" does not have reference
		System.out.println(st);
		
	}
}
