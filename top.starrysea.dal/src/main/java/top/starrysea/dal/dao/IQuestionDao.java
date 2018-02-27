package top.starrysea.dal.dao;

import top.starrysea.dal.common.Condition;
import top.starrysea.dal.common.DaoResult;
import top.starrysea.dal.entity.Question;

public interface IQuestionDao {

	DaoResult getAllQuestionDao(Condition condition, Question question);

	DaoResult saveQuestionDao(Question question);

	DaoResult updateQuestionDao(Question question);
	
	DaoResult getQuestionCountDao(Question question);
}
