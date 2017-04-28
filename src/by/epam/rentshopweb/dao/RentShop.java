package by.epam.rentshopweb.dao;

import java.util.List;

import by.epam.rentshopweb.bean.entity.Product;
import by.epam.rentshopweb.bean.entity.ProductItem;
import by.epam.rentshopweb.dao.exception.DaoException;

public interface RentShop {

	void addProductItem(int productID, int manufacturingYear, String itemNote, int status, int wearRate,
			Integer productCategoryID, String productName, Double productBasePrice) throws DaoException;

	void deleteProductItemByID(int productItemID) throws DaoException;

	List<Product> showProductByName(String name) throws DaoException;

	List<Product> showAllProduct() throws DaoException;

	ProductItem showParticularProductItem(int productItemID) throws DaoException;

	List<ProductItem> showProductItemAvailability(int productID, int status, int availableQuantity) throws DaoException;

	int rentProductItem(int productItemID, int rentPeriod, String clientName) throws DaoException;

}
