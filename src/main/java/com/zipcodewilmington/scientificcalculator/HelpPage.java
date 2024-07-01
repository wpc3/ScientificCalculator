package com.zipcodewilmington.scientificcalculator;

public class HelpPage {
    private String helpOperators;

    public String getHelpOperators(String input) {
        return helpOperators;
    }

    public String helpOperator(String helpOperators){
        switch (helpOperators) {
           case "help":
//           case "help me":
//           case "h":
              // String help =
               return
                       "<*><*><*><*><*><*><*><*><*><*><*><*>" + "\n" +
                       "You can specificy if you need: " + "\n" +
                       "\"--operator help\" for operator" + "\n" +
                       "symbols" + "\n" +
                       "\"--memory help\" for storing or  " + "\n" +
                       "clearing or recalling values in mem" + "\n" +
                       "\"--trig help\" for trig operators" + "\n" +
                       "\"--log help\" for log operators" + "\n" +
                       "<*><*><*><*><*><*><*><*><*><*><*><*>";
            //   return help;
           case "--operator help":
             //  String oppHelp =
               return
                       "<*><*><*><*><*><*><*><*><*><*><*><*>" + "\n" +
                       "operator symbols are as follows: " + "\n" +
                       "\"+ or - or / or *\"  for basic  " + "\n" +
                       "arithmetic" + "\n" +
                       "\"!\" for factorial " + "\n" +
                       "\"inv\" for inverse " + "\n" +
                       "\"sqrt\" for square root " + "\n" +
                       "\"sqr\" for square " + "\n" +
                       "\"[+] or [-]\" for positive or minus" + "\n" +
                       "\"^\" for power " + "\n" +
                       "\"exp\" for exponential " + "\n" +
                       "<*><*><*><*><*><*><*><*><*><*><*><*>";
              // return oppHelp;
           case "--memory help":
             //  String memHelp =
               return
                       "<*><*><*><*><*><*><*><*><*><*><*><*>" + "\n" +
                       "memory operations are as follows: " + "\n" +
                       "\"MC\"  clear memory  " + "\n" +
                       "\"M+\" store value to memory " + "\n" +
                        "\"MRC\" recall stored value " + "\n" +
                        "<*><*><*><*><*><*><*><*><*><*><*><*>";
              // return memHelp;
           case "--trig help":
             //  String trigHelp =
               return
                       "<*><*><*><*><*><*><*><*><*><*><*><*>" + "\n" +
                       "\"sin or cos or tan or invsin\"  " + "\n" +
                       "\"or invtan or invcos\" for trig " + "\n" +
                       "<*><*><*><*><*><*><*><*><*><*><*><*>";
              // return trigHelp;
           case "--log help":
            //   String logHelp =
               return
                       "<*><*><*><*><*><*><*><*><*><*><*><*>" + "\n" +
                       "\"log or nlog or -log or -nlog\" " + "\n" +
                       "for logarithmic functions" + "\n" +
                       "<*><*><*><*><*><*><*><*><*><*><*><*>";
               //return logHelp;
           default:
               System.out.println("does not recognise");
               return "try again";

       }

   }
}
