/**
 * 
 */
package com.niit.bnr.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.bnr.model.UserMessage;

/**
 * @author SARWAN
 *
 */
@SuppressWarnings("unused")
@Transactional
public class UserMessageDAOImp implements UserMessageDAO {

	@Autowired
	SessionFactory session;

	@Override
	public void insertMessage(UserMessage um) {
		session.getCurrentSession().persist(um);

	}

}
