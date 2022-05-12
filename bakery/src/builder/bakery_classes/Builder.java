package builder.bakery_classes;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder 
{
	void setPastryType(PastryType hawaiianPizza);

	void setFETACheeseAmount(int mOZZARELLA_AMOUNT_PIZZA);

	void setMozzarellaCheeseAmount(int fETA_AMOUNT_PIZZA);

	void setMUSHROOMSAmount(int mUSHROOMS_AMOUNT_PIZZA);

	void setPINEAPPLEAmount(int pINEAPPLE_AMOUNT_PIZZA);	
}
