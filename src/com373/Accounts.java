/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com373;

/**
 *
 * @author Mac
 */
public abstract class Accounts 
{
    float amount;
    float deposit;
    float withdrawal;
    
    public void createDeposit(float dep)
    {
        deposit = dep;
        amount += deposit;
        deposit = 0;
    }
    public void createWithdrawal(float wit)
    {
        withdrawal = wit;
        amount -= withdrawal;
        withdrawal = 0;
    }
}

