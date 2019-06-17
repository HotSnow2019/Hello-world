package com.spring.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.spring.entity.News;

/**
 * ���ŵ����ݷ��ʲ�
 * @author ldl
 *
 */
public interface NewsDao {
	/**
	 * ��ѯȫ��������Ϣ
	 * @return
	 */
	public List<News> selectAll();
	
	/**
	 * ��ѯ��¼����
	 * @return
	 */
	public int selectCount();
	
	/**
	 * ��ҳ��ѯ
	 * @param rowBounds
	 * @return
	 */
	public List<News> selectByPage(RowBounds rowBounds);
}
