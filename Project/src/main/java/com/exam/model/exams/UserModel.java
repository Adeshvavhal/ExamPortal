package com.exam.model.exams;

import com.exam.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String armyNo;
    private String armyRank;
    private String unit;
    private String trade;
    private boolean enabled = true;
    private String profile;
    private String role;
    private String squad;

    public UserModel(User user){
        BeanUtils.copyProperties(user,this);
        this.setPassword("");
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getArmyNo() {
		return armyNo;
	}

	public void setArmyNo(String armyNo) {
		this.armyNo = armyNo;
	}

	public String getArmyRank() {
		return armyRank;
	}

	public void setArmyRank(String armyRank) {
		this.armyRank = armyRank;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSquad() {
		return squad;
	}

	public void setSquad(String squad) {
		this.squad = squad;
	}
    
    
}
