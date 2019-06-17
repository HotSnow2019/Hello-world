package com.spring.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.spring.entity.News;

/**
 * 新闻的数据访问层
 * @author ldl
 *
 */
public interface NewsDao {
	/**
	 * 查询全部新闻信息
	 * @return
	 */
	public List<News> selectAll();
	
	/**
	 * 查询记录总数
	 * @return
	 */
	public int selectCount();
	
	/**
	 * 分页查询
	 * @param rowBounds
	 * @return
	 */
	public List<News> selectByPage(RowBounds rowBounds);
}
