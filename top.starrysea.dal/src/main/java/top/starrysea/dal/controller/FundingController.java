package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.common.DaoResult;
import top.starrysea.dal.dao.IFundingDao;
import top.starrysea.dal.entity.Funding;

import java.util.List;

@RestController
@RequestMapping("/funding")
public class FundingController {

	@Autowired
	private IFundingDao fundingDao;

	@PostMapping("/all")
	public DaoResult getAllFundingDao(@RequestBody Funding funding) {
		return fundingDao.getAllFundingDao(funding);
	}

	@PostMapping("/save")
	public DaoResult saveFundingDao(@RequestBody List<Funding> fundings) {
		return fundingDao.saveFundingDao(fundings);
	}

	@PostMapping("/delete")
	public DaoResult deleteFundingDao(@RequestBody Funding funding) {
		return fundingDao.deleteFundingDao(funding);
	}
}
