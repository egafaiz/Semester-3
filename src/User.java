public class User {
    private String name;
    private int age;
    private Address address;

    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Refactor 1: Encapsulate Fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Refactor 2: Extract Method
    public String createGreetingMessage() {
        return "Hello, my name is " + name + " and I live at " + address.getStreet();
    }

    // Refactor 3: Rename Method
    public String getUserDetails() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address.getStreet();
    }

    // Refactor 5: Inline Variable
    public static void main(String[] args) {
        User user = new User("John", 30, new Address("123 Street"));
        System.out.println(user.getUserDetails());
        System.out.println(user.createGreetingMessage());
    }
}
