/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.zhiao.blzc.test.dao;

import com.zhiao.blzc.common.persistence.CrudDao;
import com.zhiao.blzc.common.persistence.annotation.MyBatisDao;
import com.zhiao.blzc.test.entity.TestDataChild;

/**
 * 主子表生成DAO接口
 * @author ThinkGem
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestDataChildDao extends CrudDao<TestDataChild> {
	
}