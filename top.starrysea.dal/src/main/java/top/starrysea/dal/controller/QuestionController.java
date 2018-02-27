package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.dal.common.Condition;
import top.starrysea.dal.dao.IQuestionDao;
import top.starrysea.dal.entity.Question;

import static top.starrysea.dal.common.Const.RESULT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private IQuestionDao questionDao;

	@PostMapping("/all")
	public Map<String, Object> getAllQuestionController(@RequestBody Condition condition, @RequestBody Question question) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, questionDao.getAllQuestionDao(condition, question).getResult(List.class));
		return theResult;
	}

	@PostMapping("/save")
	public Map<String, Object> saveQuestionController(@RequestBody Question question) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, questionDao.saveQuestionDao(question).isSuccessed());
		return theResult;
	}

	@PostMapping("/update")
	public Map<String, Object> updateQuestionController(@RequestBody Question question) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, questionDao.updateQuestionDao(question).isSuccessed());
		return theResult;
	}

	@PostMapping("/count")
	public Map<String, Object> getQuestionCountController(@RequestBody Question question) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, questionDao.getQuestionCountDao(question).getResult(Integer.class));
		return theResult;
	}
}
