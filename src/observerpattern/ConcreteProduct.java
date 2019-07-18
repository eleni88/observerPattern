/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eleni
 */
public class ConcreteProduct {

    private List<Observer> customers = new ArrayList();
    public Product productState;

    public Product getProductState() {
        return productState;
    }

//   public void setProductState(Product product){
//   this.productState = product;
//   notifyAllCustomers();
//   }
    public void updateState(Product product) {
        if (!this.productState.equals(product)) {
            notifyAllCustomers(this.productState);

        }
    }

    public void addObserver(Observer customer) {
        customers.add(customer);
    }

    public void removeObserver(Observer customer) {
        customers.remove(customer);
    }

    public void notifyAllCustomers(Product product) {
        for (Observer customer : customers) {
            customer.update(product);
        }
    }

}
