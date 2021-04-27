package claslar2;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(1,"Monster Tulpar T7","Yeni ürün",12000,50);
		
		
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		
		
		
	}

}
