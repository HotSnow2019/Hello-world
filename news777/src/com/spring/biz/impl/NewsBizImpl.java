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
		//设置页面大小
		int pageSize = 10;
		page.setPageSize(pageSize);
		//设置页面的记录总数和页数
		int totalRowCount = newsDao.selectCount();
		page.setTotalRowCount(totalRowCount);
		//设置当前页码
		page.setCurrentPageNo(pageNo);
		//提取当前页的数据
		RowBounds rowBounds = 
				new RowBounds(
						(pageNo - 1) * pageSize, 
						pageSize
						);
		page.setData(newsDao.selectByPage(rowBounds));
		
		return page;
	}

}
