package com.hawkeye.dao.impl;

import org.springframework.stereotype.Repository;

import com.hawkeye.dao.AnswerDao;
import com.hawkeye.dao.util.MyBatisSupport;
import com.hawkeye.domain.Answer;


/**
 *@Copy Right Information liyuanguo
 *@version  1.0
 *@author  liyuanguo
 *@date 2015年12月17日
 */
@Repository("answerDao")
public class AnswerDaoImpl extends MyBatisSupport<AnswerDao, AnswerDao> implements AnswerDao{

	@Override
	public Long insert(Answer answer) {
		return getMapper().insert(answer);
	}

}
