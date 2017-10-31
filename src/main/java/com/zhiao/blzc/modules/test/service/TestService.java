/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.zhiao.blzc.modules.test.service;

import com.zhiao.blzc.common.service.CrudService;
import com.zhiao.blzc.modules.test.dao.TestDao;
import com.zhiao.blzc.modules.test.entity.Test;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 测试Service
 * @author ThinkGem
 * @version 2013-10-17
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

}
