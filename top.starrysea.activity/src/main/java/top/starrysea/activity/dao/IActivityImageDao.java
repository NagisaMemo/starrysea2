package top.starrysea.activity.dao;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import top.starrysea.activity.object.dto.Activity;
import top.starrysea.activity.object.dto.ActivityImage;
import top.starrysea.common.DaoResult;

@FeignClient(name = "starrysea-dal")
public interface IActivityImageDao {

	@RequestMapping(value = "/activityImage/all", method = RequestMethod.POST)
	public DaoResult getAllActivityImageDao(@RequestBody Activity activity);

	@RequestMapping(value = "/activityImage/save", method = RequestMethod.POST)
	public DaoResult saveActivityImageDao(@RequestBody List<ActivityImage> activityImages);
}
