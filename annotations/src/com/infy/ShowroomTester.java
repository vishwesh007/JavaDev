package com.infy;

import java.util.ArrayList;

//Using common annotations demo
class BudgetPhone {
	public void megaDiscount() {
		System.out.println("5% offer applied");
	}

	@Deprecated
	public static void update() {
		System.out.println("Upgraded new features");
	}
}

class GamingPhone extends BudgetPhone {
	@Override
	public void megaDiscount() {
		System.out.println("25% offer applied");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	// @SuppressWarnings("all")
	public void addPhones() {
		ArrayList list = new ArrayList();
		list.add("Lenova KS");
		list.add("One + nord CE5G");
		list.add("Mi 10");

		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}

class ShowroomTester {
	// @SuppressWarnings({"unused","deprecation"})

	@SuppressWarnings("all")
	public static void main(String[] args) {
		GamingPhone phObj = new GamingPhone();

		// BudgetPhone.update();

		phObj.addPhones();

	}

}
