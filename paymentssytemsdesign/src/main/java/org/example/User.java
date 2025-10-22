package org.example;

public class    User {
    private  String user_Name ;
    private  String user_Id;
    private String user_Email;
    private Account account;

    public Account getAccount() {
        return account;
    }

    public User(String user_Name, String user_Id, String user_Email, Account account) {
        this.user_Name = user_Name;
        this.user_Id = user_Id;
        this.user_Email = user_Email;
        this.account = account;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(String user_Id) {
        this.user_Id = user_Id;
    }

    public String getUser_Email() {
        return user_Email;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }
}
