package top.starrysea.dal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.dal.dao.IActivityImageDao;
import top.starrysea.dal.entity.Activity;
import top.starrysea.dal.entity.ActivityImage;

import static top.starrysea.dal.common.Const.RESULT;

@RestController
@RequestMapping("/activityImage")
public class ActivityImageController {

	@Autowired
	private IActivityImageDao activityImageDao;

	@PostMapping("/all")
	public Map<String, Object> getAllActivityImageController(@RequestBody Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityImageDao.getAllActivityImageDao(activity).getResult(List.class));
		return theResult;
	}

	@PostMapping("/save")
	public Map<String, Object> saveActivityImageDao(@RequestBody List<ActivityImage> activityImages) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityImageDao.saveActivityImageDao(activityImages).isSuccessed());
		return theResult;
	}
}
