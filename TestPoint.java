import java.util.*;
public class TestPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x1 and y1 Co-Ordianates of a point");
		double x1,y1,x2,y2,res,res1;
		x1= sc.nextDouble();
		y1= sc.nextDouble();
		System.out.println("Enter the x2 and y2 Co-Ordianates of a point");
		x2= sc.nextDouble();
		y2= sc.nextDouble();
		Point1 P = new Point1(x1,y1);
		//Point1 Q = new Point1();
		Point1 Q = new Point1(x2,y2);
		//res = P.distanceFromOrigin();
		//System.out.println("Distance from origin is "+res);
		//res1 = Q.distanceFromOrigin();
		//System.out.println("Distance from  Origin"+res1);
		res = P.distanceFromPoint(Q);
		System.out.println("Distance from point p to Q is "+res);
		

	}//Main()
}//TestPoint
