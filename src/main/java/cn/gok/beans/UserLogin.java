package cn.gok.beans;

import javax.xml.crypto.Data;
import java.io.Serializable;

public class UserLogin implements Serializable {
    private String UserName;
    private String PassWord;

    private int UserID;

    private String UserStatus;
    private String ModifiedTime;

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

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



    public String getUserStatus() {
        return UserStatus;
    }

    public void setUserStatus(String userStatus) {
        UserStatus = userStatus;
    }

    public String getModifiedTime() {
        return ModifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
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
