package com.spring.entity;

import java.util.List;

public class Topic {
	private int topicId;	//主题id
	private String topicName;	//主题名
	private List<News> newsList;	//主题下的新闻

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public List<News> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}

}
