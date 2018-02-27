package top.starrysea.dal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import top.starrysea.common.Condition;
import top.starrysea.common.DaoResult;
import top.starrysea.dal.dao.IQuestionDao;
import top.starrysea.dal.entity.Question;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private IQuestionDao questionDao;

	@PostMapping("/all")
	public DaoResult getAllQuestionDao(@RequestBody Question question, @RequestParam("page") int page) {
		return questionDao.getAllQuestionDao(new Condition(page), question);
	}

	@PostMapping("/save")
	public DaoResult saveQuestionDao(@RequestBody Question question) {
		return questionDao.saveQuestionDao(question);
	}

	@PostMapping("/update")
	public DaoResult updateQuestionDao(@RequestBody Question question) {
		return questionDao.updateQuestionDao(question);
	}

	@PostMapping("/count")
	public DaoResult getQuestionCountDao(@RequestBody Question question) {
		return questionDao.getQuestionCountDao(question);
	}
}
