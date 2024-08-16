package org.example.collections;

import org.example.Book;
import org.example.Order;

import java.util.List;

public interface Sort {
    List<Order> sortOrdersByClientId();

    List<Book> sortBooksByPublishedYear();

    List<Book> sortBooksByPriceDesc();
}
