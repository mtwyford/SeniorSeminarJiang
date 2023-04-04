import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;

//replit not reading file
public class Seminar{
  
  int time = 8;
  ArrayList<Person> peopleList = new ArrayList<Person>();
  String[][] chart = new String[6][6];
  String[][] room1 = new String[5][17];
  
  for (int j = 0; j < 5; j++) {
    room1[j][0] = time;
    time++;
  } //close for

  //print out arraylist of all seniors, email, 5 choices
  public void printA() {
    System.out.print(peopleList);
  } //close print

  //adds email, senors name, 5 seminar choices into peopleList array from student.txt
  public void load() { 
   try {
      File myObj = new File("students.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] arr = data.split(",");  //  ["12", "last", "first", "12"]
                      //Integer.parseInt(arr[0])
        //parse data into varibales, pass to person constructor
         //email, String name, int first, int second, third, fourth, fifth
        Person p1 = new Person(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6])); //each person become array
        //System.out.println(p1.toString() + "      " + p1.getfName() + p1.getlName());
        //System.out.println(p1);
        peopleList.add(p1);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } //cloe cathch 
  } //close load

  public void schedule() {
    for (int i = 1; i < 16; i++) {
      for (Person person : peopleList) {
        if (person.getFirst() == 1) {
          room1[0][i] = person.getName();
        } //clos if
      } //close for each 
    } //close for
    System.out.print(room1);
  } //close scheduke

}
  