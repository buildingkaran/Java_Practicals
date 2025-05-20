import java.util.Scanner;

class UnderAge extends Exception {
    int age;

    public UnderAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Under Age: " + age;
    }
}

public class UnderAgeDemo {
    public void test(int age) throws UnderAge {
        if (age < 18) {
            throw new UnderAge(age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        UnderAgeDemo obj = new UnderAgeDemo();

        
            Scanner scanner = new Scanner(System.in);
            int age;
            System.out.print("Enter your age: ");
        
                age = scanner.nextInt();
            try {
            obj.test(age);
        } catch (UnderAge e) {
            System.out.println(e);
        }
    }
}