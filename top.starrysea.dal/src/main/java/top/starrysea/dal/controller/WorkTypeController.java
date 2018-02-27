package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.common.DaoResult;
import top.starrysea.dal.dao.IWorkTypeDao;
import top.starrysea.dal.entity.Orders;
import top.starrysea.dal.entity.WorkType;

import java.util.List;

@RestController
@RequestMapping("/workType")
public class WorkTypeController {

	@Autowired
	private IWorkTypeDao workTypeDao;

	@PostMapping("/all")
	public DaoResult getAllWorkTypeDao(@RequestBody WorkType workType) {
		return workTypeDao.getAllWorkTypeDao(workType);
	}

	@PostMapping("/stock")
	public DaoResult getWorkTypeStockDao(@RequestBody WorkType workType) {
		return workTypeDao.getWorkTypeStockDao(workType);
	}

	@PostMapping("/name")
	public DaoResult getWorkTypeNameDao(@RequestBody WorkType workType) {
		return workTypeDao.getWorkTypeNameDao(workType);
	}

	@PostMapping("/save")
	public DaoResult saveWorkTypeDao(@RequestBody List<WorkType> workTypes) {
		return workTypeDao.saveWorkTypeDao(workTypes);
	}

	@PostMapping("/delete")
	public DaoResult deleteWorkTypeDao(@RequestBody WorkType workType) {
		return workTypeDao.deleteWorkTypeDao(workType);
	}

	@PostMapping("/updateStock")
	public DaoResult updateWorkTypeStockDao(@RequestBody WorkType workType) {
		return workTypeDao.updateWorkTypeStockDao(workType);
	}

	@PostMapping("/reduceStock")
	public DaoResult reduceWorkTypeStockDao(@RequestBody WorkType workType) {
		return workTypeDao.reduceWorkTypeStockDao(workType);
	}

	@PostMapping("/updateStockByOrder")
	public DaoResult updateWorkTypeStockDao(@RequestBody Orders order) {
		return workTypeDao.updateWorkTypeStockDao(order);
	}

	@PostMapping("/allForCar")
	public DaoResult getAllWorkTypeForShoppingCarDao(@RequestBody List<WorkType> workTypes) {
		return workTypeDao.getAllWorkTypeForShoppingCarDao(workTypes);
	}
}
