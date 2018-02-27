package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.common.Condition;
import top.starrysea.common.DaoResult;
import top.starrysea.dal.dao.IWorkDao;
import top.starrysea.dal.entity.Work;

@RestController
@RequestMapping("/work")
public class WorkController {

	@Autowired
	private IWorkDao workDao;

	@PostMapping("/all")
	public DaoResult getAllWorkDao(@RequestBody Work work, @RequestParam("page") int page) {
		return workDao.getAllWorkDao(new Condition(page), work);
	}

	@PostMapping("/count")
	public DaoResult getWorkCountDao(@RequestBody Work work, @RequestParam("page") int page) {
		return workDao.getWorkCountDao(new Condition(page), work);
	}

	@PostMapping("/one")
	public DaoResult getWorkDao(@RequestBody Work work) {
		return workDao.getWorkDao(work);
	}

	@PostMapping("/save")
	public DaoResult saveWorkDao(@RequestBody Work work) {
		return workDao.saveWorkDao(work);
	}

	@PostMapping("/delete")
	public DaoResult deleteWorkDao(@RequestBody Work work) {
		return workDao.deleteWorkDao(work);
	}

	@PostMapping("/addClick")
	public DaoResult addWorkClick(@RequestBody Work work) {
		return workDao.addWorkClick(work);
	}
}
