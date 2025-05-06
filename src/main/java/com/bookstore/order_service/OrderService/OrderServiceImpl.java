package com.bookstore.order_service.OrderService;

import com.bookstore.order_service.OrderEntity.BookOrder;
import com.bookstore.order_service.OrderRepositary.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepository;

    public BookOrder saveOrder(BookOrder order) {
        return orderRepository.save(order);
    }

    public List<BookOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    public BookOrder getOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
    }

    public BookOrder updateOrder(Long id, BookOrder order) {
        BookOrder existing = getOrderById(id);
        existing.setUserid(order.getUserid());
        existing.setBookName(order.getBookName());
        existing.setQuantity(order.getQuantity());
        existing.setPrice(order.getPrice());
        existing.setStatus(order.getStatus());
        return orderRepository.save(existing);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
}
}