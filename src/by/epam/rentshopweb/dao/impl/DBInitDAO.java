package by.epam.rentshopweb.dao.impl;

import by.epam.rentshopweb.dao.SourceInit;
import by.epam.rentshopweb.dao.connectionpool.ConnectionPool;
import by.epam.rentshopweb.dao.connectionpool.exception.ConnectionPoolException;
import by.epam.rentshopweb.dao.exception.DaoException;

/**
 * This class is the implementation of the
 * {@link com.epam.library.dao.SourceInit} for working with database.
 *
 */
public class DBInitDAO implements SourceInit {

	@Override
	public void init() throws DaoException {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		try {
			connectionPool.initPoolData();
		} catch (ConnectionPoolException e) {
			throw new DaoException("Failed connection pool initialization.", e);
		}

	}

	@Override
	public void destroy() throws DaoException {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		try {
			connectionPool.dispose();
		} catch (ConnectionPoolException e) {
			throw new DaoException("Failed connection pool destroying", e);
		}

	}

}
