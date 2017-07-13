package trading.program;
public class Trade_details
{
String cName,cCode;
String cPrice,nifty_listed;
public Trade_details()
{

}
public String getcCode()
{
    return cCode;
}
public void setcCode(String cCode)
{
    this.cCode=cCode;
}
public String getcName()
{
    return cName;
} 
public void setcName(String cName)
{
    this.cName=cName;
}
public String getcPrice()
{
    return cPrice;
}
public void setcPrice(String cPrice)
{
    this.cPrice=cPrice;
}
public String getNifty_listed()
{
    return nifty_listed;
}
public void setNifty_listed(String nifty_listed)
{
    this.nifty_listed=nifty_listed;
}
public String toString()
{
      return cCode+" "+cName+" "+cPrice+" "+nifty_listed;
       
}

}
