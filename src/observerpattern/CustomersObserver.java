/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author Eleni
 */
public class CustomersObserver extends Customers implements Observer {

    protected Product product = new Product();
    public CustomersObserver(String name,String surname){
    super(name,surname);
    }
    
    @Override
    public void update(Product product) {
        System.out.println("product  " + product + " has been updated!");
    }
    
}
