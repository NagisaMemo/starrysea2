package top.starrysea.activity.dao;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import top.starrysea.activity.object.dto.Funding;

@FeignClient(name = "starrysea-dal")
public interface IFundingDao {

	@RequestMapping(value = "/all", method = RequestMethod.POST)
	public List<Funding> getAllFundingDao(@RequestBody Funding funding);

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Boolean saveFundingDao(@RequestBody List<Funding> fundings);

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public Boolean deleteFundingDao(@RequestBody Funding funding);
}
