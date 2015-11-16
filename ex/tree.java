package cs2new;
import java.util.Random;
public class circle
{
	private String name;
	private double radius, diameter, area, circumfrence;
	public circle(){
		name = "c";
	}
	public circle(String n, int var){
		Random r  = new Random();
		setRadius((double) r.nextInt(10));
	}

	public void setName(String n){
		name = n;
	}
	public void setRadius(double d){
		radius = d;
	}
	public void setDiameter(double d){
		diameter = d;
	}
	public void setArea(double d){
		area = d;
	}
	public void setCircumference(double d){
		circumference = d;
	}
	public static void main(String[] args)
	{
		circle c [];
		c = new circle [100];
		for(int i = 0; i<100; i++){
		}
	}

}
