package top.starrysea.dal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.common.Condition;
import top.starrysea.common.DaoResult;
import top.starrysea.dal.dao.IActivityDao;
import top.starrysea.dal.entity.Activity;

@RestController
@RequestMapping("/activity")
public class ActivityController {

	@Autowired
	private IActivityDao activityDao;

	@GetMapping("/newest")
	public DaoResult getNewestActivityDao() {
		return activityDao.getNewestActivityDao();
	}

	@PostMapping("/all")
	public DaoResult getAllActivityDao(@RequestBody Condition condition,
			@RequestBody Activity activity) {
		return activityDao.getAllActivityDao(condition, activity);
	}

	@PostMapping("/count")
	public DaoResult getActivityCountDao(@RequestBody Condition condition,
			@RequestBody Activity activity) {
		return activityDao.getActivityCountDao(condition, activity);
	}

	@PostMapping("/one")
	public DaoResult getActivityDao(@RequestBody Activity activity) {
		return activityDao.getActivityDao(activity);
	}

	@PostMapping("/save")
	public DaoResult saveActivityDao(@RequestBody Activity activity) {
		return activityDao.saveActivityDao(activity);
	}

	@PostMapping("/update")
	public DaoResult updateActivityDao(@RequestBody Activity activity) {
		return activityDao.updateActivityDao(activity);
	}

	@PostMapping("/addMoney")
	public DaoResult updateAddActivityMoneyDao(@RequestBody List<Activity> activitys) {
		return activityDao.updateAddActivityMoneyDao(activitys);
	}

	@PostMapping("/reduceMoney")
	public DaoResult updateReduceActivityMoneyDao(@RequestBody Activity activity) {
		return activityDao.updateReduceActivityMoneyDao(activity);
	}

	@PostMapping("/delete")
	public DaoResult deleteActivityDao(@RequestBody Activity activity) {
		return activityDao.deleteActivityDao(activity);
	}
}
