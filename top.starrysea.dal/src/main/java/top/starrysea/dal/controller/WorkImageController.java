package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.dal.dao.IWorkImageDao;
import top.starrysea.dal.entity.WorkImage;

import static top.starrysea.dal.common.Const.RESULT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workImage")
public class WorkImageController {

	@Autowired
	private IWorkImageDao workImageDao;

	@PostMapping("/all")
	public Map<String, Object> getAllWorkImageController(@RequestBody WorkImage workImage) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workImageDao.getAllWorkImageDao(workImage).getResult(List.class));
		return theResult;
	}

	@PostMapping("/save")
	public Map<String, Object> saveWorkImageController(@RequestBody List<WorkImage> workImages) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workImageDao.saveWorkImageDao(workImages).isSuccessed());
		return theResult;
	}
}
