package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.dal.dao.IFundingDao;
import top.starrysea.dal.entity.Funding;

import static top.starrysea.dal.common.Const.RESULT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funding")
public class FundingController {

	@Autowired
	private IFundingDao fundingDao;

	@RequestMapping("/all")
	public Map<String, Object> getAllFundingController(Funding funding) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, fundingDao.getAllFundingDao(funding).getResult(List.class));
		return theResult;
	}

	@RequestMapping("/save")
	public Map<String, Object> saveFundingController(List<Funding> fundings) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, fundingDao.saveFundingDao(fundings).isSuccessed());
		return theResult;
	}

	@RequestMapping("/delete")
	public Map<String, Object> deleteFundingController(Funding funding) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, fundingDao.deleteFundingDao(funding).isSuccessed());
		return theResult;
	}
}
