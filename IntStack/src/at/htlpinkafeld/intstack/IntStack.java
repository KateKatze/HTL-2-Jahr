package at.htlpinkafeld.intstack;

import java.util.LinkedList;
import java.util.List;

public class IntStack {
        private int size;
        private List<Integer> list;

        public IntStack(){
               this(1);
        }
        public IntStack(int size){
                if(size < 1)
                        size=1;
                this.size = size;
                this.list = new LinkedList<>();
        }
        public int getSize(){
                return this.size;
        }
        public boolean isFull(){
                return this.list.size() >= this.size;
        }
        public void push(int val){
                if(this.isFull())
                        throw new ArrayIndexOutOfBoundsException("Stack is full");
                this.list.add(val);
        }
        public int getEleCnt(){
                return -1;
        }
}
