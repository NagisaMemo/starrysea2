package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.dal.common.Condition;
import top.starrysea.dal.dao.IOrderDao;
import top.starrysea.dal.entity.Orders;

import static top.starrysea.dal.common.Const.RESULT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private IOrderDao orderDao;

	@RequestMapping("/all")
	public Map<String, Object> getAllOrderController(Condition condition, Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDao.getAllOrderDao(condition, order).getResult(List.class));
		return theResult;
	}

	@RequestMapping("/count")
	public Map<String, Object> getOrderCountController(Condition condition, Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDao.getOrderCountDao(condition, order).getResult(Integer.class));
		return theResult;
	}

	@RequestMapping("/one")
	public Map<String, Object> getOrderController(Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDao.getOrderDao(order).getResult(Orders.class));
		return theResult;
	}

	@RequestMapping("/save")
	public Map<String, Object> saveOrderController(Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDao.saveOrderDao(order).isSuccessed());
		return theResult;
	}

	@RequestMapping("/update")
	public Map<String, Object> updateOrderController(Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDao.updateOrderDao(order).isSuccessed());
		return theResult;
	}

	@RequestMapping("/delete")
	public Map<String, Object> deleteOrderController(Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDao.deleteOrderDao(order).isSuccessed());
		return theResult;
	}
}
