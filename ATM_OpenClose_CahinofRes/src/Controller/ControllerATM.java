/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Withdraw.*;

/**
 *
 * @author BSE193121
 */
public class ControllerATM {
   
    
    public ControllerATM(){}
    
    public String demo(int Amount){
       if(Amount % 500 == 0){
           Withdraw500 w500 = new Withdraw500(null);
           Withdraw1000 w1000 = new Withdraw1000(w500);
           Withdraw5000 w5000 = new Withdraw5000(w1000);
           w5000.withdraw(Amount);
           return String.valueOf("Dispatch 5000: " + w5000.getDispatchAmount()
                   + "  Dispatch 1000 : " + w1000.getDispatchAmount()
                   + "  Dispatch 500 : " + w500.getDispatchAmount());
       }
       return "Enter Multiple of 500";
    }
}
