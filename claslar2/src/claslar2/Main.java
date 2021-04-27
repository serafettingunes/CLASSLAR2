package claslar2;

public class Main {

	public static void main(String[] args) {
		Product product=new Product();
		product.set_name("Monster Tulpar T7");
		product.setId(1);
		product.set_price(12000);
		product.set_stockAmonut(10);
		
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		
		
		
	}

}
