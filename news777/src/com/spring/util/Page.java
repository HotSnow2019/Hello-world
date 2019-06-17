package com.spring.util;

import java.util.List;

/**
 * ��ҳ
 * 
 * @author ldl
 * 
 */
public class Page<T> {
	private int totalRowCount; // �ܼ�¼��
	private int pageSize; // ҳ���¼��
	private int totalPageCount; // ��ҳ��
	private int currentPageNo; // ��ǰҳ��
	private List<T> data; // ��ǰҳ�ļ�¼

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
