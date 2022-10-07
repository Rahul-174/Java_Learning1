package com.JavaLearning.javaBasics;

public class Java4_Strings {

    //Some commonly used string methods
    /*
       1. str.length()
       2. str.toLowerCase()
       3. str.toUpperCase()
       4. str.trim() -> returns a string after removing all the leading and trailing spaces
       5. str.substring(int start) -> returns substring starting from specified index (index starts from 0)
       6. str.substring(int start, int end) -> returns substring from start to end (START IS INCLUDED END IS EXCLUDED)
       7. str.replace(char1, char2) -> returns a string after replacing char1 with char2
          str.replace(substr1, substr2)

      #8. str.startsWith(string) -> returns Boolean(true/false) whether str starts with given string or not
      #9. str.endsWith(string) -> returns Boolean(true/false) whether str ends with given string or not
      10. str.charAt(index) -> returns character at a given index
      11. srt.indexOf(str) -> returns the starting index of first occurrence of the given substring
                                e.g. => if str= "Rahul" => str.indexOf("hu") ==>2
          str.indexOf(str,index from) -> returns the starting index of first occurrence of the given substring
                                        search will start from given index

      12. srt.lastIndexOf(str) -> returns the last index given substring
                                e.g. => if str= "Rahulabd" => str.lastIndexOf("a") ==>5
         str.lastIindexOf(str,index before) -> returns the last index of the given substring
                                        search will happen till(BEFORE) given index

      13. str.equals(string) -> returns true if given string is equal to str and vice versa
      NOTE : WE SHOULD ALWAYS USE equals() TO CHECK IF TWO STRINGS ARE EQUAL OR NOT instead == OPERATOR

      14. str.equalsIgnoreCase(string) -> returns true if given string is equal to str IGNORING the CASE of characters
    */

    public static void main(String[] args) {
        //String is instantiated as follows :
//        String str=new String("Rahul");

        //String is a class but can be used like a data type as->
        String str="     Rahul Kumar Yadav";
        System.out.println(str);


        //toLoweCase()
        System.out.println("toLowerCase() : "+str.toLowerCase());
        System.out.println("Immutable : "+ str); //Strings are immutable

        //trim()
        System.out.println("Trim() : " +str.trim());

        //substring(int start)
        System.out.println("substring : "+str.substring(9));
        System.out.println("substring : "+str.substring(9,14));

        //replace() ->replacing a with Z
        System.out.println("replace() char : "+str.replace('a','Z'));
        System.out.println("replace() substring: "+str.replace("rahul1","Harry"));


        String str1="Rahul_Yadav";

        //startsWith()  & endsWith()
        System.out.println("\n"+"Starts with 'Rah' ? : "+str1.startsWith("Rah"));
        System.out.println("Ends with 'Rah' ? : "+str1.endsWith("Rah"));


        //charAt(), indexOf()
        System.out.println("charAt() : "+str1.charAt(3));
        System.out.println("indexOf('hu') : "+str1.indexOf("hu"));
        System.out.println("indexOf('a') from index 4 : "+str1.indexOf("a",4));

        String name="Rahulahd";
        System.out.println("last index of 'ah' : "+name.lastIndexOf("ah"));
        System.out.println("last index of 'ah' before 5: "+name.lastIndexOf("ah",4));

    }
}
