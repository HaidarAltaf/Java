package projectExercise;

public class BackendDev implements Developer{
	
	public void Dev() {
			System.out.println("C# is just Microsoft Java anyway.");
	}

	@Override
	public void Dev(String Dev) {
		Dev();
	}
}
