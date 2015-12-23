package com.hawkeye.domain;
/**
 *@Copy Right Information liyuanguo
 *@version  1.0
 *@author  liyuanguo
 *@date 2015年12月17日
 */
public class Answer {
	private Integer id;
	private Long userId;
	private Integer questionNumber;
	private String result;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the questionNumber
	 */
	public Integer getQuestionNumber() {
		return questionNumber;
	}
	/**
	 * @param questionNumber the questionNumber to set
	 */
	public void setQuestionNumber(Integer questionNumber) {
		this.questionNumber = questionNumber;
	}
	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	
}
