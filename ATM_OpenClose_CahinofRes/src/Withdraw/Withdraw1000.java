/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Withdraw;

/**
 *
 * @author BSE193121
 */
public class Withdraw1000 extends Withdraw{
    Withdraw w;
    int amount;

    public int getDispatchAmount() {
        return amount;
    }

    public void setDispatchAmount(int amount) {
        this.amount = amount;
    }
    
    Withdraw1000(){}
    
    
    public Withdraw1000(Withdraw wd){
        w = wd;
    }
    
    public int withdraw(int amount){
        int dispatch = amount/1000;
        
        System.out.println("1000 : " + dispatch);
        
        int rem = amount % 1000;
        if(rem > 0 && w!=null){
            w.withdraw(rem);
        }
        this.setDispatchAmount(dispatch);
        return dispatch;
    }    
}
