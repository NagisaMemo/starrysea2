package top.starrysea.order.dao;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import top.starrysea.order.object.dto.OrderDetail;

@FeignClient(name = "starrysea-dal")
public interface IOrderDetailDao {

	@RequestMapping(value = "/orderDetail/all", method = RequestMethod.POST)
	public List<OrderDetail> getAllOrderDetailDao(@RequestBody OrderDetail orderDetail);

	@RequestMapping(value = "/orderDetail/save", method = RequestMethod.POST)
	public Boolean saveOrderDetailsDao(@RequestBody List<OrderDetail> orderDetails);

	@RequestMapping(value = "/isExist", method = RequestMethod.POST)
	public Boolean isOrderDetailExistDao(@RequestBody OrderDetail orderDetail);

	@RequestMapping(value = "/orderDetail/xls", method = RequestMethod.GET)
	public List<OrderDetail> getAllOrderDetailForXls();
}
