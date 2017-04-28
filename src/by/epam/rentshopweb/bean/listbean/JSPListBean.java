package by.epam.rentshopweb.bean.listbean;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import by.epam.rentshopweb.bean.entity.Product;

public class JSPListBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Iterator<? extends Product> it;
	private List<? extends Product> list;

	public JSPListBean() {
	}

	public JSPListBean(List<? extends Product> list) {
		this.list = list;
	}

	public int getSize() {
		it = list.iterator();
		return list.size();
	}

	public Product getElement() {
		return (Product) it.next();
	}

	public Iterator<? extends Product> getIt() {
		return it;
	}

	public void setIt(Iterator<? extends Product> it) {
		this.it = it;
	}

	public List<? extends Product> getList() {
		return list;
	}

	public void setList(List<? extends Product> list) {
		this.list = list;
	}

}
