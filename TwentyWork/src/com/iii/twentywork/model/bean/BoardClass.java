package com.iii.twentywork.model.bean;
// Generated 2016/1/10 �U�� 06:05:34 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * BoardClass generated by hbm2java
 */
public class BoardClass implements java.io.Serializable
{

    @Override
	public String toString() {
		return "BoardClass [boardClassId=" + boardClassId + ", boardClassText=" + boardClassText + ", boards=" + boards
				+ "]";
	}

	private String boardClassId;

    private String boardClassText;

    private Set<Board> boards = new HashSet<Board>(0);

    public BoardClass()
    {
    }

    public BoardClass(String boardClassId)
    {
        this.boardClassId = boardClassId;
    }

    public BoardClass(String boardClassId, String boardClassText,
            Set<Board> boards)
    {
        this.boardClassId = boardClassId;
        this.boardClassText = boardClassText;
        this.boards = boards;
    }

    public String getBoardClassId()
    {
        return this.boardClassId;
    }

    public void setBoardClassId(String boardClassId)
    {
        this.boardClassId = boardClassId;
    }

    public String getBoardClassText()
    {
        return this.boardClassText;
    }

    public void setBoardClassText(String boardClassText)
    {
        this.boardClassText = boardClassText;
    }

    public Set<Board> getBoards()
    {
        return this.boards;
    }

    public void setBoards(Set<Board> boards)
    {
        this.boards = boards;
    }

}
