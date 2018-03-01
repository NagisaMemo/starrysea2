package top.starrysea.order.dao;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import top.starrysea.order.object.dto.Area;

@FeignClient(name = "starrysea-dal")
public interface IProvinceDao {

	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Area> getAllProvinceDao();
}
