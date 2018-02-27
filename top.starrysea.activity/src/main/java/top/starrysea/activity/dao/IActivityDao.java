package top.starrysea.activity.dao;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import top.starrysea.common.DaoResult;
import top.starrysea.activity.object.dto.Activity;

@FeignClient(name = "starrysea-dal")
public interface IActivityDao {

	@RequestMapping(value = "/activity/newest", method = RequestMethod.GET)
	public DaoResult getNewestActivityDao();

	@PostMapping("/all")
	public DaoResult getAllActivityDao(@RequestBody Activity activity, @RequestParam("page") int page);

	@PostMapping("/count")
	public DaoResult getActivityCountDao(@RequestBody Activity activity, @RequestParam("page") int page);

	@PostMapping("/one")
	public DaoResult getActivityDao(@RequestBody Activity activity);

	@PostMapping("/save")
	public DaoResult saveActivityDao(@RequestBody Activity activity);

	@PostMapping("/update")
	public DaoResult updateActivityDao(@RequestBody Activity activity);

	@PostMapping("/addMoney")
	public DaoResult updateAddActivityMoneyDao(@RequestBody List<Activity> activitys);

	@PostMapping("/reduceMoney")
	public DaoResult updateReduceActivityMoneyDao(@RequestBody Activity activity);

	@PostMapping("/delete")
	public DaoResult deleteActivityDao(@RequestBody Activity activity);
}
