package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping("/all")
	public Map<String, Object> getAllWorkTypeController(WorkType workType) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.getAllWorkTypeDao(workType).getResult(List.class));
		return theResult;
	}

	@RequestMapping("/stock")
	public Map<String, Object> getWorkTypeStockController(WorkType workType) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.getWorkTypeStockDao(workType).getResult(Integer.class));
		return theResult;
	}

	@RequestMapping("/name")
	public Map<String, Object> getWorkTypeNameController(WorkType workType) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.getWorkTypeNameDao(workType).getResult(WorkType.class));
		return theResult;
	}

	@RequestMapping("/save")
	public Map<String, Object> saveWorkTypeController(List<WorkType> workTypes) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.saveWorkTypeDao(workTypes).isSuccessed());
		return theResult;
	}

	@RequestMapping("/delete")
	public Map<String, Object> deleteWorkTypeController(WorkType workType) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.deleteWorkTypeDao(workType).isSuccessed());
		return theResult;
	}

	@RequestMapping("/updateStock")
	public Map<String, Object> updateWorkTypeStockController(WorkType workType) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.updateWorkTypeStockDao(workType).isSuccessed());
		return theResult;
	}

	@RequestMapping("/reduceStock")
	public Map<String, Object> reduceWorkTypeStockController(WorkType workType) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.reduceWorkTypeStockDao(workType).isSuccessed());
		return theResult;
	}

	@RequestMapping("/updateStockByOrder")
	public Map<String, Object> updateWorkTypeStockController(Orders order) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.updateWorkTypeStockDao(order).isSuccessed());
		return theResult;
	}

	@RequestMapping("/allForCar")
	public Map<String, Object> getAllWorkTypeForShoppingCarController(List<WorkType> workTypes) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workTypeDao.getAllWorkTypeForShoppingCarDao(workTypes).getResult(List.class));
		return theResult;
	}
}
