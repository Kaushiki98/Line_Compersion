import java.util.*;
public class lineCompersion{
	public static void main(String[] args){
   	Scanner myObj = new Scanner(System.in);
      System.out.println(" Welcome to Line Compersion Computation ");
		System.out.println("Enter four coordinates:");
		int coordinate_x1 = myObj.nextInt();
	   System.out.println(" coordinate_x1: "+ coordinate_x1);
      int coordinate_x2 = myObj.nextInt();
		System.out.println(" coordinate_y1: "+ coordinate_x2);
		int coordinate_y1 = myObj.nextInt();
      System.out.println(" coordinate_x2: "+ coordinate_y1);
		int coordinate_y2 = myObj.nextInt();
      System.out.println(" coordinate_y2: "+ coordinate_y2);
		int length1 = coordinate_x2-coordinate_x1;
      int length2 = coordinate_y2-coordinate_y1;
	      if(length1 == length2){
   	      System.out.println("The length is same");
          }
	}
}
