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
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Product product = new Product("jeans", 1, 36, "blue");
        Observer customer1 = new CustomersObserver("Bilbo","Bagins");
        Observer customer2 = new CustomersObserver("Tony","Stark");

        product.addObserver(customer1);
         product.addObserver(customer2);

        
        product.notifyAllCustomers(new Product("jeans", 1, 40, "white"));

        product.removeObserver(customer1);
        product.removeObserver(customer2);

    }

}
