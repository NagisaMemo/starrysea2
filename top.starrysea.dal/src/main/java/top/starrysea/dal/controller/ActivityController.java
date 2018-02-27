package top.starrysea.dal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping("/newest")
	public Map<String, Object> getNewestActivityController() {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.getNewestActivityDao().getResult(Activity.class));
		return theResult;
	}

	@RequestMapping("/all")
	public Map<String, Object> getAllActivityController(Condition condition, Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.getAllActivityDao(condition, activity).getResult(List.class));
		return theResult;
	}

	@RequestMapping("/count")
	public Map<String, Object> getActivityCountController(Condition condition, Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.getActivityCountDao(condition, activity).getResult(Integer.class));
		return theResult;
	}

	@RequestMapping("/one")
	public Map<String, Object> getActivityController(Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.getActivityDao(activity).getResult(Activity.class));
		return theResult;
	}

	@RequestMapping("/save")
	public Map<String, Object> saveActivityController(Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.saveActivityDao(activity).getResult(Integer.class));
		return theResult;
	}

	@RequestMapping("/update")
	public Map<String, Object> updateActivityController(Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.updateActivityDao(activity).isSuccessed());
		return theResult;
	}

	@RequestMapping("/addMoney")
	public Map<String, Object> updateAddActivityMoneyController(List<Activity> activitys) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.updateAddActivityMoneyDao(activitys).isSuccessed());
		return theResult;
	}

	@RequestMapping("/reduceMoney")
	public Map<String, Object> updateReduceActivityMoneyController(Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.updateReduceActivityMoneyDao(activity).isSuccessed());
		return theResult;
	}

	@RequestMapping("/delete")
	public Map<String, Object> deleteActivityController(Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityDao.deleteActivityDao(activity).isSuccessed());
		return theResult;
	}

}
