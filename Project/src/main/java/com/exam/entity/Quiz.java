package com.exam.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long quizId;
    private  String name;
    private  String description;
    private  boolean active;
    private String markOfQuestion;
    private String maxMarks;
    private String noOfQuestions;
    private String quizTime;
    private String questionsOfQuiz;
    private boolean negativeMarks;
    private String trade;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;

//    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
//    private List<Batch> batches;

    @OneToMany(mappedBy = "quiz")
    private List<QuizBatchMapping> quizBatchMappings;

	@Override
	public String toString() {
		return "Quiz [quizId=" + quizId + ", name=" + name + ", description=" + description + ", active=" + active
				+ ", markOfQuestion=" + markOfQuestion + ", maxMarks=" + maxMarks + ", noOfQuestions=" + noOfQuestions
				+ ", quizTime=" + quizTime + ", questionsOfQuiz=" + questionsOfQuiz + "]";
	}

	public long getQuizId() {
		return quizId;
	}

	public void setQuizId(long quizId) {
		this.quizId = quizId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getMarkOfQuestion() {
		return markOfQuestion;
	}

	public void setMarkOfQuestion(String markOfQuestion) {
		this.markOfQuestion = markOfQuestion;
	}

	public String getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(String maxMarks) {
		this.maxMarks = maxMarks;
	}

	public String getNoOfQuestions() {
		return noOfQuestions;
	}

	public void setNoOfQuestions(String noOfQuestions) {
		this.noOfQuestions = noOfQuestions;
	}

	public String getQuizTime() {
		return quizTime;
	}

	public void setQuizTime(String quizTime) {
		this.quizTime = quizTime;
	}

	public String getQuestionsOfQuiz() {
		return questionsOfQuiz;
	}

	public void setQuestionsOfQuiz(String questionsOfQuiz) {
		this.questionsOfQuiz = questionsOfQuiz;
	}

	public boolean isNegativeMarks() {
		return negativeMarks;
	}

	public void setNegativeMarks(boolean negativeMarks) {
		this.negativeMarks = negativeMarks;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
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

	public List<QuizBatchMapping> getQuizBatchMappings() {
		return quizBatchMappings;
	}

	public void setQuizBatchMappings(List<QuizBatchMapping> quizBatchMappings) {
		this.quizBatchMappings = quizBatchMappings;
	}

	
   
}
