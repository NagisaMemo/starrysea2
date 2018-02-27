package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping("/all")
	public Map<String, Object> getAllQuestionController(Condition condition, Question question) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, questionDao.getAllQuestionDao(condition, question).getResult(List.class));
		return theResult;
	}

	@RequestMapping("/save")
	public Map<String, Object> saveQuestionController(Question question) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, questionDao.saveQuestionDao(question).isSuccessed());
		return theResult;
	}

	@RequestMapping("/update")
	public Map<String, Object> updateQuestionController(Question question) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, questionDao.updateQuestionDao(question).isSuccessed());
		return theResult;
	}

	@RequestMapping("/count")
	public Map<String, Object> getQuestionCountController(Question question) {
		Map<String, Object> theResult = new HashMap<>();
		theResult.put(RESULT, questionDao.getQuestionCountDao(question).getResult(Integer.class));
		return theResult;
	}
}
