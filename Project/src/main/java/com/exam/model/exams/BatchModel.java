package com.exam.model.exams;

import com.exam.entity.Batch;
import com.exam.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BatchModel {

    private long id;
    private String name;
    private LocalDate date;
    private LocalTime time;
    private List<Long> userIds;
    private List<UserModel> userDetails;
    private long quizId;
    private Integer traineeCount;
//	private boolean status;
    private String trade;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public List<Long> getUserIds() {
		return userIds;
	}
	public void setUserIds(List<Long> userIds) {
		this.userIds = userIds;
	}
	public List<UserModel> getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(List<UserModel> userDetails) {
		this.userDetails = userDetails;
	}
	public long getQuizId() {
		return quizId;
	}
	public void setQuizId(long quizId) {
		this.quizId = quizId;
	}
	public Integer getTraineeCount() {
		return traineeCount;
	}
	public void setTraineeCount(Integer traineeCount) {
		this.traineeCount = traineeCount;
	}
	public String getTrade() {
		return trade;
	}
	public void setTrade(String trade) {
		this.trade = trade;
	}


}
