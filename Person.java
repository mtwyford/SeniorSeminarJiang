public class Person {
  private String email;
  private String name;
  private int first;
  private int second;
  private int third;
  private int fourth;
  private int fifth;
  private int classroom;

  public Person(String cemail, String cname, int cfirst, int csecond, int cthird, int cfourth, int cfifth) {
    email = cemail;
    name = cname;
    first = cfirst;
    second = csecond;
    third = cthird;
    fourth = cfourth;
    fifth = cfifth;
    //classroom = cclass;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  public int getFirst() {
    return first;
  }

   public int getSecond() {
    return second;
  }

   public int getThird() {
    return third;
  }

   public int getFourth() {
    return fourth;
  }

   public int getFifth() {
    return fifth;
  }

   public int getClassroom() {
    return classroom;
  }

  public String toString() {
    return email + " " + name + " " + first + " " + second + " " + third + " " + fourth + " " + fifth + "\n";
  }
}