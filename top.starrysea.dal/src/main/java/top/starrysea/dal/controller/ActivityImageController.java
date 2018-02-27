package top.starrysea.dal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.common.DaoResult;
import top.starrysea.dal.dao.IActivityImageDao;
import top.starrysea.dal.entity.Activity;
import top.starrysea.dal.entity.ActivityImage;

@RestController
@RequestMapping("/activityImage")
public class ActivityImageController {

	@Autowired
	private IActivityImageDao activityImageDao;

	@PostMapping("/all")
	public DaoResult getAllActivityImageDao(@RequestBody Activity activity) {
		return activityImageDao.getAllActivityImageDao(activity);
	}

	@PostMapping("/save")
	public DaoResult saveActivityImageDao(@RequestBody List<ActivityImage> activityImages) {
		return activityImageDao.saveActivityImageDao(activityImages);
	}
}
