package by.epam.rentshopweb.service;

import by.epam.rentshopweb.service.exception.ServiceException;

public interface DBInitService {
	void initConnectionPoolData() throws ServiceException;

	void destroyConnectionPoolData() throws ServiceException;

}
