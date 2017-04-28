package by.epam.rentshopweb.dao;

import by.epam.rentshopweb.dao.impl.DBInitDAO;
import by.epam.rentshopweb.dao.impl.RentShopDAO;

public class DAOFactory {

	private static final DAOFactory INSTANCE = new DAOFactory();

	private RentShop rentShopDAO = new RentShopDAO();
	private SourceInit initDAO = new DBInitDAO();

	private DAOFactory() {
	}

	public static DAOFactory getInstance() {
		return INSTANCE;
	}

	public RentShop getRentShopDAO() {
		return rentShopDAO;
	}

	public SourceInit getSourceInitDAO() {
		return initDAO;
	}

}
