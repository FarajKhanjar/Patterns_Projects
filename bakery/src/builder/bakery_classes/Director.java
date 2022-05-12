package builder.bakery_classes;

public class Director 
{
	private final int MOZZARELLA_AMOUNT_PIZZA=100,MOZZARELLA_AMOUNT_PUFF=10;
	private final int FETA_AMOUNT_PIZZA=40,FETA_AMOUNT_PUFF=100;
	private final int MUSHROOMS_AMOUNT_PIZZA=20,MUSHROOMS_AMOUNT_PUFF=20;
	private final int PINEAPPLE_AMOUNT_PIZZA=25,PINEAPPLE_AMOUNT_PUFF=20;
	
    public void constructHawaiianPizza(Builder builder) 
    {
        builder.setPastryType(PastryType.HAWAIIAN_PIZZA);
        builder.setMozzarellaCheeseAmount(MOZZARELLA_AMOUNT_PIZZA);
        builder.setFetaCheeseAmount(FETA_AMOUNT_PIZZA);
        builder.setMushroomsAmount(MUSHROOMS_AMOUNT_PIZZA);
        builder.setPineappleAmount(PINEAPPLE_AMOUNT_PIZZA);
    }
    
    public void constructDominicanPuffPastry(Builder builder) 
    {
        builder.setPastryType(PastryType.DOMINICAN_PUFFPASTRY);
        builder.setMozzarellaCheeseAmount(MOZZARELLA_AMOUNT_PUFF);
        builder.setFetaCheeseAmount(FETA_AMOUNT_PUFF);
        builder.setMushroomsAmount(MUSHROOMS_AMOUNT_PUFF);
        builder.setPineappleAmount(PINEAPPLE_AMOUNT_PUFF);
    }
}