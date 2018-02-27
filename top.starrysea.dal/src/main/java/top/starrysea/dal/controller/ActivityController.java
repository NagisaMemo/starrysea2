package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import top.starrysea.dal.dao.IActivityDao;

@Controller
@RequestMapping("/activity")
public class ActivityController {

	@Autowired
	private IActivityDao activityDao;
	
}
