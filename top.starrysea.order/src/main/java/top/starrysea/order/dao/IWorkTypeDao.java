package top.starrysea.order.dao;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import top.starrysea.order.object.dto.Orders;
import top.starrysea.order.object.dto.WorkType;

@FeignClient(name = "starrysea-dal")
public interface IWorkTypeDao {

	@RequestMapping(value = "/all", method = RequestMethod.POST)
	public List<WorkType> getAllWorkTypeDao(@RequestBody WorkType workType);

	@RequestMapping(value = "/stock", method = RequestMethod.POST)
	public Integer getWorkTypeStockDao(@RequestBody WorkType workType);

	@RequestMapping(value = "/name", method = RequestMethod.POST)
	public WorkType getWorkTypeNameDao(@RequestBody WorkType workType);

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Boolean saveWorkTypeDao(@RequestBody List<WorkType> workTypes);

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public Boolean deleteWorkTypeDao(@RequestBody WorkType workType);

	@RequestMapping(value = "/updateStock", method = RequestMethod.POST)
	public Boolean updateWorkTypeStockDao(@RequestBody WorkType workType);

	@RequestMapping(value = "/reduceStock", method = RequestMethod.POST)
	public Boolean reduceWorkTypeStockDao(@RequestBody WorkType workType);

	@RequestMapping(value = "/updateStockByOrder", method = RequestMethod.POST)
	public Boolean updateWorkTypeStockDao(@RequestBody Orders order);

	@RequestMapping(value = "/allForCar", method = RequestMethod.POST)
	public List<WorkType> getAllWorkTypeForShoppingCarDao(@RequestBody List<WorkType> workTypes);
}
