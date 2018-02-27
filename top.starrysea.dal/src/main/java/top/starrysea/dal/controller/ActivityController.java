package top.starrysea.dal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.dal.common.Condition;
import top.starrysea.dal.dao.IActivityDao;
import top.starrysea.dal.entity.Activity;

import static top.starrysea.dal.common.Const.RESULT;

@RestController
@RequestMapping("/activity")
public class ActivityController {

	@Autowired
	private IActivityDao activityDao;

	@GetMapping("/newest")
	public Map<String, Object> getNewestActivityController() {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.getNewestActivityDao().getResult(Activity.class));
		return theResult;
	}

	@PostMapping("/all")
	public Map<String, Object> getAllActivityController(@RequestBody Condition condition,
			@RequestBody Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.getAllActivityDao(condition, activity).getResult(List.class));
		return theResult;
	}

	@PostMapping("/count")
	public Map<String, Object> getActivityCountController(@RequestBody Condition condition,
			@RequestBody Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.getActivityCountDao(condition, activity).getResult(Integer.class));
		return theResult;
	}

	@PostMapping("/one")
	public Map<String, Object> getActivityController(@RequestBody Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.getActivityDao(activity).getResult(Activity.class));
		return theResult;
	}

	@PostMapping("/save")
	public Map<String, Object> saveActivityController(@RequestBody Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.saveActivityDao(activity).getResult(Integer.class));
		return theResult;
	}

	@PostMapping("/update")
	public Map<String, Object> updateActivityController(@RequestBody Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.updateActivityDao(activity).isSuccessed());
		return theResult;
	}

	@PostMapping("/addMoney")
	public Map<String, Object> updateAddActivityMoneyController(@RequestBody List<Activity> activitys) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.updateAddActivityMoneyDao(activitys).isSuccessed());
		return theResult;
	}

	@PostMapping("/reduceMoney")
	public Map<String, Object> updateReduceActivityMoneyController(@RequestBody Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.updateReduceActivityMoneyDao(activity).isSuccessed());
		return theResult;
	}

	@PostMapping("/delete")
	public Map<String, Object> deleteActivityController(@RequestBody Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.deleteActivityDao(activity).isSuccessed());
		return theResult;
	}

}
