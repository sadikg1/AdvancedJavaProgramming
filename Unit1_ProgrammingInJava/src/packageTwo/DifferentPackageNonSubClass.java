package packageTwo;

import packageOne.ProtectionLevel;

public class DifferentPackageNonSubClass {
	ProtectionLevel pl=new ProtectionLevel();
	public DifferentPackageNonSubClass() {
		// TODO Auto-generated constructor stub
//		System.out.println("Default num= "+pl.num);
//		System.out.println("Private num= "+pl.numpri);
//		System.out.println("Protected num= "+pl.numpro);
		System.out.println("Public num= "+pl.numpub);
	}
	
}
//in Different Package NOn SubClass: default, private and protected data are not accessed