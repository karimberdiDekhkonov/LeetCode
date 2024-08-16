package org.example.collections;

import org.example.Book;
import org.example.Client;
import org.example.Order;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.*;
import java.util.stream.Collectors;

public class Store implements Add, Find, Sort {
    List<Order> orders = new ArrayList<>();
    List<Book> books = new ArrayList<>();
    List<Client> clients = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public Set<String> findAuthors() {
        return books.stream()
                .map(Book::getAuthor)
                .collect(Collectors.toSet());
    }

    @Override
    public Map<String, List<Order>> findOrdersGroupedByClientId() {
        return null;
    }

    @Override
    public List<String> findMostPopularAuthors() {
        return null;
    }

//    @Override
//    public Map<Long, List<Order>> findOrdersGroupedByClientId() {
//
//        Map<Long, List<Order>> result = new HashMap<>();
//        for (Order order : orders) {
//            boolean containsKey = result.containsKey(order.getClientId());
//            List<Order> list = containsKey ? result.get(order.getClientId()) : new ArrayList<>();
//            result.put(order.getClientId(), list);
//        }
//        return result;
//    }



//    @Override
//    public List<String> findMostPopularAuthors() {
//        Map<String, Long> authorOrderCount = orders.stream()
//                .flatMap(order -> books.get(Math.toIntExact(order.getBookId())))
//                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));
//
//        long maxOrders = Collections.max(authorOrderCount.values());
//
//        return authorOrderCount.entrySet().stream()
//                .filter(entry -> entry.getValue() == maxOrders)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//    }

    @Override
    public List<Book> findBooksWhichPublishedAfterSelectedDate(LocalDate date) {
        return books.stream()
                .filter(book -> book.getPublicationYear().isAfter(date))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findBooksInPriceRange(BigDecimal min, BigDecimal max) {
        return books.stream()
                .filter(book -> book.getPrice().compareTo(min) >= 0 && book.getPrice().compareTo(max) <= 0)
                .collect(Collectors.toList());
    }

    @Override
    public Set<Client> findClientsWithAveragePriceNoLessThan(List<Client> clients, int average) {
        return null;
    }

//    @Override
//    public Set<Client> findClientsWithAveragePriceNoLessThan(List<Client> clients, int average) {
//        return clients.stream()
//                .filter(client -> {
//                    List<Order> clientOrders = orders.stream()
//                            .filter(order -> order.getClientId() == client.getId())
//                            .collect(Collectors.toList());
//                    double avgPrice = clientOrders.stream()
//                            .mapToDouble(order -> order.getBooks().stream().mapToDouble(Book::getPrice).average().orElse(0))
//                            .average().orElse(0);
//                    return avgPrice >= average;
//                })
//                .collect(Collectors.toSet());
//    }

    @Override
    public Set<Order> findOrdersByDate(LocalDateTime dateTime) {
        return orders.stream()
                .filter(order -> order.getOrderDate().equals(dateTime))
                .collect(Collectors.toSet());
    }

    @Override
    public List<Order> sortOrdersByClientId() {
        return orders.stream()
                .sorted(Comparator.comparing(Order::getClientId))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> sortBooksByPublishedYear() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getPublicationYear))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> sortBooksByPriceDesc() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getPrice).reversed())
                .collect(Collectors.toList());
    }
}
