package com.spring.biz;

import java.util.List;

import com.spring.entity.News;
import com.spring.util.Page;

/**
 * ���ŵ�ҵ���ӿ�
 * @author ldl
 *
 */
public interface NewsBiz {
	/**
	 * ��ѯȫ������
	 * @return
	 */
	List<News> selectAll();
	
	/**
	 * ��ҳ��ѯ
	 * @param pageNo ��ǰҳ��
	 * @return
	 */
	Page<News> selectAllByPage(int pageNo);
}
