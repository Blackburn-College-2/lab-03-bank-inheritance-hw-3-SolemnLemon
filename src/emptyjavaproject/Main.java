/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author paul.kline
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account a=new Account();
        a.deposit(new Money(new Currency("dollars","$"),10.0));
             a.withdrawl(new Money(new Currency("dollars","$"),200.0));
             a.withdrawl(new Money(new Currency("dollars","$"),250.0));
             a.withdrawl(new Money(new Currency("dollars","$"),2.0));
             a.withdrawl(new Money(new Currency("dollars","$"),34.0));
              a.deposit(new Money(new Currency("dollars","$"),50.0));
               a.deposit(new Money(new Currency("dollars","$"),70.0));
                a.deposit(new Money(new Currency("dollars","$"),110.0));
                 a.deposit(new Money(new Currency("dollars","$"),60.0));
                  a.deposit(new Money(new Currency("dollars","$"),43.0));
        a.printHistory();
    }
    
}
