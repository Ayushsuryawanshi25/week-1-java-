//Celsius to Fahrenheit

import java.util.*;

public class CelsiusToFahrenheit{
public static void main(String [] args){
System.out.print("enter the temperature in Celsius"+" ";
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y =(x * 9/5) + 32;
System.out.print("The temperature in Fahreneit" + " " + y);
}
}