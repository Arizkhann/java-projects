package com.java.canteen;

 

import java.util.List;

 

import org.hibernate.Criteria;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

 

import com.java.canteen.Restaurant;

import com.java.canteen.SessionHelper;

 

public class RestaurantDAOImpl {

	SessionFactory sf;

	Session session;

	public List<Restaurant> showRestaurantDao() {

		SessionFactory sf = SessionHelper.getConnection();

		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Restaurant.class);

		return cr.list();

	}

 

}