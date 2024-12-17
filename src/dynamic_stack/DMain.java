package dynamic_stack;

public class DMain {
    public static void main(String[] args) {
        DStack nums = new DStack();
        nums.push(15);
        nums.show();
        nums.push(2);
        nums.show();
        nums.push(8);
        nums.show();
        nums.push(23);
        nums.show();
        nums.push(75);
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
    }
}
