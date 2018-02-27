package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.common.Condition;
import top.starrysea.common.DaoResult;
import top.starrysea.dal.dao.IOrderDao;
import top.starrysea.dal.entity.Orders;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private IOrderDao orderDao;

	@PostMapping("/all")
	public DaoResult getAllOrderDao(@RequestBody Orders order, @RequestParam("page") int page) {
		return orderDao.getAllOrderDao(new Condition(page), order);
	}

	@PostMapping("/count")
	public DaoResult getOrderCountDao(@RequestBody Orders order, @RequestParam("page") int page) {
		return orderDao.getOrderCountDao(new Condition(page), order);
	}

	@PostMapping("/one")
	public DaoResult getOrderDao(@RequestBody Orders order) {
		return orderDao.getOrderDao(order);
	}

	@PostMapping("/save")
	public DaoResult saveOrderDao(@RequestBody Orders order) {
		return orderDao.saveOrderDao(order);
	}

	@PostMapping("/update")
	public DaoResult updateOrderDao(@RequestBody Orders order) {
		return orderDao.updateOrderDao(order);
	}

	@PostMapping("/delete")
	public DaoResult deleteOrderDao(@RequestBody Orders order) {
		return orderDao.deleteOrderDao(order);
	}
}
