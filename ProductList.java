package Java8;

import java.util.*;
import java.util.stream.Collectors;

class Product {
	int productId;
	String productName;

	public Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;

	}

	public String toString() {
		return "productId " + productId + ", productName:" + productName;
	}
}

public class ProductList {

	public static void main(String[] ags) {
		List<Product> prd = new ArrayList<Product>();
		prd.add(new Product(1, "product1"));
		prd.add(new Product(2, "product2"));

		List<Product> lst = prd.stream().filter(pr -> pr.productId > 1).collect(Collectors.toList());

		lst.forEach(System.out::println);
	}

}
