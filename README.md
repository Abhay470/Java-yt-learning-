day 1 = (file name = FIRSTCODE01)

just first code + get to know about installation of java ,so i already did also intro of static functions ( 1 hour code + practice completed)

day 2 = (FILENAMEEXAMPLE02)

get to know more about static function
<!-- static function = static functions are functions that calls directly using class name 
+
it is used for common work anyting common like (example every student has different roll no , marks but school is common hence we can make school static ) -->
non static functions=
it is also known ( as instance member function,non static or object member function(different same but same work)  )
<!-- we can use non static functions by creating a object -->
classes are blueprints and objects are instance real object of class 

day 3 = (OBJECT3)

TOPIC NAME = PRIVATE INSTANCE MEMBER CLASS SND OBJECTS WITH PROGRAM

if function is static we dont have to create  an object, we can call it with class name but if we are creating function of it that also fine there is no as such restriction 
QUESTION = how we can acess private static  member variable without creating an object?
ans= we can acess private static member variable iwth the help of static function or we can say we can make function static 
<!-- rule =  for better case make  only main as public class not all  -->
<!-- rule = we can make class inside class that is called inner class and we can make that class as public or protected unless we cant make any class public or protected  -->
<!-- rule = our main function is also static as in compiler (in internal code ) main function is also called using class name like object3.main() [object3 is our class name and main is our function we are calling] -->

 day 4 = (wrap5.java)

 wrapper classis used to make java as 100% oop language [ as java is almost 100% language mot complete ]
   USECASE = suppose we are creating memory or data without creating an object like int x=5;
   hence we can say it is not 100% oop as for this we are not making object we uses datatype there 
<!-- functions in wrapper  class  -->
 case 1: * parse int function = converting anything into int datatype like ( string, float,char all datatypes into int )
         * also it is  static as it already calls earlier 
         case 2: valueof function =  * converting any data into object type of data 
                                     * it is also static like 
                                     * example = Integer x1 = Integer.valueOf("123"); in wrap5.java file 
                                            case 3: int value function = * IMPORTANT POINT[ IT COMBINES WITH VALUE OF]
                                                                         * it create reference variable for that object and that we assign in further variable for calling it .
                                                                         * it is not static 
                                                                         example = int y =   x1.intValue();
                                                                                   System.out.println(y);