/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.zhiao.blzc.modules.gen.dao;


import com.zhiao.blzc.common.persistence.CrudDao;
import com.zhiao.blzc.common.persistence.annotation.MyBatisDao;
import com.zhiao.blzc.modules.gen.entity.GenTable;

/**
 * 业务表DAO接口
 * @author ThinkGem
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTableDao extends CrudDao<GenTable> {
	
}
