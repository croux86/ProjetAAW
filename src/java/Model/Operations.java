/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;

/**
 *
 * @author Gaetan
 */
public class Operations {
    private final double AMOUNT;
    private final Accounts FROM;
    private final Calendar DATE;
    
    Operations(double amount, Accounts debit, Calendar date){
        this.AMOUNT=amount;
        this.FROM=debit;
        this.DATE=date;
    }
}
