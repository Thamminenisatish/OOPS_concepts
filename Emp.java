import java.util.Scanner;
public class Emp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Id:");
		int id=sc.nextInt();
		System.out.print("Enter name:");
		String name=sc.nextLine();
		System.out.print("Enter age:");
		int age=sc.nextInt();
		System.out.print("Enter Salary:");
		int salary=sc.nextInt();
		System.out.print("Enter Designation:");
		String desi=sc.nextLine();

		System.out.println("/***********/");
		System.out.println("ID is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Salary is: "+salary);
		