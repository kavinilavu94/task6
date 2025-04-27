package task6;

		public class Person {
		    // 1. Attributes (Private for Encapsulation)
		    private String name;
		    private int age;

		    // 2. Constructor (To initialize the object)
		    public Person(String name, int age) {
		        this.name = name;
		        this.age = age;
		    }

		    // 3. Getter for name
		    public String getName() {
		        return name;
		    }

		    // 4. Getter for age
		    public int getAge() {
		        return age;
		    }

		    // 5. Display method (Optional: Good OOPS practice to have behavior inside class)
		    public void displayInfo() {
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		    }

		    // Main method for testing
		    public static void main(String[] args) {
		        // Create a Person object (Object Creation)
		        Person p1 = new Person("Alice", 22);

		        // Accessing attributes using getter methods
		        System.out.println("Name: " + p1.getName());
		        System.out.println("Age: " + p1.getAge());
	}

		}
