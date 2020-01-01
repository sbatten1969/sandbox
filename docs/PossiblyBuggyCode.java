// Purpose: Store possibly buggy class files for analysis by SonarCloud.io

public class PossiblyBuggyCode {
	public static void main (String[] args) throws java.lang.Exception {
		// Ignore this.  See local class definitions below.
	}
}

class SamplePossiblyBuggyClass {
	public String method1() {
		String uninitializedReturnValue;
		return uninitializedReturnValue;
	}
}
