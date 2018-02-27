package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping("/all")
	public Map<String, Object> getAllWorkController(@RequestBody Condition condition, @RequestBody Work work) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workDao.getAllWorkDao(condition, work).getResult(List.class));
		return theResult;
	}

	@PostMapping("/count")
	public Map<String, Object> getWorkCountController(@RequestBody Condition condition, @RequestBody Work work) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workDao.getWorkCountDao(condition, work).getResult(Integer.class));
		return theResult;
	}

	@PostMapping("/one")
	public Map<String, Object> getWorkController(@RequestBody Work work) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workDao.getWorkDao(work).getResult(Work.class));
		return theResult;
	}

	@PostMapping("/save")
	public Map<String, Object> saveWorkController(@RequestBody Work work) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workDao.saveWorkDao(work).isSuccessed());
		return theResult;
	}

	@PostMapping("/delete")
	public Map<String, Object> deleteWorkController(@RequestBody Work work) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workDao.deleteWorkDao(work).isSuccessed());
		return theResult;
	}

	@PostMapping("/addClick")
	public Map<String, Object> addWorkClick(@RequestBody Work work) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workDao.addWorkClick(work).isSuccessed());
		return theResult;
	}
}
