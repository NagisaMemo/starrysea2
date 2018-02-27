package top.starrysea.dal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping("/all")
	public Map<String, Object> getAllActivityImageController(Activity activity) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityImageDao.getAllActivityImageDao(activity).getResult(List.class));
		return theResult;
	}

	@RequestMapping("/save")
	public Map<String, Object> saveActivityImageDao(List<ActivityImage> activityImages) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, activityImageDao.saveActivityImageDao(activityImages).isSuccessed());
		return theResult;
	}
}
