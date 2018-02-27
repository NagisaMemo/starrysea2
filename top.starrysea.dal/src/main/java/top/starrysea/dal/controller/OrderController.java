package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping("/all")
	public Map<String, Object> getAllOrderController(@RequestBody Condition condition, @RequestBody Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDao.getAllOrderDao(condition, order).getResult(List.class));
		return theResult;
	}

	@PostMapping("/count")
	public Map<String, Object> getOrderCountController(@RequestBody Condition condition, @RequestBody Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDao.getOrderCountDao(condition, order).getResult(Integer.class));
		return theResult;
	}

	@PostMapping("/one")
	public Map<String, Object> getOrderController(@RequestBody Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDao.getOrderDao(order).getResult(Orders.class));
		return theResult;
	}

	@PostMapping("/save")
	public Map<String, Object> saveOrderController(@RequestBody Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDao.saveOrderDao(order).isSuccessed());
		return theResult;
	}

	@PostMapping("/update")
	public Map<String, Object> updateOrderController(@RequestBody Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDao.updateOrderDao(order).isSuccessed());
		return theResult;
	}

	@PostMapping("/delete")
	public Map<String, Object> deleteOrderController(@RequestBody Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDao.deleteOrderDao(order).isSuccessed());
		return theResult;
	}
}
