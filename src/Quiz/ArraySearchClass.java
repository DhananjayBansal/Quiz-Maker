/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java1.*;

/**
 *
 * @author Admin
 */
public class ArraySearchClass {
    public int searchArray(long id[],long var,int a)
    {
        int i;
        for( i=a;i<id.length;i++)
            if(id[i]==var)
               break;
    return i;
    }
    
}
