package runner;

import polymorphism.bank;
import polymorphism.barclays;
import polymorphism.santander;

public class runnerBanks {
	public static void main(String[] args) {
		barclays barclays = new barclays();
		barclays.accountOpen();
		barclays.showBalance();

		polymorphism.barclays bank = new barclays();
		bank.accountOpen();
		((barclays) bank).showBalance();

		Object object = new barclays();
		((barclays) object).accountOpen();
		((barclays) object).showBalance();

		barclays b = new barclays();
		santander s = new santander();
		bank banking = new bank();

//	doBanking(b);
//	doBanking(s);
		doBanking(banking);
	}

	public static void doBanking(bank ref) {
		ref.accountOpen();
		ref.showBalance();
	}

}
