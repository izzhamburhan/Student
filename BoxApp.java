import java.util.Scanner ;
public class BoxApp 
{
   public static void main(String...args)
  {
    Scanner input = new Scanner(System.in);
   
    System.out.print("Enter width : ");
    double width = input.nextDouble();
    System.out.print("Enter height : ");
    double height = input.nextDouble();
    System.out.print("Enter length : ");
    double length = input.nextDouble();
    System.out.print("Enter a Colour : ");
    String color = input.next();
    
    Box box = new Box(width , height , length , color );
    
    System.out.println("The width is " + box.getWidth() );
    System.out.println("The height is " + box.getHeight() ) ;
    System.out.println("The length is " + box.getLength());
    System.out.println("The colour is " + box.getColor());
  }
}