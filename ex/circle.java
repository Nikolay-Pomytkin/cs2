package circle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
public class circle
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("/Users/18pomytkinn/NetBeansProjects/circle/src/circle/names.txt");
        Scanner sc = new Scanner(file);
        circle c[];
        c = new circle[100];
        for(int i = 0; i < 100; i++)   
        {   
            c[i] = new circle(sc.next(), 2);
            System.out.println(c[i].name);
        }
    }
    // Class variables
    private String name;
    private double circumference, area, radius, diameter;
    // default constructor
    public circle()
    {
        name = "normal circle";
        radius = 1;
        area = 3.1415;
        diameter = 2;
        circumference = 6.283;
    }
    // overloaded constructor
    public circle(String n, int r)
    {
        name = n;
        this.setVars(r);
    }
    // method to set all variables based on entered radius
    public void setVars(int r){
        radius = r;
        area = 3.1415 * r * r;
        diameter = 2 * r;
        circumference = 2 * r * 3.1415;
    }
}
