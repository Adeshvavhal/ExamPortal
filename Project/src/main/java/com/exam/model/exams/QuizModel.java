package com.exam.model.exams;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.exam.entity.Question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QuizModel {

		private  long quizId;
	    private  String name;
	    private  String description;
	    private  boolean active=false;
	    private String markOfQuestion;
	    private String maxMarks;
	    private  String noOfQuestions;
	    private String quizTime;
		private boolean negativeMarks;
		private String trade;
		private String createdAt;
		private String updatedAt;
		private Set<Question> questionsOfQuiz;
	    private List<BatchModel> batches;
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
		public String getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}
		public String getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}
		public Set<Question> getQuestionsOfQuiz() {
			return questionsOfQuiz;
		}
		public void setQuestionsOfQuiz(Set<Question> questionsOfQuiz) {
			this.questionsOfQuiz = questionsOfQuiz;
		}
		public List<BatchModel> getBatches() {
			return batches;
		}
		public void setBatches(List<BatchModel> batches) {
			this.batches = batches;
		}


}
