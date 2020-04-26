public class Box 
{
 private double width;
 private double height ;
 private double length ;
 private String color ;
 private double volume ; // processor 
 
 //normal constructor 
 public Box(double width , double h , double length , String color)
 {
     this.width = width ;
     height = h;
     this.length = length ; 
     this.color = color ;
 }
    
 //settor 
 public void setWidth(double width) {this.width = width ;}
 //gettor 
 public double getWidth() {return width;}
 
 //settor 
 public void setHeight(double heigth) {this.height = height ;}
 //gettor 
 public double getHeight() {return height;}
 
 public void setLength(double length) {this.length = length ;}
 public double getLength() { return length ;}
 
 public void setColor(String color) {this.color = color ;}
 public String getColor() { return color ;} 
 
}