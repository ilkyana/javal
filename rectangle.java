 class ractangle{
double width;
double height;
ractangle(){
width = 1.0;
height = 1.0;
}
ractangle(double newwidth , double newheight){
width = newwidth;
height = newheight;
}
double getwidth(){
return width ;
}
double getheight(){
return height ;
}
double getArea(){
return width*height ;
}
double getPerimeter(){
return 2*(width + height);
}
public static void main(String[] args){
ractangle rac1 = new ractangle();
ractangle rac2 = new ractangle();
rac1.ractangle(4 , 40);
rac1.ractangle(3.5 , 35.9);
System.out.println("The width , height , area and perimeter of first rectangle are " + rac1.getwidth() + rac1.getheight() + rac1.getArea() +rac1.getPerimeter);
System.out.println("The width , height , area and perimeter of second rectangle are " + rac2.getwidth() + rac2.getheight() + rac2.getArea() +rac2.getPerimeter);
}
}
