
public class Automation extends MultipleLangauge {
	
	public static void main(String[] args) {
		
		Automation myAutomation = new Automation();
		myAutomation.java();
		myAutomation.Selenium();
		myAutomation.python();
		myAutomation.ruby();
		
	}

	public void java() {
		 
		System.out.println("This JAVA method is obtained from Interface Language.");
		
	}

	public void Selenium() {
		 
		System.out.println("This SELENIUM method is obtained from TestTool Language.");
		
	}

	@Override
	public void python() {
		// TODO Auto-generated method stub
		super.python();
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub	
		System.out.println("The language which in unimplement is RUBY");
	}
	
	
	

}
