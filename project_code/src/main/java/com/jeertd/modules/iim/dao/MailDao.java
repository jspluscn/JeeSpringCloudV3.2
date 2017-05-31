/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeertd.org/">jeertd</a> All rights reserved.
 */
package com.jeertd.modules.iim.dao;

import com.jeertd.common.persistence.CrudDao;
import com.jeertd.common.persistence.annotation.MyBatisDao;
import com.jeertd.modules.iim.entity.Mail;

/**
 * 发件箱DAO接口
 * @author jeertd
 * @version 2015-11-15
 */
@MyBatisDao
public interface MailDao extends CrudDao<Mail> {
	public int getCount(MailDao entity);
}