package Esercizio8;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Product prodotto1 = new Product(1, "Harry", "books", 100.8);
        Product prodotto2 = new Product(2, "Videogames", "books", 150.8);
        Product prodotto3 = new Product(3, "DragonBall", "Baby", 20.0);
        Product prodotto4 = new Product(4, "Football", "Boys", 300.0);
        Customer customer = new Customer(1, "Simone", 1);


        List<Product> productList = List.of(prodotto1, prodotto2, prodotto3, prodotto4);

        Customer customer2 = new Customer(2, "Anna", 2);

        Order ordine1 = new Order(1, "ciao", LocalDate.of(2021, 3, 8), LocalDate.of(2021, 3, 10), productList, customer);
        Order ordine2 = new Order(2, "Order 2", LocalDate.of(2021, 3, 8), LocalDate.of(2021, 3, 10), productList, customer);

        List<Order> orders = List.of(ordine1, ordine2);


        List<Product> bookList = productList.stream()
                .filter(p -> p.getCategory().equals("books") && p.getPrice() > 100)
                .collect(Collectors.toList());

        System.out.println(" 1) Lista prodotti che hanno categoria Books  " + bookList);

        List<Order> BabyOrder = orders.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory().equals("Baby")))
                .collect(Collectors.toList());

        System.out.println("2) Lista ordini che hanno prodotti di categoria Baby   " + BabyOrder);

        List<Product> scontoProdotti = productList.stream()
                .filter(p -> "Boys".equals(p.getCategory()))
                .peek(p -> p.Sconto(10))
                .collect(Collectors.toList());


        System.out.println("3)  Prodotti boys sconto    " + scontoProdotti);
    }
}