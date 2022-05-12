package builder.bakery_client;

import builder.bakery_classes.Director;
import builder.bakery_classes.Pastry;
import builder.bakery_classes.PastryBuilder;
import builder.bakery_classes.Recipe;
import builder.bakery_classes.RecipeBuilder;

public class Runner 
{
	public static void main(String[] args) 
	{
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        PastryBuilder pastryBuilder = new PastryBuilder();
        
        director.constructHawaiianPizza(pastryBuilder);
        Pastry pastry1_hawaiianPizza = pastryBuilder.getResult();
        System.out.println("Get Pastry:\n" + pastry1_hawaiianPizza.getPastryType());
        
        director.constructDominicanPuffPastry(pastryBuilder);
        Pastry pastry2_dominicanPuffPastry = pastryBuilder.getResult();
        System.out.println("Get Pastry :\n" + pastry2_dominicanPuffPastry.getPastryType());


        RecipeBuilder recupeBuilder = new RecipeBuilder();

        // Director may know several building recipes.
        director.constructHawaiianPizza(recupeBuilder);
        Recipe recipe1_hawaiianPizza = recupeBuilder.getResult();
        System.out.println(recipe1_hawaiianPizza);

        director.constructDominicanPuffPastry(recupeBuilder);
        Recipe recipe2_hawaiianPizza = recupeBuilder.getResult();
        System.out.println(recipe2_hawaiianPizza);
    }
}
