package Collection;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
//        System.out.println("main starts");
////        abc3();
//        System.out.println("main ends");


        Stack<String> stack = new Stack<>();
        stack.push("George");
        stack.push("Tim");
        stack.push("Elena");
        System.out.println(stack);

//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }

        System.out.println(stack.peek());
        System.out.println(stack);
    }
//    static void abc1() {
//        System.out.println("anc1 starts");
//        System.out.println("anc1 ends");
//    }
//
//    static void abc2() {
//        System.out.println("anc2 starts");
//        abc1();
//        System.out.println("anc2 ends");
//    }
//
//    static void abc3() {
//        System.out.println("anc3 starts");
//        abc2();
//        System.out.println("anc3 ends");
//    }
}
