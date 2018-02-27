package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.dal.common.DaoResult;
import top.starrysea.dal.dao.IOnlineDao;
import top.starrysea.dal.entity.Online;

import static top.starrysea.dal.common.Const.RESULT;
import static top.starrysea.dal.common.Const.ERRINFO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/online")
public class OnlineController {

	@Autowired
	private IOnlineDao onlineDao;

	@GetMapping("/all")
	public Map<String, Object> getAllOnlineController() {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, onlineDao.getAllOnlineDao().getResult(List.class));
		return theResult;
	}

	@PostMapping("/save")
	public Map<String, Object> saveOnlineController(@RequestBody Online online) {
		DaoResult daoResult = onlineDao.saveOnlineDao(online);
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, daoResult.isSuccessed());
		if (!daoResult.isSuccessed()) {
			theResult.put(ERRINFO, daoResult.getErrInfo());
		}
		return theResult;
	}
}
