package task2;

import java.util.ArrayDeque;
import java.util.Deque;

public class main2 {
    public static void main(String[] args) {
        String s = "({()})";
        System.out.println("isValid(s) = " + isValid(s));
    }

    private static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Deque<Character> deque = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[' || ch == '(' || ch == '{')
                deque.add(ch);
            else {
                if (deque.size() == 0)
                    return false;
                if (ch == ')' && deque.peekLast() == '(') deque.pollLast();
                else if (ch == '}' && deque.peekLast() == '{') deque.pollLast();
                else if (ch == ']' && deque.peekLast() == '[') deque.pollLast();
            }
        }
        return (deque.size() == 0);
    }
}
