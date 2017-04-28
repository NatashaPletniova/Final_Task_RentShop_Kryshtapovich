package by.epam.rentshopweb.service.impl;

import by.epam.rentshopweb.dao.DAOFactory;
import by.epam.rentshopweb.dao.SourceInit;
import by.epam.rentshopweb.dao.exception.DaoException;
import by.epam.rentshopweb.service.DBInitService;
import by.epam.rentshopweb.service.exception.ServiceException;

public class DBRentShopInit implements DBInitService {
	@Override
	public void initConnectionPoolData() throws ServiceException {
		DAOFactory factory = DAOFactory.getInstance();
		SourceInit initDAO = factory.getSourceInitDAO();

		try {
			initDAO.init();
		} catch (DaoException e) {
			throw new ServiceException("Failed initialization.", e);
		}
	}

	@Override
	public void destroyConnectionPoolData() throws ServiceException {
		DAOFactory factory = DAOFactory.getInstance();
		SourceInit initDAO = factory.getSourceInitDAO();

		try {
			initDAO.destroy();
		} catch (DaoException e) {
			throw new ServiceException("Failed destroying.", e);
		}
	}
	
}
