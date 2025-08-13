public class Equals {
    public static void main(String[] args) {
        User user1 = new User("Ivan", 19);
        User user2 = new User("Ivan", 19);
        System.out.println(user2.equals(user1));
    }
}

class User{
    private final String name;
    private final int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return age == user.age && name.equals(user.name);
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}