import java.util.Scanner;

public class CircleWithException {
    
    private final float radius;


    public CircleWithException(float radius) throws IllegalArgumentException,Exception{
        this.radius = radius;
        if(radius < 0){throw new IllegalArgumentException();}
        if(radius > 1000){throw new Exception();}
    }
    
    public float getRadius() {
        return radius;
    }

    public float getDiameter(){
        return radius*radius;
    }

    public double getArea(){
        return Math.PI*getDiameter();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        try {
            CircleWithException circle = new CircleWithException(sc.nextFloat());
            System.out.printf("Diameter of circle is %.3f \n",circle.getDiameter());
            System.out.printf("Area of circle is %.3f \n",circle.getArea());
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
