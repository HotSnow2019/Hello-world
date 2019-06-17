package com.spring.biz;

import java.util.List;

import com.spring.entity.News;
import com.spring.util.Page;

/**
 * 新闻的业务层接口
 * @author ldl
 *
 */
public interface NewsBiz {
	/**
	 * 查询全部新闻
	 * @return
	 */
	List<News> selectAll();
	
	/**
	 * 分页查询
	 * @param pageNo 当前页码
	 * @return
	 */
	Page<News> selectAllByPage(int pageNo);
}
