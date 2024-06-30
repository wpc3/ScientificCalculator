package com.zipcodewilmington.scientificcalculator;

public class HelpPage {
    private String helpOperators;

    public String getHelpOperators(String input) {
        return helpOperators;
    }

    public static String helpOperator(String helpOperators){
       switch (helpOperators) {
           case "help":
           case "help me":
           case "h":
               String help =
                       "<*><*><*><*><*><*><*><*><*><*><*><*>" + "\n" +
                       "You can specificy if you need: " + "\n" +
                       "\"--DEG\" to switch to degrees " + "\n" +
                       "\"--operator help\" for operator" + "\n" +
                       "symbols" + "\n" +
                       "\"--memory help\" for storing or  " + "\n" +
                       "clearing or recalling values in mem" + "\n" +
                       "<*><*><*><*><*><*><*><*><*><*><*><*>";
               return help;
           case "--operator help":
               String oppHelp =
                       "<*><*><*><*><*><*><*><*><*><*><*><*>" + "\n" +
                       "operator symbols are as follows: " + "\n" +
                       "\"+ or - or / or *\"  for basic  " + "\n" +
                       "arithmetic" + "\n" +
                        "\"sine or cosine or tan or -sine\"  " + "\n" +
                         "\"or -tan or -cosine\"  " + "\n" +
                       "<*><*><*><*><*><*><*><*><*><*><*><*>";
               return oppHelp;
           case "--memory help":
               String memHelp =
                       "<*><*><*><*><*><*><*><*><*><*><*><*>" + "\n" +
                       "memory operations are as follows: " + "\n" +
                       "\"MC\"  clear memory  " + "\n" +
                       "\"M+\" store value to memory " + "\n" +
                        "\"MRC\" recall stored value " + "\n" +
                        "<*><*><*><*><*><*><*><*><*><*><*><*>";
               return memHelp;
           default:
               System.out.println("does not recognise");
               return null;

       }

   }


}
