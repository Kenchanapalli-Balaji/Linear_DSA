package General_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Employee
{
	int id;
	String name;
	Double sal;
	public Employee(int id, String name, Double sal) 
	{
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee> emps=new ArrayList<Employee>();
		do
		{
			System.out.println("Enter the id , name & salary");
			int id=sc.nextInt();
			String name=sc.next();
			double sal=sc.nextDouble();
			
			Employee emp=new Employee(id,name,sal);
			emps.add(emp);
			System.out.println("Do you have more employees");
			String res=sc.next();
			if(res.equalsIgnoreCase("no"))
				break;
		}while(true);
		
		System.out.println("Employee Informatio");
		for(Employee emp:emps)
			System.out.println(emp);
		Comparator<Employee> scom=(e1,e2)->
											{
												return (e1.sal.compareTo(e2.sal));
												//return -(e1.sal.compareTo(e2.sal)); // Descending Order
											};
		Collections.sort(emps,scom);
		System.out.println("After Sorting");
		for(Employee emp:emps)
			System.out.println(emp);
		
	}	
	
}
	
	
