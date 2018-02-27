package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.dal.dao.IWorkTypeDao;
import top.starrysea.dal.entity.Orders;
import top.starrysea.dal.entity.WorkType;

import static top.starrysea.dal.common.Const.RESULT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workType")
public class WorkTypeController {

	@Autowired
	private IWorkTypeDao workTypeDao;

	@PostMapping("/all")
	public Map<String, Object> getAllWorkTypeController(@RequestBody WorkType workType) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.getAllWorkTypeDao(workType).getResult(List.class));
		return theResult;
	}

	@PostMapping("/stock")
	public Map<String, Object> getWorkTypeStockController(@RequestBody WorkType workType) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.getWorkTypeStockDao(workType).getResult(Integer.class));
		return theResult;
	}

	@PostMapping("/name")
	public Map<String, Object> getWorkTypeNameController(@RequestBody WorkType workType) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.getWorkTypeNameDao(workType).getResult(WorkType.class));
		return theResult;
	}

	@PostMapping("/save")
	public Map<String, Object> saveWorkTypeController(@RequestBody List<WorkType> workTypes) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.saveWorkTypeDao(workTypes).isSuccessed());
		return theResult;
	}

	@PostMapping("/delete")
	public Map<String, Object> deleteWorkTypeController(@RequestBody WorkType workType) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.deleteWorkTypeDao(workType).isSuccessed());
		return theResult;
	}

	@PostMapping("/updateStock")
	public Map<String, Object> updateWorkTypeStockController(@RequestBody WorkType workType) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.updateWorkTypeStockDao(workType).isSuccessed());
		return theResult;
	}

	@PostMapping("/reduceStock")
	public Map<String, Object> reduceWorkTypeStockController(@RequestBody WorkType workType) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.reduceWorkTypeStockDao(workType).isSuccessed());
		return theResult;
	}

	@PostMapping("/updateStockByOrder")
	public Map<String, Object> updateWorkTypeStockController(@RequestBody Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.updateWorkTypeStockDao(order).isSuccessed());
		return theResult;
	}

	@PostMapping("/allForCar")
	public Map<String, Object> getAllWorkTypeForShoppingCarController(@RequestBody List<WorkType> workTypes) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.getAllWorkTypeForShoppingCarDao(workTypes).getResult(List.class));
		return theResult;
	}
}
