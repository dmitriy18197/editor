# editor app

To run:
- From IDEA, simply run main method

- From console:
 
    mvn compile;  
    mvn exec:java -Dexec.mainClass=com.example.editor.Main;
   
- Then specify path to file you want to edit 


# Supported commands:
 - list - print all lines
 - help
 - save
 - del `n` - delete line at `n` row
 - ins `n` `s` - insert new `s` line at `n` row
 - quit
 