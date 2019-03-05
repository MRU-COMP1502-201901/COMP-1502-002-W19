# Assignment 2 - Refactoring a Hockey Time Keeper's Database

Please keep the [due dates](duedates.md) in mind.

We will be continuing to develop your application that works as a hockey Time Keeper's database. For this second phase we will be refactoring your code to better fulfill the principles of encapsulation and make use of inheritance/polymorphism. 

**Refactoring** is the process of restructuring existing computer code. In particular, we will be taking our File input, File output, and our table String creation code and removing it from the Player/PlayerList classes and moving it into dedicated helper classes with public-static functions that the Main menu can use to load/save and create a table by giving or getting back the PlayerList.

For **Inheritance/Polymorphism** we will be adding a secondary type of hockey player, a goalie, who shares some similar state(data) and behaviour(methods) with our current skater players. However, this new type of hockey player has their own unique statistics (both counted and calculated). (We will also use polymorphism on order to manage our Tables created by the TableFactorr)

Again we will provide you with starter files. The **Main.java** file that is already designed to take in menu choices, but has unfilled dummy functions, that you need to complete. It will be your job to complete the changes requested in this assignment and complete these dummy functions again. In the first phase this menu allowed for you to:

* load a list of players to a file
* save a list of players to a file

1. add a new player
1. list the players' roster information
1. list the players' stats
1. record a player's shot
1. record a goal with one or two assists
1. record a power play goal with one or two assists. 

We will be adding/changing:
* adding a player will be changed to allow for both goalies and skaters to be added
* list the players' stats will be split into two options, one to list goalie stats, and one to list skater stats
1. record a shot on a goalie
1. record a goal on a goalie
1. record a game played by a goalie with a number of minutes played
1. record a shutout in a game played by a goalie with a a number of minutes played

[This file](assignment2_demo.md) is a demonstration of the function of the program.

You will be given dummy classes of **Player**, **Goalie**, **Skater**, **PlayerList**, **TeamReader**, **TeamWriter**, and **TableFactory** (**Table**, **RosterTable**, **SkaterStatTable**, and **GoalieStatTable** are used by **TableFactory**). In some cases you will be able to just copy your code from your existing **Player**/**PlayerList** classes into these classes, however in other cases you will have to make important design decisions and changes that move functionality from these two classes out into the proper new classes. This moving process may require you to redesign your code. A completed **Position** enum class is also provided if you want to use it.

Some of this explanation will be a bit repetitive to phase one, but it is repeated to be clear about what existed with Skaters and what is **new** with the addition of Goalies.

### Player/Skater/Goalie

Strings are again sufficient to store demographic info for the assignment, but the use of the **Position** enum for the position is likely to be quite helpful. Note, there is a function where you can ask the enum(position) if it is a goalie position or not.

A **Skater** has the unique stats you should have already dealt with in assignment 1. 
A **Skater** has 
* name, 
* date of birth, 
* home town, 
* weight, 
* height, 
* number,
* position (left wing (LW), right wing (RW), centre (C), or defence (D))
* goals,
* assists,
* power play goals,
* power play points,
* shots,
* points (goals + assists),
* power play points (power play goals + power play assists),
* and shooting percentage (goals / shots).

Note, that power play goals were a subset of regular goals. That is the sum of the stored power play goals amount and the un-stored non-power play goals amount is equal to the stored goals amount. This relationship is the same for assists.

A **Goalie** has
* name, 
* date of birth, 
* home town, 
* weight, 
* height, 
* number,
* position (**goalie (G)**),
* shots against,
* goals against,
* shutouts,
* minutes played,
* goals against average (GAA) (goals against * 60 minutes / minutes played),
* and save percentage (SV%) 1 - (goals against / shots against).

Notice that some of these values can be stored, while others should be derived. **You are responsible for determining which is which and providing algorithms to determine each.**

There is an obvious opportunity to reduce code re-use here. It is your job to use inheritance and the **Player** class to reduce this code re-use. You should be able to see that some of your assignment 1 code can be re-used verbatim but possibly in different locations and you are free to do this.

Your **Player** class should remain abstract (as given in the starter code) but we will expect you to have 1 constructor:
* This constructor should setup the common information shared by its child sub-classes.

Your **Goalie**/**Skater** classes should each have two constructors:
* One that makes use of the **Player** constructor to create a new player with no stats for when a player is added. Your inherited super class constructor may be of help here.
* A second that can be used to create a new player with both demographic information and existing stats.

**No longer should the Player/Goalie/Skater class need to know about how to split a string or parse a file. All File I/O will be moved out of Player class to the TeamReader class which will pass already parsed data into one of these constructors as required.**

### PlayerList

The Player list should not need any new functionality. The PlayerList will still wrap an ArrayList class. You need to be able to be able to add a player, get a list of stored players, and get a player by their number (it might help to be able to get a skater or a goalie as well now). **However, a PlayerList will no longer be responsible for load/saving to a file, and no longer responsible for reporting a table of stats. These functions will be moved into the helper classes of TeamReader, TeamWriter and TableFactory**.

We will again provide an example player [file](inferno.team). This file is the same as that of assignment 1, however every previous Skater now has **$,** in front of their entry. We have added entries for goaltenders which all begin with **@,**
You can use these headers to make easier decisions when parsing the file. However, if you want you can rely on the position stored later on in the entry in the file.

* The data is comma separated, with one field for each data item. You can drop of the front of each line with line = line.substring(2) to drop this header info.

   * The format for the file for Skaters is
      * $,
      * Name,
      * Position,
      * Jersey Number,
      * Date of Birth,
      * Home Town,
      * Height,
      * Goals,
      * Assists,
      * Power Play Goals,
      * Power Play Assists,
      * Shots

   * The format for the file for Goalies is
      * @,
      * Name,
      * Position,
      * Jersey Number,
      * Date of Birth,
      * Home Town,
      * Height,
      * Shots Against,
      * Goals Against,
      * Shutouts,
      * Minutes
      
   * You are welcome to use this file format, or to adapt your own if you would like to record the information differently. 

### Main (user interface)

In the interface class (**Main**) has already been described and should be familiar to assignment 1. The key changes is instead of relying on **PlayerList** to handle I/O and table duties these should be accomplished by interactions with **TeamReader**/**TeamWriter** and **TableFactory**.

### TableFactory/Table

TableFactory should have a helper (public-static) methods that allows for the user to pass in a **PlayerList** and get back a String for
* A roster information list of all players
* A list of all skaters and their stats
* A list of all goalies and their stats
**This class is actually complete.** You will note that each method returns **Table** classes (**the abstract Table class is also complete**) Your job is to complete the 3 classes that extend the **Table** class. These three classes (**RosterTable**, **SkaterStatTable**, **GoalieStatTable**) will each need their own version of the Table constructor as well as to complete their parents abstract **createTableString()** method.

### TeamReader

Should have a helper (public-static) method that allows for the user to pass in a File and get back a **PlayerList** loaded from that file. 

### TeamWriter

Should have a helper (public-static) method that allows for the user to pass in a File and a **PlayerList** and the **PlayerList** will be written to the file.

Note, that **TeamReader** and **TeamWriter** should share an I/O format such that the **TeamReader** can read the file written by the **TeamWriter**.

## The Assignment

The assignment is due in three parts. In the first part you will fill take the information above and produce a design document for the program, in the second part you will write the tests necessary to ensure that your program is working correctly, and in the third part you will build the program.

### The Design Document (52 marks total)

Your design document needs to come in two parts, 
**1) The Public Interface** for the **Player/Skater/Goalie/PlayerList/TeamWriter/TeamReader/TableFactory/Table/RosterTable/SkaterStatTable/GoalieStatTable** classes and the 
**2) Implementation Details** for those classes.

For the public interface, for each class, you must describe provide a description including, what information the class is encapsulating, what the function of the class is, how the class interacts with other classes and what assumptions you've made regarding the design of the class. This description will be rather short for your three helper classes. **In particular, your choices for inheritance structure between classes and choices of encapsulation should be discussed.**

You also need to list the methods you will include in your classes. 

For each method you must list:
1. a one sentence purpose describing what the method does, 
1. an in-depth description of the method including the use of the method, any relevant algorithms or mathematics, any limitations of the method or assumptions about how the method will be able to work with other parts of your program,
1. a list of the method's arguments with a description of what each argument means,
1. and a description of what the method returns.

Your public interface descriptions should be written in plain English and should allow a reader to quickly understand the purpose and use of each class and method. 

For the implementation details, for each class, you should describe what information will make up the state of an object (the instance variables **and types**) and how that information will be used. For each method you should include any information you need to about implementing the method. Again you should write your details in plain English, being as specific as possible. Someone reading your document should be able to understand enough to implement the whole class or any particular method.

Your design document should be your guide testing and building your system. We expect that as you work you will build your system to reflect what you proposed in your design. However it is often the case that when working on tests or development, you will discover something you did not consider when during design. In these cases you are welcome to update your design document, along with a not regarding why you decided to make the change.

The Design Document will be marked with the following rubric:

**The Public Interface**

 * **The Player/Skater/Goalie Classes**
    * The Class Descriptions
       * 4 marks - Provides a description of each class, detailed description of the encapsulated information, detailed description of the role of the class and its interaction, and the assumptions made regarding the design of the class.
       * 3 marks - Provides a description of each class, detailed description of the encapsulated information, detailed description of the role of the class and its interaction, and the assumptions made regarding the design of the class, but one of these topics is omitted.
       * 2 marks - Provides a description of each class, detailed description of the encapsulated information, detailed description of the role of the class and its interaction, and the assumptions made regarding the design of the class, but several of these topics are omitted, or discussed only in low detail.
       * 1 marks - Provides a description of each class, with only limited description of the encapsulated information, detailed description of the role of the class and its interaction, or the assumptions made regarding the design of the class.
       * 0 marks - No attempt to describe the classes.
    * The Method Descriptions
       * 10 marks - Provides detailed information for each method, including purpose, description with assumptions, arguments, and return values. If methods are left out, this grade will be lowered by the same percentage.
       * 8 marks - Provides detailed information for each method, including purpose, description with assumptions, arguments, and return values, but is missing information from 1 or 2 methods.
       * 6 marks - Provides detailed information for each method, including purpose, description with assumptions, arguments, and return values, but is missing information from all methods.
       * 4 marks - Provides some information regarding each method.
       * 2 marks - Provides a list of all methods.
       * 0 marks - No attempt to describe the methods of the classes.
    * The Implementation Details
       * 8 marks - Provides a full description of the internal state of each class and for all methods there is a plan for implementation or an algorithm provided.
       * 6 marks - Provides a full description of the internal state of each class and for all methods there is a plan for implementation or an algorithm provided, but is missing 1 or 2 elements.
       * 4 marks - Provides a full description of the internal state of each class or provides a plan for implementation for each method, but is missing one or the other.
       * 2 marks - Provides a limited description of the internal state, but no description of implementation of the methods.
       * 0 marks - No attempt to describe the implementation.


 * **The PlayerList/TeamReader/TeamWriter/RosterTable/SkaterStatTable/GoalieStatTable Classes**
    * The Class Descriptions
       * 4 marks - Provides a description of each class, detailed description of the encapsulated information, detailed description of the role of the class and its interaction, and the assumptions made regarding the design of the class.
       * 3 marks - Provides a description of each class, detailed description of the encapsulated information, detailed description of the role of the class and its interaction, and the assumptions made regarding the design of the class, but one of these topics is omitted.
       * 2 marks - Provides a description of each class, detailed description of the encapsulated information, detailed description of the role of the class and its interaction, and the assumptions made regarding the design of the class, but several of these topics are omitted, or discussed only in low detail.
       * 1 marks - Provides a description of each class, with only limited description of the encapsulated information, detailed description of the role of the class and its interaction, or the assumptions made regarding the design of the class.
       * 0 marks - No attempt to describe the classes.
    * The Method Descriptions
       * 10 marks - Provides detailed information for each method, including purpose, description with assumptions, arguments, and return values. If methods are left out, this grade will be lowered by the same percentage.
       * 8 marks - Provides detailed information for each method, including purpose, description with assumptions, arguments, and return values, but is missing information from 1 or 2 methods.
       * 6 marks - Provides detailed information for each method, including purpose, description with assumptions, arguments, and return values, but is missing information from all methods.
       * 4 marks - Provides some information regarding each method.
       * 2 marks - Provides a list of all methods.
       * 0 marks - No attempt to describe the methods of the classes.
    * The Implementation Details
       * 8 marks - Provides a full description of the internal state of each class and for all methods there is a plan for implementation or an algorithm provided.
       * 6 marks - Provides a full description of the internal state of each class and for all methods there is a plan for implementation or an algorithm provided, but is missing 1 or 2 elements.
       * 4 marks - Provides a full description of the internal state of each class or provides a plan for implementation for each method, but is missing one or the other.
       * 2 marks - Provides a limited description of the internal state, but no description of implementation of the methods.
       * 0 marks - No attempt to describe the implementation.

 * **The Document**
    * Readability
       * 4 marks - The Design Document is written in clear, easy to read text, with very few grammatical errors.
       * 3 marks - The Design Document is written in clear, easy to read text, with several grammatical errors or other problems that limit readability.
       * 2 marks - The Design Document is not written in clear, easy to read text, but is sufficiently readable that it can be understood.
       * 1 mark - The Design Document is hard to read.
       * 0 marks - The Design Document is impossible to read.
    * Use of Style
       * 4 marks - The Design Document is presented in a clear style using GitHub markdown, that makes it easy to read and understand
       * 3 marks - The Design Document makes good use of markdown with only a few style issues.
       * 2 marks - The Design Document makes some use of markdown,
       * 1 mark - The Design Document doesn't make use of markdown, is presented in plain text or using some other style system.
       * 0 marks - The Design Document was not submitted.

### The Unit Tests (44 marks total)

You must also test your program to ensure that it works. In later assignments you will be responsible for developing and implementing a full test plan. For this assignment you need to implement the following tests.

* **PlayerList Class**
   * Adding a Player to the PlayerList
      * Test adding a new Goalie. After adding you should be able to get the Goalie back using the goalie's number.
      * Test adding a new Skater. After adding you should be able to get the Skater back using the skater's number.
* **Player/Goalie/Skater Classes**
   * Constructors
      * Test each of the four constructors by creating a new Skater/Goalie and getting values back from each getter method.
   * Goalie -> GAA
      * Test recording a goal against. When a goal is recorded, the GAA should go up.
   * Goalie -> SV%
      * Test recording a shot against. When a shot is recorded, the SV% should go up, but not greater than 1.
      * Test recording a goal against. When a goal is recorded, the SV% should go down, but not less than 0.
   * Recording Skater Stats
      * Test recording a goal with 2 assists. After, you should see that the scoring player has an extra goal, point and shot. The assisting players should have an extra assist and point.      
   * Recording a Goalie Stats
      * Test recording a shot against a goalie.
      * Test recording a goal against a goalie.
      * Test recording a non-shutout with minutes played for a goalie.
      * Test recording a shutout with minutes played for a goalie.      
      
The Tests will be marked with the following rubric:

* **Testing Rubric**
   * For each of the 11 tests outlined above there will be up to 4 marks given.
      * 4 marks - Test exhibits correct setup, execution and assertion phases and correctly tests the intended behaviour.
      * 3 marks - Test is mostly correctly set up, but is missing an element or does not test behaviour correctly.
      * 2 marks - Test is missing significant functionality.
      * 1 marks - Limited implementation of test.
      * 0 marks - No implementation of test.

### The System (40 marks total)

The final step of implementation will be to complete your system (notice that we design, then test, then build). You will implement the system to produce the functionality above using the design you developed in the first phase.

The system will be marked according to the following rubric:

* **System Functionality**
   * Main
      * 8 marks - Able to Load and Save a Player List, able to add a Goalie/Skater. For Skaters: able to record, shots, goals (with assists) and power play goals (with assists). For Goalies: able to record, shots against, goals against, a game with minutes played, and a shutout with minutes played. Also able to list player roster, goalie stats, and skater stats. (Deductions possible for problems with functionality.)
      * 6 marks - Missing one / two functions from the above.
      * 4 marks - Has at least two functions of the above.
      * 2 marks - Has one function, but missing most.
      * 0 marks - No menu functionality added.
   * PlayerList/TeamReader/TeamWriter/RosterTable/SkaterStatTable/GoalieStatTable
      * 8 marks - Loading from a file in the correct file, saving to a file in the correct place, creating formatted table version of PlayerList in the correct place, and that PlayerList still has the functionality need to add and get players for the menu.
      * 6 marks - Missing one function from the above.
      * 4 marks - Has at least two of the functions above
      * 2 marks - Has one function of the above.
      * 0 marks - No PlayerList/TeamReader/TeamWriter/RosterTable/SkaterStatTable/GoalieStatTable functionality added.
   * Player/Skater/Goalie
      * 8 marks - Has the five constructors necessary. Has the needed modifiers to change the stats required (other setters are unnecessary). Has the required getters. Instance variables are private. Able to calculate points, power play points, shooting percentage, GAA, and SV%. Able to record shots, assists, goals, power play goals, power play assists, goals against, shots against, shutouts, and minutes played.
      * 6 marks - Missing one / two function from the above.
      * 4 marks - Has at least two of the functions above
      * 2 marks - Has one function of the above.
      * 0 marks - No Player/Skater/Goalie functionality added.      

* **System Construction**
   * Design
      * 4 marks - Code follows provided design document with very minor differences.
      * 3 marks - Code follows provided design document with 1 or 2 notable differences.
      * 2 marks - Code mostly follows provided design document with several notable differences.
      * 1 mark - Code deviates significantly from design document.
      * 0 marks - Design Document or Code not submitted.
   * Encapsulation
      * 4 marks - Functionality and data are will divided between the classes. (Player duties correctly in Player/Skater/Goalie and I/O table creation duties in TeamReader/TeamWriter/RosterTable/SkaterStatTable/GoalieStatTable)
      * 3 marks - One or two instances of functionality or data in the wrong class.
      * 2 marks - Functionality consistently  in the wrong class, to much state exposed to other classes.
      * 1 mark - Functionality inconsistently  assigned to classes.
      * 0 marks - No functionality assigned to any class.
   * Coding Style
      * 4 marks - Code follows Java standard style, members (methods and instance variables) are well named, code is styled consistently  and is easy to read, with only minor issues.
      * 3 marks - Code generally follows the above, but has one or two notable style issues.
      * 2 marks - Code has several issues in style.
      * 1 mark - Code is difficult to read and generally does not follow good style.
      * 0 marks - Code has no style.
   * Git Usage
      * 4 marks - Each commit of code is small and logically consistent. 
      * 3 marks - Commits are larger or have several different changes grouped together.
      * 2 marks - Commits are large and occasional with many different changes grouped together.
      * 1 mark - One or two commits for the whole assignment.
      * 0 marks - Git was not used.
     
For all rubrics we may make minor adjustments to the grades awarded depending on the situation.
