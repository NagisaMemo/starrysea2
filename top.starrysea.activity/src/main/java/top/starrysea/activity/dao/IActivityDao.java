package top.starrysea.activity.dao;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import top.starrysea.common.Condition;
import top.starrysea.activity.object.dto.Activity;

@FeignClient(name = "starrysea-dal")
public interface IActivityDao {

	@GetMapping("/newest")
	public Map<String, Object> getNewestActivity();

	@PostMapping("/all")
	public Map<String, Object> getAllActivity(@RequestBody Condition condition,
			@RequestBody Activity activity);

	@PostMapping("/count")
	public Map<String, Object> getActivityCount(@RequestBody Condition condition,
			@RequestBody Activity activity);

	@PostMapping("/one")
	public Map<String, Object> getActivity(@RequestBody Activity activity);

	@PostMapping("/save")
	public Map<String, Object> saveActivity(@RequestBody Activity activity);

	@PostMapping("/update")
	public Map<String, Object> updateActivity(@RequestBody Activity activity);

	@PostMapping("/addMoney")
	public Map<String, Object> updateAddActivityMoney(@RequestBody List<Activity> activitys);

	@PostMapping("/reduceMoney")
	public Map<String, Object> updateReduceActivityMoney(@RequestBody Activity activity);

	@PostMapping("/delete")
	public Map<String, Object> deleteActivity(@RequestBody Activity activity);
}
