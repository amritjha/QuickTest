/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.businessLogic.quickTest;

/**
 *
 * @author Rajat
 */
public class utility {
    
    public String mapDepCode(int depCode)
    {
        switch(depCode)
        {
            case 1: return "Computer Science Engineering";
            case 2: return "Electronics Engineering";
            case 3: return "Mechanical Engineering";
            case 4: return "Electrical Engineering";
            case 5: return "Civil Engineering";
            case 6: return "Chemical Engineering";
            case 7: return "instrumentation & Production";
        }
        return "";
    }
    
}
