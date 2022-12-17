package org.system;

public class Desktop extends Computer{

	public int desktopSize(int size)
	{
		return size;
	}

	@Override
	public String computerModel(String modelName) {
		// TODO Auto-generated method stub
		return super.computerModel(modelName);
	}
	
	public static void main(String[] args) {
		
		Desktop mySystem = new Desktop();
		String computerModel = mySystem.computerModel("DELL DESKTOP-CFJT8VS");
		System.out.println("The computer model name is " + computerModel);
		int desktopSize = mySystem.desktopSize(21);
		System.out.println("The Dekstop size is  " + desktopSize);		
		
	}
	
	
	
}
