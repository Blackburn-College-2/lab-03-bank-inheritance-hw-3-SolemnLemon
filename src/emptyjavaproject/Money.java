/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author sunbe
 */
public class Money extends Currency {


    Currency currency;
    double amount=0.0;
    
    public Money(Currency currency, double amount ) {
        super(currency.getName(),currency.getSymbol());
        this.currency = currency;
        this.amount=amount;
    }
    
    public String getAmountString(){
    return amount+getCurrency().getName();
    
    }
    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public String toString(){
    
    return getAmount()+""+getSymbol()+" "+getName();
    }
}
