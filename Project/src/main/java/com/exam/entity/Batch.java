package com.exam.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private LocalDate date;
	private LocalTime time;
    private Integer traineeCount;
//	private boolean status;
    private String trade;
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "created_at", nullable = false, updatable = false)
	private Date createdAt;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "updated_at", nullable = false)
	private Date updatedAt;
	 @ManyToOne
	 @JoinColumn(name = "quiz_id")
	 private Quiz quiz;

//	@OneToMany(mappedBy = "batch")
//	private List<QuizBatchMapping> quizBatchMappings;

	@OneToMany(mappedBy = "batch")
	private List<BatchUserMapping> batchUserMappings;

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

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public List<BatchUserMapping> getBatchUserMappings() {
		return batchUserMappings;
	}

	public void setBatchUserMappings(List<BatchUserMapping> batchUserMappings) {
		this.batchUserMappings = batchUserMappings;
	}

	
	
}
