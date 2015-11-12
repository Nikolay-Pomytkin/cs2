package cs2;

import java.util.Scanner;

public class person
{
	private String gender;
	private int ht;
	private int wt;
	private int age;
	private String hairColor;
	private String name;
	private String eyeColor;

	public person()
	{
		gender = "Female";
		ht = 60;
		wt = 115;
		age = 15;
		hairColor = "blonde";
		name = "Lauren";
		eyeColor = "green";
	}
	public person(String g, int h, int w, int a, String hair, String n, String e)
	{
	    this();
		gender = g;
		ht = h;
		wt = w;
		age = a;
		hairColor = hair;
		name = n;
		eyeColor = e;
	}
	public Boolean checkRestrictions(person p){
		if (p.ht <= 75 && p.ht >= 45 && p.wt >= 100 && p.wt <= 250){
			if (p.gender == "Male" || p.gender == "Female"){
				return true;
			} else{return false;}
		} else{return false;}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		person [] people = new person[5];
		for (int i = 0; i < 4; i++){
			System.out.println("What is person #" + i + "'s name?");
			people [i].name = sc.nextLine();
			System.out.println("What is person #" + i + "'s eye color?");
			people [i].eyeColor = sc.nextLine();
			System.out.println("What is person #" + i + "'s gender?");
			people [i].gender = sc.nextLine();
			System.out.println("What is person #" + i + "'s hairColor?");
			people [i].hairColor = sc.nextLine();
			System.out.println("What is person #" + i + "'s height?");
			people [i].ht = sc.nextInt();
			System.out.println("What is person #" + i + "'s age?");
			people [i].age = sc.nextInt();
			System.out.println("What is person #" + i + "'s weight?");
			people [i].wt = sc.nextInt();
			if (checkRestrictions(people[i] == false)){
				System.out.println("Your inputed person did not match the restrictions, please try again:");
			}
		}
	}
}
