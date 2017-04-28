package by.epam.rentshopweb.service;

import by.epam.rentshopweb.service.impl.DBRentShopInit;
import by.epam.rentshopweb.service.impl.RentShopGeneralService;

public class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private RentShopService rentShopService = new RentShopGeneralService();
	private DBInitService dbInitService = new DBRentShopInit();

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

	public RentShopService getRentShopService() {
		return rentShopService;
	}

	public DBInitService getDBInitService() {
		return dbInitService;
	}

}
