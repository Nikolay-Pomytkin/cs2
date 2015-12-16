import java.util.*;
import java.lang.*;
import java.io.*;
class card{
	private String suit; /**  **/
	private int value; /** 2-10, 11 = Jack, 12 = Queen, 13 = King, 14 = Ace, 15 = Joker **/
	public card(){
		suit = "none";
		value = 15;
	}
	public card(String s, int v){
		suit = s;
		value = v;
	}
	public String getSuit(){
		return suit;	
	}
	public int getValue(){
		return value;
	}
	public static void main (String[] args) throws java.lang.Exception {
	card c = new card("Spades", 5);
	card b = new card("Diamonds", 8);
	System.out.println("The largest value card is: " + Math.max(c.getValue(), b.getValue()));
	}
}
