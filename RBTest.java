package java8;

import java.util.ArrayList;
import java.util.List;

public class RBTest {

	public static void main(String[] args) {
		String sale = "A:3,B:5,C:6";
		String price = "A:30,B:45,C:56";
		// creating list
		List<Sale> salelist = new ArrayList<Sale>();
		List<Price> pricelist = new ArrayList<Price>();
		// first split
		String[] salelistone = sale.split(",");// A:3//B:5//C:6
		String[] pricelistone = price.split(",");
		// second split and assignation
		for (String s : salelistone) {
			String[] salelistsecond = s.split(":");
			for (int i = 0; i < salelistsecond.length - 1; i++) {
				salelist.add(new Sale(salelistsecond[i], Integer.valueOf(salelistsecond[i + 1])));
				
			}
		}
		
		for (String p : pricelistone) {
			String[] pricelistsecond = p.split(":");
			for (int j = 0; j < pricelistsecond.length - 1; j++) {
				pricelist.add(new Price(pricelistsecond[j], Integer.valueOf(pricelistsecond[j + 1])));
				
			}
		}
		//salelist.stream().forEach(System.out::println);
		//pricelist.stream().forEach(System.out::println);
		
		List<Report> reportlist = new ArrayList<Report>();
		reportlist=generateRev(salelist, pricelist);
		reportlist.stream().forEach(System.out::println);
		
		//System.out.println(salelist.toString());
		// System.out.println(pricelist.toString());
	}

	public static List<Report> generateRev(List<Sale> salelist, List<Price> pricelist) {
		List<Report> reportlist = new ArrayList<Report>();

		for (int i = 0; i < salelist.size(); i++) {
			String product=null;
			int quantity=0;
			int price = 0;
			for (Sale s: salelist) {
				 product = s.getProduct();
				 quantity = s.getQuantity();
				//System.out.println("product and qty : "+product+" "+quantity);
			}
			for (Price p : pricelist) {
				
				 price = p.getPrice();
				 //System.out.println("price : "+price);
			}
			reportlist.add(new Report(product,quantity,price,quantity*price));
		}
		return reportlist;
	}

	static class Sale {
		String product;
		int quantity;

		public Sale(String product, int quantity) {
			this.product = product;
			this.quantity = quantity;

		}

		public String getProduct() {
			return product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return "Sale [product=" + product + ", quantity=" + quantity + "]";
		}

	}

	static class Price {
		String product;
		int price;

		public Price(String product, int price) {
			this.product = product;
			this.price = price;

		}

		public String getProduct() {
			return product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Price [product=" + product + ", price=" + price + "]";
		}

	}

	static class Report {
		String product;
		int quantity;
		int price;
		int revenue;

		public Report(String product, int quantity, int price, int revenue) {
			super();
			this.product = product;
			this.quantity = quantity;
			this.price = price;
			this.revenue = revenue;
		}

		public String getProduct() {
			return product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getRevenue() {
			return revenue;
		}

		public void setRevenue(int revenue) {
			this.revenue = revenue;
		}

		@Override
		public String toString() {
			return "Report [product=" + product + ", quantity=" + quantity + ", price=" + price + ", revenue=" + revenue
					+ "]";
		}

	}
}