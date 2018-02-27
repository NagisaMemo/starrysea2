package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import top.starrysea.dal.dao.IWorkImageDao;

@Controller
@RequestMapping("/workImage")
public class WorkImageController {

	@Autowired
	private IWorkImageDao workImageDao;
}
