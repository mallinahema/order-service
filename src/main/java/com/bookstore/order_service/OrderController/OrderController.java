package com.bookstore.order_service.OrderController;

    import com.bookstore.order_service.OrderEntity.BookOrder;
    import com.bookstore.order_service.OrderService.OrderService;
    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation .*;

import java.util.List;

    @RestController
    @RequestMapping("/api/orders")
    public class OrderController {

        @Autowired
        private OrderService orderService;

        @PostMapping("/addOrder")
        public BookOrder createOrder(@RequestBody BookOrder order) {
            return orderService.saveOrder(order);
        }

        @GetMapping
        public List<BookOrder> getAllOrders() {
            return orderService.getAllOrders();
        }

        @GetMapping("/{id}")
        public BookOrder getOrderById(@PathVariable Long id) {
            return orderService.getOrderById(id);
        }

        @PutMapping("/{id}")
        public BookOrder updateOrder(@PathVariable Long id, @RequestBody BookOrder order) {
            return orderService.updateOrder(id, order);
        }

        @DeleteMapping("/{id}")
        public BookOrder deleteOrder(@PathVariable Long id) {
            BookOrder deletedOrder = orderService.getOrderById(id);
            orderService.deleteOrder(id);
            return deletedOrder;
        }
    }
