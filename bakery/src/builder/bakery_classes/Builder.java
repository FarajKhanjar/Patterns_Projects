package builder.bakery_classes;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder 
{
	void setPastryType(PastryType hawaiianPizza);

	void setMozzarellaCheeseAmount(int MozzarellaCheeseAmount);

	void setFetaCheeseAmount(int FetaCheeseAmount);

	void setMushroomsAmount(int MushroomsAmount);

	void setPineappleAmount(int PineappleAmount);	
}
