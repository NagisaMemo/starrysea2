package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping("/all")
	public Map<String, Object> getAllWorkImageController(WorkImage workImage) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workImageDao.getAllWorkImageDao(workImage).getResult(List.class));
		return theResult;
	}

	@RequestMapping("/save")
	public Map<String, Object> saveWorkImageController(List<WorkImage> workImages) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, workImageDao.saveWorkImageDao(workImages).isSuccessed());
		return theResult;
	}
}
