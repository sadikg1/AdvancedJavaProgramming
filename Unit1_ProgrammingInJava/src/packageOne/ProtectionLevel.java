package packageOne;

public class ProtectionLevel {
	int num=11;
	private int numpri=22;
	protected int numpro=33;
	public int numpub=44;
	
	public ProtectionLevel() {
		System.out.println("Default num= "+num);
		System.out.println("Private num= "+numpri);
		System.out.println("Protected num= "+numpro);
		System.out.println("Public num= "+numpub);
		
	}


}
//same package , same class all types data are accessed.
//Package: 
//1. User defined package: packageOne,etc....
//2. System defined package : Java.util, javax.swing, jav.io, java.sql etc
//Access Modifiers or specifiers: default, public, protected, private
