package top.starrysea.activity.dao;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import top.starrysea.activity.object.dto.Activity;

@FeignClient(name = "starrysea-dal")
public interface IActivityDao {

	@RequestMapping(value = "/activity/newest", method = RequestMethod.GET)
	public Activity getNewestActivityDao();

	@RequestMapping(value = "/activity/all", method = RequestMethod.POST)
	public List<Activity> getAllActivityDao(@RequestBody Activity activity, @RequestParam("page") int page);

	@RequestMapping(value = "/activity/count", method = RequestMethod.POST)
	public Integer getActivityCountDao(@RequestBody Activity activity, @RequestParam("page") int page);

	@RequestMapping(value = "/one", method = RequestMethod.POST)
	public Activity getActivityDao(@RequestBody Activity activity);

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Integer saveActivityDao(@RequestBody Activity activity);

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Boolean updateActivityDao(@RequestBody Activity activity);

	@RequestMapping(value = "/addMoney", method = RequestMethod.POST)
	public Boolean updateAddActivityMoneyDao(@RequestBody List<Activity> activitys);

	@RequestMapping(value = "/reduceMoney", method = RequestMethod.POST)
	public Boolean updateReduceActivityMoneyDao(@RequestBody Activity activity);

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public Boolean deleteActivityDao(@RequestBody Activity activity);
}
