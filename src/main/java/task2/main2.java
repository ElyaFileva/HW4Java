package task2;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;


public class main2 {
    public static void main(String[] args) {
        String s1 = "()";
        Deque<Character> deque = new LinkedList<>();
        System.out.println("isValid(s1, deque) = " + isValid(s1, deque));
    }

    public static boolean isValid(String s1, Deque deque) {
        HashSet<Character> chr = new HashSet<>();
        chr.add('(');
        chr.add('{');
        chr.add('[');
        System.out.println("chr = " + chr);
        for (char ch : s1.toCharArray()) {
            if (chr.contains(ch)) {
                deque.addFirst(ch);
            } else {
                if (!deque.isEmpty()
                        && ((deque.peekFirst() == '(' && ch == ')')
                        || ((deque.peekFirst() == '{') && ch == '}')
                        || ((deque.peekFirst() == '[') && ch == ']'))) {
                    deque.removeFirst();
                } else {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
