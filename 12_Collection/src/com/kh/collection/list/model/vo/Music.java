package com.kh.collection.list.model.vo;

public class Music {
	
	private String title;		//제목
	private String artist;		//가수
	
	//기본생성자, 모든필드를 매개변수로 가지는 생성자
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	
	// getter/setter, toString

	public Music() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}
	
	

}
