package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product //implements Comparator<Product>
{
     private int pId;
     private String pName;
     
	public Product(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "\nProduct [pId=" + pId + ", pName=" + pName + "]";
	}


	static Comparator<Product> productName = new Comparator<Product>(){
		@Override
		public int compare(Product o1, Product o2) {
			return o1.getpName().compareTo(o2.getpName());
	     	}
	    };	

  /*class PrId implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getpId()-o2.getpId();
	}
	
    class PrName implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getpName().compareTo(o2.getpName());
	}*/
	    }
  
  
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(104,"Shampoo");
		Product p2 = new Product(102,"Parle G");
		Product p3 = new Product(107,"Pen");
		Product p4 = new Product(105,"Pencil");
		Product p5 = new Product(101,"Rubber");
		Product p6 = new Product(109,"Notebook");
		
		List<Product> l = new ArrayList();
		
		l.add(p2);
		l.add(p1);
		l.add(p6);
		l.add(p3);
		l.add(p5);
		l.add(p4);
		
		System.out.println(l);
		Collections.sort(l, Product.productName);
		System.out.println("\n"+l);
	}

}
