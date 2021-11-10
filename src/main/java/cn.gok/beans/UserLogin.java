package cn.gok.beans;

import javax.xml.crypto.Data;

public class UserLogin {
    private String UserName;
    private String PassWord;
    private String UserID;
    private String UserStatus;
    private Data ModifiedTime;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserStatus() {
        return UserStatus;
    }

    public void setUserStatus(String userStatus) {
        UserStatus = userStatus;
    }

    public Data getModifiedTime() {
        return ModifiedTime;
    }

    public void setModifiedTime(Data modifiedTime) {
        ModifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "UserName='" + UserName + '\'' +
                ", PassWord='" + PassWord + '\'' +
                ", UserID='" + UserID + '\'' +
                ", UserStatus='" + UserStatus + '\'' +
                ", ModifiedTime=" + ModifiedTime +
                '}';
    }
}
