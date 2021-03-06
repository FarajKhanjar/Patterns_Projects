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

        PastryBuilder pastryBuilder = new PastryBuilder();
        
        director.constructHawaiianPizza(pastryBuilder);
        Pastry pastry1_hawaiianPizza = pastryBuilder.getResult();
        System.out.println("Get Pastry:\n" + pastry1_hawaiianPizza.getPastryType());
        
        director.constructDominicanPuffPastry(pastryBuilder);
        Pastry pastry2_dominicanPuffPastry = pastryBuilder.getResult();
        System.out.println("Get Pastry :\n" + pastry2_dominicanPuffPastry.getPastryType());

        RecipeBuilder recupeBuilder = new RecipeBuilder();

        director.constructHawaiianPizza(recupeBuilder);
        Recipe recipe1_hawaiianPizza = recupeBuilder.getResult();
        System.out.println(recipe1_hawaiianPizza);

        director.constructDominicanPuffPastry(recupeBuilder);
        Recipe recipe2_hawaiianPizza = recupeBuilder.getResult();
        System.out.println(recipe2_hawaiianPizza);
    }
}