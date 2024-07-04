package com.exam.model.exams;

import com.exam.entity.Batch;
import com.exam.entity.Question;
import com.exam.entity.Quiz;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TraineeBatchModel {

    private  long quizId;
    private  String name;
    private  String description;
    private  boolean active=false;
    private String markOfQuestion;
    private String maxMarks;
    private  String noOfQuestions;
    private String quizTime;
    private Set<Question> questionsOfQuiz;
    private long batchId;
    private String batchName;
    private LocalDate date;
    private LocalTime time;
    private Integer traineeCount;
	private String status;
  private String batchStatus;
  private String batchUserStatus;
  private String trade;
  private boolean negativeMarks;




  public  TraineeBatchModel(QuizModel quiz, Batch batch ){
      this.quizId=quiz.getQuizId();
      this.name=quiz.getName();
      this.description =quiz.getDescription();
      this.markOfQuestion =quiz.getMarkOfQuestion();
      this.maxMarks=quiz.getMaxMarks();
      this.noOfQuestions=quiz.getNoOfQuestions();
      this.quizTime=quiz.getQuizTime();
      this.active=quiz.isActive();
      this.questionsOfQuiz=quiz.getQuestionsOfQuiz();
      this.batchId=batch.getId();
      this.batchName=batch.getName();
      this.date=batch.getDate();
      this.time=batch.getTime();
      this.traineeCount=batch.getTraineeCount();
//      this.batchStatus=batch.getStatus();
      this.trade=batch.getTrade();
      this.negativeMarks=quiz.isNegativeMarks();
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




public Set<Question> getQuestionsOfQuiz() {
	return questionsOfQuiz;
}




public void setQuestionsOfQuiz(Set<Question> questionsOfQuiz) {
	this.questionsOfQuiz = questionsOfQuiz;
}




public long getBatchId() {
	return batchId;
}




public void setBatchId(long batchId) {
	this.batchId = batchId;
}




public String getBatchName() {
	return batchName;
}




public void setBatchName(String batchName) {
	this.batchName = batchName;
}




public LocalDate getDate() {
	return date;
}




public void setDate(LocalDate date) {
	this.date = date;
}




public LocalTime getTime() {
	return time;
}




public void setTime(LocalTime time) {
	this.time = time;
}




public Integer getTraineeCount() {
	return traineeCount;
}




public void setTraineeCount(Integer traineeCount) {
	this.traineeCount = traineeCount;
}




public String getStatus() {
	return status;
}




public void setStatus(String status) {
	this.status = status;
}




public String getBatchStatus() {
	return batchStatus;
}




public void setBatchStatus(String batchStatus) {
	this.batchStatus = batchStatus;
}




public String getBatchUserStatus() {
	return batchUserStatus;
}




public void setBatchUserStatus(String batchUserStatus) {
	this.batchUserStatus = batchUserStatus;
}




public String getTrade() {
	return trade;
}




public void setTrade(String trade) {
	this.trade = trade;
}




public boolean isNegativeMarks() {
	return negativeMarks;
}




public void setNegativeMarks(boolean negativeMarks) {
	this.negativeMarks = negativeMarks;
}
  
  
}
