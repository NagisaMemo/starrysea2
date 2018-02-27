package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.common.DaoResult;
import top.starrysea.dal.dao.IWorkImageDao;
import top.starrysea.dal.entity.WorkImage;

import java.util.List;

@RestController
@RequestMapping("/workImage")
public class WorkImageController {

	@Autowired
	private IWorkImageDao workImageDao;

	@PostMapping("/all")
	public DaoResult getAllWorkImageDao(@RequestBody WorkImage workImage) {
		return workImageDao.getAllWorkImageDao(workImage);
	}

	@PostMapping("/save")
	public DaoResult saveWorkImageDao(@RequestBody List<WorkImage> workImages) {
		return workImageDao.saveWorkImageDao(workImages);
	}
}
