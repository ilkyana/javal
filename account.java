class Account{
private int id ;
private double balance ;
private double annualInterestRate ;

Account(){
 id = 0 ;
 balance = 0 ;
 annualInterestRate = 0 ;
 }

Account(int newid , double newbalance , double newannualInterestRate) {
id = newid;
balance = newbalance;
annualInterestRate = newannualInterestRate ;
}

double getMonthlyInterestRate(){
 return annualInterestRate / 12 ;
}

double getMonthlyInterest(){
double monthlyInterestRate = annualInterestRate / 12;
return balance * monthlyInterestRate ;
}

double  withdraw(double amount){
return balance - amount;
}

double deposit(double amount){
return balance + amount;
}
}
private class test{
public static void main(String [] args){
Account account = new Account(112 , 20000 , 45/100);
account.withdraw(2500);
account.deposit(3000);
System.out.println("The balance is " + account.balance + " \nThe monthly interest rate is " + account.getMonthlyInterest());
}
}
