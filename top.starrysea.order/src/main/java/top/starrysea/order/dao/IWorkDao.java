package top.starrysea.order.dao;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import top.starrysea.order.object.dto.Work;

@FeignClient(name = "starrysea-dal")
public interface IWorkDao {

	@RequestMapping(value = "/all", method = RequestMethod.POST)
	public List<Work> getAllWorkDao(@RequestBody Work work, @RequestParam("page") int page);

	@RequestMapping(value = "/count", method = RequestMethod.POST)
	public Integer getWorkCountDao(@RequestBody Work work, @RequestParam("page") int page);

	@RequestMapping(value = "/one", method = RequestMethod.POST)
	public Work getWorkDao(@RequestBody Work work);

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Integer saveWorkDao(@RequestBody Work work);

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public Boolean deleteWorkDao(@RequestBody Work work);

	@RequestMapping(value = "/addClick", method = RequestMethod.POST)
	public Boolean addWorkClick(@RequestBody Work work);
}