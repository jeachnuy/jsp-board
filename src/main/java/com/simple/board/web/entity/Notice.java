package com.simple.board.web.entity;

import java.util.Date;

public class Notice {
	private int id;
	private String title;
	private String writer_id;
	private Date regdate;
	private int hit;
	private String content;
	
	public Notice() {}
	
	public Notice(final int id, final String title, final String writer_id, final Date regdate, final int hit, final String content) {
		this.id = id;
		this.title = title;
		this.writer_id = writer_id;
		this.regdate = regdate;
		this.hit = hit;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getWriter_id() {
		return writer_id;
	}

	public void setWriter_id(final String writer_id) {
		this.writer_id = writer_id;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(final Date regdate) {
		this.regdate = regdate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(final int hit) {
		this.hit = hit;
	}

	public String getContent() {
		return content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", writer_id=" + writer_id + ", regdate=" + regdate + ", hit="
				+ hit + ", content=" + content + "]";
	}
	
	
}
