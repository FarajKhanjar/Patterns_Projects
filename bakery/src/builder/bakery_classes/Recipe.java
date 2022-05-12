package builder.bakery_classes;

public class Recipe 
{
	private final PastryType pastryType;
    private final int MOZZARELLA_AMOUNT;
    private final int FETA_AMOUNT;
    private final int MUSHROOMS_AMOUNT;
    private final int PINEAPPLE_AMOUNT;
	public Recipe(PastryType pastryType, int mOZZARELLA_AMOUNT, int fETA_AMOUNT, int mUSHROOMS_AMOUNT, int pINEAPPLE_AMOUNT) 
	{
		this.pastryType = pastryType;
		MOZZARELLA_AMOUNT = mOZZARELLA_AMOUNT;
		FETA_AMOUNT = fETA_AMOUNT;
		MUSHROOMS_AMOUNT = mUSHROOMS_AMOUNT;
		PINEAPPLE_AMOUNT = pINEAPPLE_AMOUNT;
	}
	
	@Override
	public String toString() {
		return "Recipe [pastryType=" + pastryType + ", MOZZARELLA_AMOUNT=" + MOZZARELLA_AMOUNT + ", FETA_AMOUNT="
				+ FETA_AMOUNT + ", MUSHROOMS_AMOUNT=" + MUSHROOMS_AMOUNT + ", PINEAPPLE_AMOUNT=" + PINEAPPLE_AMOUNT
				+ "]";
	}
}