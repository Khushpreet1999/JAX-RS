/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import javax.ejb.Stateless;

/**
 *
 * @author khushpreetkaurgulati
 */
@Stateless
public class Week5 {

    public String getCurrentDay()
    {
        return "Tuesday";
    }
    public String isItSunday(String day)
    {
        if(day.equalsIgnoreCase("Sunday"))
        {
            return "It is Sunday";
        }
        else
        {
            return "Not a Sunday";
        }
    }
}
