// Purpose: Store possibly buggy class files for analysis by SonarCloud.io

public class PossiblyBuggyCode {
	public static void main (String[] args) throws java.lang.Exception {
		System.out.printf("Ignore this method. Code to investigate is in local class below.\n");
	}
}

class SamplePossiblyBuggyClass {
	public String method1() {
		String possiblyUninitializedReturnValue = "";
		return possiblyUninitializedReturnValue;
	}
}
