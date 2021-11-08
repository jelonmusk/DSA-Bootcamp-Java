import java.util.Scanner;
import java.lang.Math;
public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float pi =3.14f;
        System.out.println("Enter radius of circle:" );
        float radius = input.nextFloat();
        float area = pi*radius*radius;
        System.out.println("Area of circle: " + area);
        input.close();
    }
}
