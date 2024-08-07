package packageOne;

public class SamePackageNonSubclass {
	ProtectionLevel pl;
	public SamePackageNonSubclass() {
		// TODO Auto-generated constructor stub
		pl=new ProtectionLevel();
		System.out.println("Default num= "+pl.num);
//		System.out.println("Private num= "+pl.numpri);
		System.out.println("Protected num= "+pl.numpro);
		System.out.println("Public num= "+pl.numpub);
	}
}
//in same package non sub class: private data are not accessed.