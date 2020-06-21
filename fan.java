 class Fan{
int slow = 1;
int medium = 2;
int fast = 3;
private int speed = slow ;
boolean on = true , off = false ;
private double radius = 5;
String color = "Blue";
int setspeed(int speed){
return speed;
}
boolean seton(boolean newoff){
on = newoff;
return true;
}
double setradius(double newradius){
radius = newradius;
return radius ;
}
String setcolor(String newcolor){
color = newcolor;
return color;
} 
int getspeed(){
return speed;
}
boolean geton(){
return on;
}
double getradius(){
return radius ;
}
String getcolor(){
return color;
}
Fan(){
}
public static String toString(){
Fan fan = new Fan();
if(on == true ){
System.out.println("Speed of fan is "+ fan.getspeed + "radius of fan is " + fan.getradius + "an color of fan is "+ fan.getcolor);
} else {
System.out.println("fan is off , the color of fan is " + fan.getcolor + "and radius is "+ fan.getradius);

}
return "" ;
}
}

