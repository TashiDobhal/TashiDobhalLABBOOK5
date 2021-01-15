package com.cg.eis.exception;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				Scanner scs = new Scanner(System.in);
				int age = 0;
				int sal = 0;
				String fname = "", lname = "";
				try
				{
					//Question 1
					System.out.print("Enter age:");
					age = sc.nextInt();
					if(age <= 15)
					{
						throw new EmployeeEx("Age should be above 15");
					}
					
					//Question 2
					System.out.print("Enter first name:");
					fname = scs.nextLine();
					System.out.print("Enter last name:");
					lname = scs.nextLine();
					if( fname.isEmpty() &&  lname.isEmpty() )
					{
						throw new EmployeeEx("Please enter a vaild name.");
					}
					
					//question 3
					System.out.print("Enter salary:");
					sal = sc.nextInt();
					if(sal < 3000)
					{
						throw new EmployeeEx("Salary should be greater than Rs.3000.");
					}
				}
			
				catch(Exception e)
				{
					System.out.println(e.getMessage()); 
				}
				
				
				finally
				{
					sc.close();
					scs.close();
				}
			}


	}

