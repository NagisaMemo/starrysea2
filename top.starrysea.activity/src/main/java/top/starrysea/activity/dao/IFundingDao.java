package top.starrysea.activity.dao;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import top.starrysea.activity.object.dto.Funding;
import top.starrysea.common.DaoResult;

@FeignClient(name = "starrysea-dal")
public interface IFundingDao {

	@PostMapping("/all")
	public DaoResult getAllFundingDao(@RequestBody Funding funding);

	@PostMapping("/save")
	public DaoResult saveFundingDao(@RequestBody List<Funding> fundings);

	@PostMapping("/delete")
	public DaoResult deleteFundingDao(@RequestBody Funding funding);
}
