package week5day2;

public class Automation extends MultipleLanguage implements Language,TestTool{
	public void Selenium() {
		// TODO Auto-generated method stub
	System.out.println("Selenium is used in Automated testing");	
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("JAVA is a programming language");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby is a language");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Automation a=new Automation();
a.Java();a.python();a.ruby();a.Selenium();
	}

	

}
