class Stock{
String symbol;
String name;
double previousClosingPrice ;
double currentPrice;
 Stock(String newsymbol,String newname ){
 symbol = newsymbol;
 name = newname;;
} 
void setpreviousClosingPrice(double newpreviousClosingPrice){
previousClosingPrice = newpreviousClosingPrice;
}
void currentPrice(double newcurrentPrice){
currentPrice = newcurrentPrice;
}
double getChangePercentage(){
return ((currentPrice-previousClosingPrice)/currentPrice) * 100 ;
}
public static void main(String[] args){
Stock stock = new Stock();
stock.Stock( "ORCL" ,"Oracle Corporation");
stock.setpreviousClosingPrice(34.5);
stock.setcurrentPrice (34.35);
System.out.println(stock.getChangePercentage());

}
}
