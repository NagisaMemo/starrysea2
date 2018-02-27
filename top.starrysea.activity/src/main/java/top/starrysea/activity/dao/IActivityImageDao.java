package top.starrysea.activity.dao;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import top.starrysea.activity.object.dto.Activity;
import top.starrysea.activity.object.dto.ActivityImage;
import top.starrysea.common.DaoResult;

@FeignClient(name = "starrysea-dal")
public interface IActivityImageDao {

	@PostMapping("/all")
	public DaoResult getAllActivityImageDao(@RequestBody Activity activity);

	@PostMapping("/save")
	public DaoResult saveActivityImageDao(@RequestBody List<ActivityImage> activityImages);
}
