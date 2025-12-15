// Area of circle

import java.util.*;

public class AreaOfCircle{
public static void main(String [] args){
System.out.println("enter radius of circle ");
Scanner sc = new Scanner(System.in);
int radius= sc.nextInt();
int Area = 22/7 * radius^2;
System.out.println("The Area of the circle is"+ Area);
}
}