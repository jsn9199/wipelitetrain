package com.ops;

public class opsint {
	public class D  implements InterfaceB,InterfaceC {
		public void display() {
			InterfaceB.super.display(); // Resolve ambiguity explicitly
			InterfaceC.super.display();
	    }
	}

}
