package by.epam.rentshopweb.dao;

import by.epam.rentshopweb.dao.exception.DaoException;

/**
 * Interface contains methods required for initialization of the data source for
 * working with data storage.
 *
 */
public interface SourceInit {

	/**
	 * Initializes the data source.
	 * 
	 * @throws DAOException
	 *             if initialization fails.
	 */

	void init() throws DaoException;

	/**
	 * Destroys the data source.
	 * 
	 * @throws DAOException
	 *             if destroying fails.
	 */
	void destroy() throws DaoException;

}
