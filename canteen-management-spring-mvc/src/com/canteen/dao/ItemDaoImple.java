package com.canteen.dao;

import java.awt.event.ItemListener;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.canteen.dto.*;


@Repository
public class ItemDaoImple implements ItemDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	public void save(final Item item) {
		hibernateTemplate.execute(new HibernateCallback<List<Item>>() {
			public List<Item> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.save(item);
				t.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}

	public void deleteById(final String itemId) {
		hibernateTemplate.execute(new HibernateCallback<List<Item>>() {
			public List<Item> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.delete(new Item(itemId));
				t.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}

	public void update(final Item item) {
		
		hibernateTemplate.execute(new HibernateCallback<List<Item>>() {
			public List<Item> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.update(item);
				t.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}

	public List<Item> getAll() {
		List<Item> ul = hibernateTemplate.execute(new HibernateCallback<List<Item>>() {
			public List<Item> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				Query q = session.createQuery("from Item");
				List<Item> itemList = q.list();
				t.commit();
				session.flush();
				session.close();
				return itemList;
			}
		});
		return ul;
	}

	
	
	@Override
	public List<Daily> getDate(Daily date) {
		// TODO Auto-generated method stub
		List<Daily> ul = hibernateTemplate.execute(new HibernateCallback<List<Daily>>() {
			public List<Daily> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				Query q = session.createQuery("from Daily where month(date) between ? and '02' and year(date) between ? and 2019");
				//Query q = session.createQuery("from Daily where month=? or year=?");
				
				q.setInteger(0,date.getMonth());
				q.setInteger(1, date.getYear());
				
				System.out.println(q);
				List<Daily> itemList = q.list();
				//System.out.println();
				for(Daily u : itemList) {
					//System.out.println("after");
					System.out.println(u.getCoursename()+u.getItemname());
					System.out.println();
				}
				t.commit();
				session.flush();
				session.close();
				return itemList;
			}
		});
		return ul;
	}

	@Override
	public boolean loginMethod(Login log) {
		// TODO Auto-generated method stub		
		List<Login> ul = hibernateTemplate.execute(new HibernateCallback<List<Login>>() {
			public List<Login> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				Query q = session.createQuery("from Login where username=? and password=?");
				//Query q = session.createQuery("from Daily where month=? or year=?");
				
				q.setString(0, log.getUsername());
				q.setString(1,log.getPassword());
				List<Login> itemList = q.list();
				t.commit();
				session.flush();
				session.close();
				return itemList;
			}
		});
		
		if(ul.isEmpty())
		return false;
		else
		return true;	
	}
	
	

	
}