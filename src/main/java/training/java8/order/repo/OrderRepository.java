package training.java8.order.repo;

import training.java8.order.entity.Order;

public interface OrderRepository {
	void save(Order order);
}
