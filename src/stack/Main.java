package stack;

public class Main {
    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.push(15);
        nums.push(2);
        nums.push(8);
        System.out.println(nums.peek());
        nums.push(10);
        System.out.println(nums.pop());
        System.out.println("Size is: "+nums.size());
        System.out.println("Empty: "+nums.isEmpty());
        nums.show();

    }
}
