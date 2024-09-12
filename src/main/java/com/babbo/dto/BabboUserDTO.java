package com.babbo.dto;

public class BabboUserDTO {
    private String userId;
    private String userPassword;
    private String userName;
    private String userNick;
    private String userAddress;
    private String userGender;
    private String userBirthday;
    private String userNationality;
    
	public BabboUserDTO() {	}

	public BabboUserDTO(String userId, String userPassword, String userName, String userNick, String userAddress,
			String userGender, String userBirthday, String userNationality) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userNick = userNick;
		this.userAddress = userAddress;
		this.userGender = userGender;
		this.userBirthday = userBirthday;
		this.userNationality = userNationality;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNick() {
		return userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserNationality() {
		return userNationality;
	}

	public void setUserNationality(String userNationality) {
		this.userNationality = userNationality;
	}

	@Override
	public String toString() {
		return "BabboUserDTO [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName
				+ ", userNick=" + userNick + ", userAddress=" + userAddress + ", userGender=" + userGender
				+ ", userBirthday=" + userBirthday + ", userNationality=" + userNationality + "]";
	}
    
    
    
}
