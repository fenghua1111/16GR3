/**
 * 
 */
package com.qhit.lh.g3.hzz.exam.common.dao;

import com.qhit.lh.g3.hzz.exam.common.bean.User;

/**
 * @author admin
 */
public interface UserDao {
	/**
	 * @param user
	 * @return
	 * 登录
	 */
	public User login(User user);
}
