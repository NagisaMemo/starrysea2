package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.dal.dao.IOrderDetailDao;
import top.starrysea.dal.entity.OrderDetail;

import static top.starrysea.dal.common.Const.RESULT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {

	@Autowired
	private IOrderDetailDao orderDetailDao;

	@RequestMapping("/all")
	public Map<String, Object> getAllOrderDetailController(OrderDetail orderDetail) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDetailDao.getAllOrderDetailDao(orderDetail).getResult(List.class));
		return theResult;
	}

	@RequestMapping("/save")
	public Map<String, Object> saveOrderDetailsController(List<OrderDetail> orderDetails) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDetailDao.saveOrderDetailsDao(orderDetails).isSuccessed());
		return theResult;
	}

	@RequestMapping("/isExist")
	public Map<String, Object> isOrderDetailExistController(OrderDetail orderDetail) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDetailDao.isOrderDetailExistDao(orderDetail).getResult(Boolean.class));
		return theResult;
	}

	@RequestMapping("/xls")
	public Map<String, Object> getAllOrderDetailForXls() {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDetailDao.getAllOrderDetailForXls().getResult(List.class));
		return theResult;
	}
}
