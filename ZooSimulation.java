package edu.nwmissouri.csis;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S545035
 */
public class ZooSimulation {
     static String greeting = "Welcome to Martens";
    
    public static void main(String args[]) {

      System.out.println(greeting.toUpperCase().repeat(2));
      
      Aardvark alice = new Aardvark();
      Martens m=new Martens();
      alice.speak();
      alice.move();
      m.speak();
      m.move();
    }
    
}
