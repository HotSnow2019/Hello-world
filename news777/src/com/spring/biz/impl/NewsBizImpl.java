package com.spring.biz.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.NewsBiz;
import com.spring.dao.NewsDao;
import com.spring.entity.News;
import com.spring.util.Page;

@Service
public class NewsBizImpl implements NewsBiz {
	
	@Autowired
	private NewsDao newsDao;

	@Override
	public List<News> selectAll() {
		// TODO Auto-generated method stub
		return newsDao.selectAll();
	}

	@Override
	public Page<News> selectAllByPage(int pageNo) {
		// TODO Auto-generated method stub
		Page<News> page = new Page<News>();
		//����ҳ���С
		int pageSize = 10;
		page.setPageSize(pageSize);
		//����ҳ��ļ�¼������ҳ��
		int totalRowCount = newsDao.selectCount();
		page.setTotalRowCount(totalRowCount);
		//���õ�ǰҳ��
		page.setCurrentPageNo(pageNo);
		//��ȡ��ǰҳ������
		RowBounds rowBounds = 
				new RowBounds(
						(pageNo - 1) * pageSize, 
						pageSize
						);
		page.setData(newsDao.selectByPage(rowBounds));
		
		return page;
	}

}
