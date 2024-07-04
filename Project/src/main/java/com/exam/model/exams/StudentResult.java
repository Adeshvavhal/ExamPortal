package com.exam.model.exams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentResult {
    private long result_id;
    private long quizId;
    private long batchId;
    private int qAttempted;
    private int correctAns;
    private double marksScored;
    private String submitDateTime;
    private String quizName;
    private String noOfQuestions;
    private String trade;
    private boolean negativeMarks;
	public long getResult_id() {
		return result_id;
	}
	public void setResult_id(long result_id) {
		this.result_id = result_id;
	}
	public long getQuizId() {
		return quizId;
	}
	public void setQuizId(long quizId) {
		this.quizId = quizId;
	}
	public long getBatchId() {
		return batchId;
	}
	public void setBatchId(long batchId) {
		this.batchId = batchId;
	}
	public int getqAttempted() {
		return qAttempted;
	}
	public void setqAttempted(int qAttempted) {
		this.qAttempted = qAttempted;
	}
	public int getCorrectAns() {
		return correctAns;
	}
	public void setCorrectAns(int correctAns) {
		this.correctAns = correctAns;
	}
	public double getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(double marksScored) {
		this.marksScored = marksScored;
	}
	public String getSubmitDateTime() {
		return submitDateTime;
	}
	public void setSubmitDateTime(String submitDateTime) {
		this.submitDateTime = submitDateTime;
	}
	public String getQuizName() {
		return quizName;
	}
	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}
	public String getNoOfQuestions() {
		return noOfQuestions;
	}
	public void setNoOfQuestions(String noOfQuestions) {
		this.noOfQuestions = noOfQuestions;
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
