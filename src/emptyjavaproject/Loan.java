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
public class Loan extends Account{
    
    public Loan(Money principle){//principles will be negative 
    super(principle);
    
    }
    
    double interestRate=1.1;
        public void accrue() {

        setBalance(new Money(new Currency("dollars", "$"), getBalance().multiply(this.interestRate)));
    }
        
        public void pay(Money moneyPaid){
        setBalance(new Money(new Currency("dollars", "$"), getBalance().getAmount()+moneyPaid.getAmount()));
        accrue();
            System.out.println("you paid "+moneyPaid.toString()+" on your loan. It is now "+getBalance().toString());
        }
}
