package packageTwo;

import packageOne.ProtectionLevel;

public class DifferentPackageSubClass extends ProtectionLevel {
	public DifferentPackageSubClass() {
		// TODO Auto-generated constructor stub
//		System.out.println("Default num= "+num);
//		System.out.println("Private num= "+numpri);
		System.out.println("Protected num= "+numpro);
		System.out.println("Public num= "+numpub);
	}

}
//in Different Package SubClass: default and private data are not accessed
