/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.pattern;

/**
 *
 * @author imran
 */
public class Circle implements Shape{
    @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }
}
