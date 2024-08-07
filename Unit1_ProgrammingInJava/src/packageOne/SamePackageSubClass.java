package packageOne;

public class SamePackageSubClass extends ProtectionLevel {
	public SamePackageSubClass() {
		System.out.println("Default num= "+num);
//		System.out.println("Private num= "+numpri);
		System.out.println("Protected num= "+numpro);
		System.out.println("Public num= "+numpub);
	}
}
//In same package sub class: private data are not accessed