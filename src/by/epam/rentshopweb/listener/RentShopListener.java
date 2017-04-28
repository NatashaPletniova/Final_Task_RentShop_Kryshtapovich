package by.epam.rentshopweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import by.epam.rentshopweb.dao.connectionpool.ConnectionPool;
import by.epam.rentshopweb.dao.connectionpool.exception.ConnectionPoolException;

public class RentShopListener implements ServletContextListener {

	public RentShopListener() {
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		try {
			ConnectionPool.getInstance().dispose();
		} catch (ConnectionPoolException e) {
			throw new RuntimeException();
		}
	}

	public void contextInitialized(ServletContextEvent arg0) {

		try {
			ConnectionPool.getInstance().initPoolData();
		} catch (ConnectionPoolException e) {
			throw new RuntimeException();
		}
	}

}
