
import java.lang.*;
class RegularPolygon{
private int n;
private double side;
private double x ;
private double y ;
RegularPolygon(){
n = 3;
side = 1;
x = 0 ;
y = 0;
}
RegularPolygon( int newn , double newside){
double newx = 0 ; 
double newy = 0 ;
x = newx;
y = newy;
n = newn;
side= newside;
}
RegularPolygon(int newn ,double newside, double newx , double newy ){
n =newn   ;
side = newside ;
y = newy;
x = newx;
}
int getn(){
return n;
}
double getx(){
return x;
}
double gety(){
return y;
}
double getside(){
return side;
}
void setx(double newx){
x = newx;
}
void setn(int newn){
n = newn;
}
void sety(double newy){
y = newy;
}
void setside(double newside){
side = newside;
}
double getPerimeter(){
  return n * side;
}
double angle= Math.toRadians(180/n);
double angle=Math.tan(angle); 
double getArea(){

return (n*side*side)/4*angle ; 

}
public static void main(String[] args){
RegularPolygon polygon1 = new RegularPolygon();
RegularPolygon polygon2 = new RegularPolygon();
RegularPolygon polygon3 = new RegularPolygon();
polygon.RegularPolygon();
polygon.RegularPolygon(6, 4);
polygon.RegularPolygon(10,4, 5.6, 7.8);
System.out.println("The area and perimeter of polygon1 are " + polygon1.getArea() + "and " + polygon1.getPerimeter());
System.out.println("The area and perimeter of polygon2 are " + polygon2.getArea() + "and " + polygon2.getPerimeter());
System.out.println("The area and perimeter of polygon3 are " + polygon3.getArea() + "and " + polygon3.getPerimeter());


}
}
