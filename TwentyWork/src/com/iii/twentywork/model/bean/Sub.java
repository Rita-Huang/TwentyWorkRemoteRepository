package com.iii.twentywork.model.bean;
// Generated 2016/1/10 �U�� 06:05:34 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * Sub generated by hbm2java
 */
public class Sub implements java.io.Serializable
{

    @Override
	public String toString() {
		return "Sub [subId=" + subId + ", board=" + board + ", users=" + users + ", subText=" + subText + "]";
	}

	private String subId;
    private Board board;
    private UsersBean users;
    private String subText;
    private Date subTime;
    
    
    public Sub()
    {
    }

    public Sub(String subId)
    {
        this.subId = subId;
    }

    public Sub(String subId, Board board, UsersBean users, String subText)
    {
        this.subId = subId;
        this.board = board;
        this.users = users;
        this.subText = subText;
    }

    public String getSubId()
    {
        return this.subId;
    }

    public void setSubId(String subId)
    {
        this.subId = subId;
    }

    public Board getBoard()
    {
        return this.board;
    }

    public void setBoard(Board board)
    {
        this.board = board;
    }

    public UsersBean getUsers()
    {
        return this.users;
    }

    public void setUsers(UsersBean users)
    {
        this.users = users;
    }

    public String getSubText()
    {
        return this.subText;
    }

    public void setSubText(String subText)
    {
        this.subText = subText;
    }

    public Date getSubTime()
    {
        return subTime;
    }

    public void setSubTime(Date subTime)
    {
        this.subTime = subTime;
    }

}