package week5day2;

public class Mybank extends SBI implements RBI{

	public static void main(String[] args) {
		
		SBI i=new SBI();
		i.openaccount();
		i.providedebitcard();
		i.providecreditcad();
	RBI r=new SBI();
	r.openaccount();
	r.providedebitcard();
	}

}
