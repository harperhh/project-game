 /*
1.3 Choose your own path
Author: Harper H
Date: 10/14/22
Course: APCSA 1
Description: Gets user input to let them make their decisions and choose the path they want to go on
*/

import java.util.Scanner;
public class projectGame 
{
    public static void main(String[] args)
   {
       // sets up getting user input
       Scanner input = new Scanner(System.in);
       // asking the inital question
       System.out.println("Do you want to bake red velvet cupcakes(a), lemon cupcakes(b), or white chocolate raspberry(c)?");
       String input1 = input.nextLine();    
       //variables for printing recipe in final statement
       String whiteChocRasp = "Preheat the oven to 350˚F/ 175˚C and place a rack in the center of the oven. Line a 12 muffin tin with 12 paper cupcake cases. In a small bowl whisk together the flour, baking powder, and salt. Set these dry ingredients aside. In a large bowl add the eggs, sugar, vegetable oil, vanilla, and lemon juice and whisk it well to combine. Add ⅓ of the flour mixture to the bowl of wet ingredients and stir it through, then add in ⅓ of the milk. Continue this, alternating between milk and flour until it's all combined. Don't overbeat the mixture. Toss the white chocolate chips in a bowl with about ½ tablespoon of flour to lightly coat them. Fold the chocolate chips into the cupcake batter, leaving behind any excess flour. Scoop ⅔ of the mixture into the 12 paper cases. Place 4-5 raspberries onto each cupcake and gently press them in a little. Top with the remaining cupcake batter. Bake the cupcakes for around 20-24 minutes until golden brown and until a skewer inserted into the middle comes out clean. The tops of cupcakes should spring back when lightly pressed. Cupcakes with frozen raspberries will need slightly longer baking. Once baked, let the cupcakes cool down completely to room temperature on a wire rack";
       String lemon = "Preheat the oven to 350°F. Line a 12-cup muffin pan with cupcake liners. Using a handheld or stand mixer fitted with a paddle attachment, beat the butter and sugar together on medium-high speed in a large bowl until creamed, about 2 minutes. Scrape down the sides and bottom of the bowl as needed. Add eggs and vanilla extract, then beat on medium-high speed until combined, about 1 minute. Scrape down the sides and bottom of the bowl as needed. Set aside. Whisk the flour, baking powder, and salt together in a medium bowl. Pour the dry ingredients into the wet ingredients, start the mixer on low speed, then slowly add the milk, lemon juice, and lemon zest. Once combined, stop the mixer. Do not overmix this batter. Spoon batter evenly into 12 cupcake liners, filling them about 2/3 full. Bake for about 18-22 minutes. A toothpick inserted in the middle will come out clean when they’re done. For around 30 mini cupcakes, bake for about 11-13 minutes, same oven temperature. Remove from the oven and allow to cool completely before frosting. I usually let them cool completely in the muffin pan";
       String redVelv = "Preheat the oven to 350 degrees and place cupcake papers in a cupcake pan. In a large bowl, sift the dry ingredients (including the sugar) into the bowl of a stand mixer and give it a whisk. In a separate bowl, whisk together the wet ingredients until they are well combined, then add some red food coloring. (The batter may be clumpy but do not worry). Cut the butter into tablespoon sized dollops and add it to the dry ingredients in the stand mixer and beat together. This should get you a sort of crumbly mixture. With your mixer running on low, add the wet ingredients to the dry mixture and mix until everything is incorporated. You may want to add a dash or two more of red food coloring until you reach the desired color. Distribute the batter evenly into the cupcake papers and bake for 15 to 20 minutes or until the cupcakes are golden and springy to the touch.";

       String creamCheese = "Combine butter and cream cheese in the bowl of a stand mixer (or you may use an electric mixer) and beat until creamy, well-combined, and lump-free. Add vanilla extract and salt and stir well to combine. With mixer on low, gradually add powdered sugar until completely combined. Use to frost completely cooled cake or cupcakes.";
       String buttercream = "Add softened butter and vanilla to the mixing bowl and mix until completely combined. Add Powdered Sugar and beat on low until it is incorporated. Then move mixer up to medium-high speed. Scrape sides and bottom of bowl often. When completely mixed the frosting may appear dry. Add milk a little bit at a time until frosting is the proper consistency.";

      
       //continues what happens if they pick a
       if (input1.equals("a"))
       {
            // continues the first path by asking the second question
            System.out.println("Do you want to put cream cheese frosting(a) or buttercream(b) on your red velvet cupcakes?");
            String input2 = input.nextLine();
                
            if (input2.equals("a"))
            {
                System.out.println("You chose to bake red velvet cupcakes, with cream cheese frosting! \n" + "For the cupcakes: \n" + redVelv + "\n" + "For the cream cheese frosting: \n" + creamCheese);
            }
            
            else if (input2.equals("b"))
            {
               System.out.println("You chose to bake red velvet cupcakes, with buttercream frosting!! \n" + "For the cupcakes: \n" + redVelv + "\n" + "For the buttercream frosting: \n" + buttercream);
            }
       }
       else if (input1.equals("b"))
       {
            // otherwise if the user doesnt pick a, they go down this path
            System.out.println("Do you want to put cream cheese frosting(a) or buttercream(b) on your lemon cupcakes?");
            String input4 = input.nextLine();
            //if they pick cream cheese frosting
            if (input4.equals("a"))
            {
               System.out.println("You chose to bake lemon cupcakes with cream cheese frosting! \n" + "For the cupcakes: \n" + lemon + "\n" + "For the cream cheese frosting: \n" + creamCheese);
            }            
            //other wise if they pick buttercream
            else if (input4.equals("b"))
            {
                System.out.println("You chose to bake lemon cupcakes with buttercream frosting! \n" + "For the cupcakes: \n" + lemon + "\n" + "For the buttercream frosting: \n" + buttercream);
            }
        }
           // continues the user down the third path option
        else if (input1.equals("c"))
        {
               // continues path by asking user the next question
            System.out.println("Do you want to put cream cheese frosting(a) or buttercream(b) on your white chocolate raspberry cupcakes?");
            String input5 = input.nextLine();
               //if user picks cream cheese 
            if (input5.equals("a"))
            {
                //creates a more complex path by asking one more question 
                System.out.println("Do you want to put sprinkles(a), on your white chocolate raspberry cupcakes, or no sprinkles(b)?");
                String input6 = input.nextLine();
               //prints the final statement if they pick c a a 
                if(input1.equals("c") && input5.equals("a") && input6.equals("a"))
                    {
                        System.out.println("You chose to bake white chocolate raspberry cupcakes with cream cheese frosting and sprinkles! \n" + "For the cupcakes: \n" + whiteChocRasp + "\n" + "For the cream cheese frosting: \n" + creamCheese);
                    }
                //prints the final statement if they pick c a b
                else if(input1.equals("c") && input5.equals("a") && input6.equals("b")) 
                    {
                        System.out.println("You chose to bake white chocolate raspberry cupcakes with cream cheese frosting and no sprinkles! \n" + "For the cupcakes: \n" + whiteChocRasp + "\n" + "For the cream cheese frosting: \n" + creamCheese);
                    }
                
            }
             //the other option if they pick buttercream
            else if (input5.equals("b"))
            {
                System.out.println("Do you want to put sprinkles(a), or no sprinkles(b) on your white chocolate raspberry cupcakes?");
                String input6 = input.nextLine();
                //prints final statement if certain conditions are met
                if(input1.equals("c") && input5.equals("b") && input6.equals("a"))
                    {
                        System.out.println("You chose to bake white chocolate raspberry cupcakes with buttercream frosting and sprinkles! \n" + "For the cupcakes: \n" + whiteChocRasp + "\n" + "For the buttercream: \n" + buttercream);
                    }
                // prints final statement for other set of conditions
                if(input1.equals("c") && input5.equals("b") && input6.equals("b"))
                    {
                        System.out.println("You chose to bake white chocolate raspberry cupcakes with buttercream frosting and no sprinkles! \n" + "For the cupcakes: \n" + whiteChocRasp + "\n" + "For the buttercream: \n" + buttercream);
                    }
            }
        }
        input.close();
    }
}