package com.xworkz.common.repository;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.common.entity.EndgameEntity;

@Repository
public class EndgameRepoImpl implements EndgameRepo {

	private Logger logger;

	@Autowired
	private SessionFactory bean;

	public EndgameRepoImpl() {
		logger = Logger.getLogger(getClass());
	}

	public Integer save(EndgameEntity entity) {
		Transaction transaction = null;
		Integer affectedRow = 0;
		try (Session session = bean.openSession()) {

			transaction = session.beginTransaction();
			affectedRow = (Integer) session.save(entity);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			logger.error("found exception in {} " + e.getMessage(), e);
		}
		return affectedRow;
	}

	public EndgameEntity getByEmailId(String emailId) {

		Transaction transaction = null;
		Session session = null;
		EndgameEntity entity = null;
		try {
			session = bean.openSession();
			Query query = session.createNamedQuery("getByEmailId");
			query.setParameter("email", emailId);
			entity = (EndgameEntity) query.uniqueResult();
		} catch (Exception e) {
			logger.error("found exception in {} " + e.getMessage(), e);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return entity;
	}

}
