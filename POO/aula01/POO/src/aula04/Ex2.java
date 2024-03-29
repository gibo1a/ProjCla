package aula04;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex2 {
    class Product {
        private String name;
        private double price;
        private int quantity;
    
        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    
        public double getTotalValue() {
            return price * quantity;
        }
    
        public String getName() {
            return name;
        }
    
        public double getPrice() {
            return price;
        }
    
        public int  getQuantity() {
            return quantity;
        }
    }
    
    
    class CashRegister {
        private Product[] lista;
        public CashRegister(Product[] lista){
            this.lista = lista;
        }
        void addProduct(Product prod){
            ArrayList<Product> arrlist = new ArrayList<Product>(Arrays.asList(lista));
            arrlist.add(prod);
            lista = arrlist.toArray(lista);


        }
    
    }
    
    public class CashRegisterDemo {
    
        public void main(String[] args) {
            CashRegister cr = new CashRegister(new Product[5]);
            cr.addProduct(new Product("Book", 9.99, 3));
            cr.addProduct(new Product("Pen", 1.99, 10));
            cr.addProduct(new Product("Headphones", 29.99, 2));
            cr.addProduct(new Product("Notebook", 19.99, 5));
            cr.addProduct(new Product("Phone case", 5.99, 1));
            System.out.println(cr);
    
        }
    }
    
}
