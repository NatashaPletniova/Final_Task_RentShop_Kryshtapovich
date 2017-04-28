package by.epam.rentshopweb.service;

import java.util.List;
import by.epam.rentshopweb.bean.entity.Product;
import by.epam.rentshopweb.bean.entity.ProductItem;
import by.epam.rentshopweb.service.exception.ServiceException;

public interface RentShopService {
	void addProductItem(int productID, int manufacturingYear, String itemNote, int status, int wearRate,
			Integer productCategoryID, String productName, Double productBasePrice) throws ServiceException;

	void deleteProductItemByID(int productItemID) throws ServiceException;

	List<Product> showProductByName(String name) throws ServiceException;

	List<Product> showAllProduct() throws ServiceException;

	ProductItem showParticularProductItem(String productItemID) throws ServiceException;

	List<ProductItem> showProductItemAvailability(int productID, int status, int availableQuantity)
			throws ServiceException;

	int rentProductItem(int productItemID, int rentPeriod, String clientName) throws ServiceException;
}
