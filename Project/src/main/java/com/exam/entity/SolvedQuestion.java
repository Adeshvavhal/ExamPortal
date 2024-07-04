package com.exam.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SolvedQuestion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long quesId;
    private String type;
    private String topic;
    private String content;
    private String image;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;
    private String givenAnswer;
    private String review;
    private String changedAnswer;
    private String trade;
    private Long quizId;
    private Long batchId;
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "created_at", nullable = false, updatable = false)
	private Date createdAt;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "updated_at", nullable = false)
	private Date updatedAt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getQuesId() {
		return quesId;
	}

	public void setQuesId(long quesId) {
		this.quesId = quesId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getGivenAnswer() {
		return givenAnswer;
	}

	public void setGivenAnswer(String givenAnswer) {
		this.givenAnswer = givenAnswer;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getChangedAnswer() {
		return changedAnswer;
	}

	public void setChangedAnswer(String changedAnswer) {
		this.changedAnswer = changedAnswer;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public Long getQuizId() {
		return quizId;
	}

	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
}
