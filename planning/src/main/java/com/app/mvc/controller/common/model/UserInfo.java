package com.app.mvc.controller.common.model;

public class UserInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_pass
     *
     * @mbggenerated
     */
    private String userPass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_age
     *
     * @mbggenerated
     */
    private Integer userAge;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_icon
     *
     * @mbggenerated
     */
    private String userIcon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_tele
     *
     * @mbggenerated
     */
    private String userTele;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_id
     *
     * @return the value of user_info.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_id
     *
     * @param userId the value for user_info.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_name
     *
     * @return the value of user_info.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_name
     *
     * @param userName the value for user_info.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_pass
     *
     * @return the value of user_info.user_pass
     *
     * @mbggenerated
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_pass
     *
     * @param userPass the value for user_info.user_pass
     *
     * @mbggenerated
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_age
     *
     * @return the value of user_info.user_age
     *
     * @mbggenerated
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_age
     *
     * @param userAge the value for user_info.user_age
     *
     * @mbggenerated
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_icon
     *
     * @return the value of user_info.user_icon
     *
     * @mbggenerated
     */
    public String getUserIcon() {
        return userIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_icon
     *
     * @param userIcon the value for user_info.user_icon
     *
     * @mbggenerated
     */
    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon == null ? null : userIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_tele
     *
     * @return the value of user_info.user_tele
     *
     * @mbggenerated
     */
    public String getUserTele() {
        return userTele;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_tele
     *
     * @param userTele the value for user_info.user_tele
     *
     * @mbggenerated
     */
    public void setUserTele(String userTele) {
        this.userTele = userTele == null ? null : userTele.trim();
    }
}