package top.starrysea.work.dao;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import top.starrysea.work.object.dto.WorkImage;

@FeignClient(name = "starrysea-dal")
public interface IWorkImageDao {

	@RequestMapping(value = "/workImage/all", method = RequestMethod.POST)
	public List<WorkImage> getAllWorkImageDao(@RequestBody WorkImage workImage);

	@RequestMapping(value = "/workImage/save", method = RequestMethod.POST)
	public Boolean saveWorkImageDao(@RequestBody List<WorkImage> workImages);
}
