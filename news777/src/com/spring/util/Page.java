package com.spring.util;

import java.util.List;

/**
 * 分页
 * 
 * @author ldl
 * 
 */
public class Page<T> {
	private int totalRowCount; // 总记录数
	private int pageSize; // 页面记录数
	private int totalPageCount; // 总页数
	private int currentPageNo; // 当前页码
	private List<T> data; // 当前页的记录

	public int getTotalRowCount() {
		return totalRowCount;
	}

	public void setTotalRowCount(int totalRowCount) {
		this.totalRowCount = totalRowCount;
		totalPageCount = totalRowCount % pageSize == 0 ?
				totalRowCount / pageSize :
				totalRowCount / pageSize + 1;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

}
