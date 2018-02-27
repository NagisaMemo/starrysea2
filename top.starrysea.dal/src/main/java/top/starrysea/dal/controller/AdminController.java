package top.starrysea.dal.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.dal.common.DaoResult;
import top.starrysea.dal.dao.IAdminDao;
import top.starrysea.dal.entity.Admin;

import static top.starrysea.dal.common.Const.RESULT;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private IAdminDao adminDao;

	@RequestMapping("/login")
	public Map<String, Object> loginController(Admin admin) {
		DaoResult daoResult = adminDao.loginDao(admin);
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, daoResult.isSuccessed());
		if (daoResult.isSuccessed()) {
			theResult.put("admin", daoResult.getResult(Admin.class));
		}
		return theResult;
	}
}
