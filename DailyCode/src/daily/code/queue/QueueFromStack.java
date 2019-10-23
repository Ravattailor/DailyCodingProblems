package daily.code.queue;

import java.util.Stack;

/**
 *Implement the following operations of a queue using stacks.
 *
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * Example:
 *
 * MyQueue queue = new MyQueue();
 *
 * queue.push(1);
 * queue.push(2);
 * queue.peek();  // returns 1
 * queue.pop();   // returns 1
 * queue.empty(); // returns false
 * Notes:
 *
 * You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
 * You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 *
 * Link :- https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class QueueFromStack {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}

class MyQueue<T> {

    Stack<T> stack1;
    Stack<T> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(T data) {
        stack1.push(data);
    }

    /** Removes the element from in front of queue and returns that element. */
    public T pop() {
        if(stack1.isEmpty()){
            throw  new RuntimeException("Queue is Empty");
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        final T pop = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return pop;
    }

    /** Get the front element. */
    public T peek() {
        if(stack1.isEmpty()){
            throw  new RuntimeException("Queue is Empty");
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        final T peek = stack2.peek();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return peek;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */