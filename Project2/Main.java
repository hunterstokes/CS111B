package Project2;

class Main {

  /**
   * Below are 10 static methods, similar to the main method
   *
   * In each one you have a few variables initialized with data.
   *
   * Your goal is to write if statements that will print out
   * the correct phrases based on the values in these variables.
   * 
   * Start by clicking the green "Run" button above to see how
   * many of the exercises are already done. A red circle (🔴)
   * means there is still work to do.
   * 
   * After you click run, start with Exercise 1 below
   */

  /**
   * Exercise 1: Is it hot?
   */
  public static void exercise_1_Is_It_Hot_Outside() {
    // Here is a variable named "temperature".
    int temperature = projectData.nextInt();

    // Fix the if-else below so that it prints "Hot" if
    // temperature is >= 90, and "Cool" if it is less than 90.

    // Click the "Run" button when it is fixed

    if (temperature >= 90) { // This line needs some work
      System.out.println("Hot");
    } else {
      System.out.println("Cool");
    }
  }

  /**
   * Exercise 2: Kim?
   * 
   * In this exercise there is a String varaible "name".
   * If the value in name is "Kim" then print "Hi Kim"
   * If it is not then print "This is not Kim"
   * 
   * Try using the String method "equals", and the operator ==
   * to see which one works
   */
  public static void exercise_2_Is_This_Kim() {
    // The following line supresses detailed output about why this
    // exercise if failing. You should comment this line out when
    // you start working on the exercise
    // System.out.println("Suppress detailed output for this exercise ");

    // Initialize the name variable
    String name = projectData.nextLine();

    if (name == "Kim") { // this line needs some work
      System.out.println("Hi Kim");
    } else {
      System.out.println("This is not Kim");
    }
  }

  /**
   * Exercise 3: Value is in range 1 to 10
   * 
   * This exercise has a single int variable named "value"
   *
   * If value is between 1 and 10 (inclusive) print "In"
   * Otherwise print "Out"
   */
  public static void exercise_3_ValueIsInRange1To10() {
    // Comment out the line below when you are working on this exercise
    // System.out.println("Suppress detailed output for this exercise ");

    // Get the data
    int value = projectData.nextInt();

    // If the value is between 1 and 10 (inclusive!) print "in"
    // Otherwise print "out"

    if ((value >= 1) || (value <= 10)) { // This line needs some work
      System.out.println("In");
    } else {
      System.out.println("Out");
    }
  }

  /**
   * Exercise 4: Three values over 10
   * 
   * In this exercise you have three int values: x1, x2, and x3
   *
   * if all three values are greater than 10 print "Yes"
   * otherwise print "No"
   */
  public static void exercise_4_Three_Values_Over_10() {
    // Comment out the line below when you are working on this exercise
    // System.out.println("Suppress detailed output for this exercise ");

    // Get the data
    int x1 = projectData.nextInt();
    int x2 = projectData.nextInt();
    int x3 = projectData.nextInt();

    // These lines could use some work. Feel free to use additional
    // else-if blocks, or anything else you need
    if ((x1 > 10) && (x2 > 10) && (x3 > 10)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  /**
   * Exercise 5: Three values over 10
   * 
   * This has the same variables: x1, x2, x3
   * In this case if any one of the three values is greater
   * than 10 print "Yes", otherwise print "No"
   */
  public static void exercise_5_One_Value_Over_10() {
    // Comment out the line below when you are working on this exercise
    // System.out.println("Suppress detailed output for this exercise ");

    // Get the data
    int x1 = projectData.nextInt();
    int x2 = projectData.nextInt();
    int x3 = projectData.nextInt();

    // These lines could use some work. Feel free to use additional
    // else-if blocks, or anything else you need
    if ((x1 > 10) || (x2 > 10) || (x3 > 10)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

  /**
   * Exercise 6: Keep going
   *
   * This logic might belong in a smart car. It has two variables
   * - int milesTraveled represents the total miles since recharging
   * - boolean stopImmediately stores either true of false
   *
   * If stopImmediately is true or milesTravled is greater than 300
   * print "Stop". Otherwise print "Keep Going"
   *
   * See if you can do this with a single if statement to practice
   * combining a boolean variable and a numeric comparison in a single
   * boolean expression.
   **/
  public static void exercise_6_Should_Keep_Going() {
    // Comment out the line below when you are working on this exercise
    // System.out.println("Suppress detailed output for this exercise ");

    // Get the data
    int milesTraveled = projectData.nextInt();
    boolean stopImmediately = projectData.nextBoolean();

    if ((milesTraveled > 300) || (stopImmediately)) { // This line needs some work
      System.out.println("Stop");
    } else {
      System.out.println("Keep Going");
    }
  }

  /**
   * Exercise 7: How is the weather?
   *
   * decide where or not you should play outside based on
   * three variables: temperature, inchesOfRain, isWindy
   * 
   * if there is more than 0.05 inches of rain print "Stay Inside"
   * 
   * Otherwise if the temperature is less than 50 and it is windy
   * print "Stay Inside"
   *
   * Otherwise print "Go Outside"
   */
  public static void exercise_7_Weather() {
    // Comment out this line
    // System.out.println("Suppress detailed output for this exercise ");

    // Get the data
    double temperature = projectData.nextDouble();
    double inchesOfRain = projectData.nextDouble();
    boolean isWindy = projectData.nextBoolean();

    // These lines could use some work. Feel free to use additional
    // else-if blocks, or anything else you need
    if ((inchesOfRain >= 0.05) || ((temperature < 50) && (isWindy))) {
      System.out.println("Stay Inside");
    } else {
      System.out.println("Go Outside");
    }
  }

  /**
   * Exercise 8: The answer is yes
   * 
   * In this exercise the input is a single string. 
   * 
   * Print "yes" if the string is "Yes", "yes", "Y", or "y"
   *
   * Otherwise print "no"
   */
  public static void exercise_Yes_8_() {
    // Comment out this line
    // System.out.println("Suppress detailed output for this exercise ");

    // Get the data
    String response = projectData.nextLine();

    if ((response.equals("Yes")) || (response.equals("yes")) || (response.equals("Y")) || (response.equals("Y"))) { // this line needs some work
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }

  /**             \
   * Exercise 9: Comparing Doubles
   *
   * There is an odd trick that is required when you are
   * comparing two double values to see if they are equal. 
   *
   * Instead of comparing them with the == operator you 
   * should compare the absolute value of their difference
   * to a very small value (often called "delta")
   * If the difference is smaller than that delta then we 
   * consider the values to be equal.      
   * 
   * In this exercise if the difference between d1 and d2
   * is less than delta then print "equal". Other wise print  
   * "different".   
   *
   * Use Math.abs() to get the absolute value of the difference
   */
  public static void exercise_Comparing_Doubles_9_() {
    // Comment out this line
    System.out.println("Suppress detailed output for this exercise ");

    // Get the data
    double d1 = projectData.nextDouble();
    double d2 = projectData.nextDouble();
    double delta = 0.00001;

    if (d1 == d2) { // this line needs some work
      System.out.println("equal");
    } else {
      System.out.println("different");
    }
  }

  /***
   * Finally, check an input string to see if it contains the substring    
   * "all" and "done". 
   *
   * We say a string contains a substring if the substring can be found
   * inside the string. So "ell" is a substring of "hello"
   *
   * You can test to see if a string contains a substring using the .  
   * followed by the contains method: 
   *
   *    response.contains("ello")
   *
   * That line will return "true" if response contains "ello" and 
   * otherwise it will return false.
   *
   ***/
  
  public static void exercise_10_All_Done() {
    // Comment out this line
    // System.out.println("Suppress detailed output for this exercise ");

    // Get the data
    String response = projectData.nextLine();

    // Print all done if response contains "all" and "done"
    // Use an && operator to check
    
    if ((response.contains("all")) || (response.contains("done"))) { // This line needs some work
      System.out.println("We are all done");
    } else {
      System.out.println("There is still work to do");
    }
  }

  public static ProjectData projectData;
}
