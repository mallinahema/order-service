package com.bookstore.order_service.OrderService;

    import com.bookstore.order_service.OrderEntity.BookOrder;
    import java.util.List;

    public interface OrderService {
        BookOrder saveOrder(BookOrder order);
        List<BookOrder> getAllOrders();
        BookOrder getOrderById(Long id);
        BookOrder updateOrder(Long id, BookOrder order);
        void deleteOrder(Long id);
    }
