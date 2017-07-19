package training.java8.order.repo;

import training.java8.order.entity.OrderLine;

public interface OrderLineRepository {

	void delete(OrderLine line);

	void insert(OrderLine liveLine);

	void update(OrderLine line);

}
