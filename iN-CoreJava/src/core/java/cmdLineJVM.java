package core.java;

public class cmdLineJVM {

	public static void main(String[] args) {
		args[1] = "Boy";
		args[2] = "!"; //exception for JVM because memory is not created
		System.out.println(args[0]+" "+args[1]);
	}

}
