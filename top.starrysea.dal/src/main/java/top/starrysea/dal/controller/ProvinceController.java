package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.common.DaoResult;
import top.starrysea.dal.dao.IProvinceDao;

@RestController
@RequestMapping("/province")
public class ProvinceController {

	@Autowired
	private IProvinceDao provinceDao;

	@GetMapping("/all")
	public DaoResult getAllProvinceDao() {
		return provinceDao.getAllProvinceDao();
	}
}
