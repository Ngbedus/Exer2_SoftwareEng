public class Person implements Comparable<Person>{
     public String name;
     public String surname;

     public Person(String name,String surname) {
         this.name = name;
         this.surname = surname;
     }

     public void print() {
         System.out.println(this.name + " " + this.surname);
     }

    @Override
    public int compareTo(Person other) {

        int cmp = this.surname.compareTo(other.surname);
        if (cmp == 0) {
            cmp = this.name.compareTo(other.name);
        }
        return cmp;
    }

    public String toString() {
        return this.name + " " + this.surname;
    }
}
