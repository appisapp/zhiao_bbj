/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.zhiao.blzc.modules.sys.dao;


import com.zhiao.blzc.common.persistence.TreeDao;
import com.zhiao.blzc.common.persistence.annotation.MyBatisDao;
import com.zhiao.blzc.modules.sys.entity.Area;

/**
 * 区域DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
