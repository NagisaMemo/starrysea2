package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.dal.dao.IProvinceDao;

import static top.starrysea.dal.common.Const.RESULT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/province")
public class ProvinceController {

	@Autowired
	private IProvinceDao provinceDao;

	@GetMapping("/all")
	public Map<String, Object> getAllProvinceController() {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, provinceDao.getAllProvinceDao().getResult(List.class));
		return theResult;
	}
}
