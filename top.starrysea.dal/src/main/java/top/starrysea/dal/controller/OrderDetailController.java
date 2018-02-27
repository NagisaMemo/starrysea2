package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping("/all")
	public Map<String, Object> getAllOrderDetailController(@RequestBody OrderDetail orderDetail) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDetailDao.getAllOrderDetailDao(orderDetail).getResult(List.class));
		return theResult;
	}

	@PostMapping("/save")
	public Map<String, Object> saveOrderDetailsController(@RequestBody List<OrderDetail> orderDetails) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDetailDao.saveOrderDetailsDao(orderDetails).isSuccessed());
		return theResult;
	}

	@PostMapping("/isExist")
	public Map<String, Object> isOrderDetailExistController(@RequestBody OrderDetail orderDetail) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDetailDao.isOrderDetailExistDao(orderDetail).getResult(Boolean.class));
		return theResult;
	}

	@GetMapping("/xls")
	public Map<String, Object> getAllOrderDetailForXls() {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, orderDetailDao.getAllOrderDetailForXls().getResult(List.class));
		return theResult;
	}
}
