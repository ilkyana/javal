import java.lang.*; 
import java.util.Scanner;
class  QuadraticEquation{
private double a;
private double b;
private double c;
QuadraticEquation(){
}
double geta(){
return a;
}
double getb(){
return b;
}
double getc(){
return c;
}
double getDiscriminant(){
return b*b - 4*a*c ;
}
double getRoot1(){
return ((-b)+Math.sqrt(b*b-4*a*c))/4*a ;
}
double getRoot2(){
return ((-b)-Math.sqrt(b*b-4*a*c))/4*a ;
}
public static void main(String [] args){
QuadraticEquation equation = new QuadraticEquation();
Scanner s = new Scanner(System.in);
System.out.println("Enter the alue of a , b and c");
double a = s.nextInt();
double b = s.nextInt();
double c = s.nextInt();
if(equation.getDiscriminant()>0){
System.out.println("The two roots are" + equation.getRoot1() + "and" + equation.getRoot2());
} else if(equation.getDiscriminant()==0){
System.out.println("The one root is" + equation.getRoot1() );
} else {
System.out.println("The eqyation has no root");
}

}

}
