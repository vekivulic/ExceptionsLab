/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author vekivulic
 */
public class StartUp {
    public static void main (String[] args){
        String s="hello";
        StringService service=new StringService();
        
        try{
            service.saveText(s);
        }
                catch(IllegalArgumentException e2){
                        System.out.println(e2.getMessage());
                        }
            }
        }
    

