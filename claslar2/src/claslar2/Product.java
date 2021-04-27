package claslar2;

public class Product {
	
	public  Product(int id,String name,String description,double price,int stockAmount) {
		
	}
	
	
private int _id;
private String _name;
private String _description;
private double _price;
private int _stockAmonut;

public int getId()
{
	return _id;
}

public void setId(int id)
{
  _id=id;
 
}

public String get_name() {
	return _name;
}

public void set_name(String name) {
	this._name = name;
}

public String get_description() {
	return _description;
}

public void set_description(String description) {
	this._description = description;
}

public double get_price() {
	return _price;
}

public void set_price(double price) {
	this._price = price;
}

public int get_stockAmonut() {
	return _stockAmonut;
}

public void set_stockAmonut(int stockAmonut) {
	this._stockAmonut = stockAmonut;
}

}
