import java.util.*;
public class AreaShapes {

    public static void main( String args[] )
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 8 coordinates for Trapezoid");
        Trapezoid tr = new Trapezoid(s.nextInt(), s.nextInt(),s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
        System.out.println("Enter 8 coordinates for Parallelogram");
        Parallelogram pr = new Parallelogram(s.nextInt(), s.nextInt(),s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
        System.out.println("Enter 8 coordinates for Rectangle");
        Rectangle re = new Rectangle(s.nextInt(), s.nextInt(),s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
        System.out.println("Enter 8 coordinates for Square");
        Square sq = new Square(s.nextInt(), s.nextInt(),s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());

        System.out.println(tr.show() + "\n" + pr.show() + "\n" + re.show() + "\n" + sq.show());

    }
}
