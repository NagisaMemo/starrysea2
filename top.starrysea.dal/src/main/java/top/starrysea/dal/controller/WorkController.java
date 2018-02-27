package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.dal.common.Condition;
import top.starrysea.dal.dao.IWorkDao;
import top.starrysea.dal.entity.Work;

import static top.starrysea.dal.common.Const.RESULT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/work")
public class WorkController {

	@Autowired
	private IWorkDao workDao;

	@RequestMapping("/all")
	public Map<String, Object> getAllWorkController(Condition condition, Work work) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workDao.getAllWorkDao(condition, work).getResult(List.class));
		return theResult;
	}

	@RequestMapping("/count")
	public Map<String, Object> getWorkCountController(Condition condition, Work work) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workDao.getWorkCountDao(condition, work).getResult(Integer.class));
		return theResult;
	}

	@RequestMapping("/one")
	public Map<String, Object> getWorkController(Work work) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workDao.getWorkDao(work).getResult(Work.class));
		return theResult;
	}

	@RequestMapping("/save")
	public Map<String, Object> saveWorkController(Work work) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workDao.saveWorkDao(work).isSuccessed());
		return theResult;
	}

	@RequestMapping("/delete")
	public Map<String, Object> deleteWorkController(Work work) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workDao.deleteWorkDao(work).isSuccessed());
		return theResult;
	}

	@RequestMapping("/addClick")
	public Map<String, Object> addWorkClick(Work work) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workDao.addWorkClick(work).isSuccessed());
		return theResult;
	}
}
