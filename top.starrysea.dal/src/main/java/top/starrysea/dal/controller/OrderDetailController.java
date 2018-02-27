package top.starrysea.dal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.common.DaoResult;
import top.starrysea.dal.dao.IOrderDetailDao;
import top.starrysea.dal.entity.OrderDetail;

@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {

	@Autowired
	private IOrderDetailDao orderDetailDao;

	@PostMapping("/all")
	public DaoResult getAllOrderDetailDao(@RequestBody OrderDetail orderDetail) {
		return orderDetailDao.getAllOrderDetailDao(orderDetail);
	}

	@PostMapping("/save")
	public DaoResult saveOrderDetailsDao(@RequestBody List<OrderDetail> orderDetails) {
		return orderDetailDao.saveOrderDetailsDao(orderDetails);
	}

	@PostMapping("/isExist")
	public DaoResult isOrderDetailExistDao(@RequestBody OrderDetail orderDetail) {
		return orderDetailDao.isOrderDetailExistDao(orderDetail);
	}

	@GetMapping("/xls")
	public DaoResult getAllOrderDetailForXls() {
		return orderDetailDao.getAllOrderDetailForXls();
	}
}
