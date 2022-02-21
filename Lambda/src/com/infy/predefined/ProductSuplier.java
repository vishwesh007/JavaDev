package com.infy.predefined;


import java.util.List;
import java.util.function.Supplier;
public class ProductSuplier {
	public static void main(String[] args) {
		
        List<? extends Product> lst = Product.getProductList();
        for (Product e : lst) {
            generate(() -> e);
        }
    }

    public static void generate(Supplier<? extends Product> supplier) {
        System.out.println(supplier.get().getName()+":"+supplier.get().generateDiscoundSlip());
    }
} 