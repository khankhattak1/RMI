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
public class Withdraw500 extends Withdraw{
    Withdraw w;
    int amount;
    
    public int getDispatchAmount() {
        return amount;
    }

    public void setDispatchAmount(int amount) {
        this.amount = amount;
    }
    
    
    
    Withdraw500(){}
    
    
    public Withdraw500(Withdraw wd){
        w = wd;
    }
    
    public int withdraw(int amount){
        int dispatch = amount/500;
        
        System.out.println("500 : " + dispatch);
        
        int rem = amount % 500;
        if(rem > 0 && w!=null){
            w.withdraw(rem);
        }
        this.setDispatchAmount(dispatch);
        return dispatch;
    }    
}
