/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.zhiao.blzc.modules.cms.dao;

import com.zhiao.blzc.common.persistence.CrudDao;
import com.zhiao.blzc.common.persistence.annotation.MyBatisDao;
import com.zhiao.blzc.modules.cms.entity.Link;

import java.util.List;

/**
 * 链接DAO接口
 * @author ThinkGem
 * @version 2013-8-23
 */
@MyBatisDao
public interface LinkDao extends CrudDao<Link> {
	
	public List<Link> findByIdIn(String[] ids);
//	{
//		return find("front Like where id in (:p1)", new Parameter(new Object[]{ids}));
//	}
	
	public int updateExpiredWeight(Link link);
//	{
//		return update("update Link set weight=0 where weight > 0 and weightDate < current_timestamp()");
//	}
//	public List<Link> fjindListByEntity();
}
