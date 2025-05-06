package com.bookstore.order_service.OrderRepositary;

    import com.bookstore.order_service.OrderEntity.BookOrder;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface OrderRepo extends JpaRepository<BookOrder,Long>{
    }

