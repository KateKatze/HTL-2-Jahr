package at.htlpinkafeld.intstack;

import java.util.LinkedList;
import java.util.List;

public class IntStack {
        private int size;
        private List<Integer> list;
        public IntStack(int size){
                if(size < 1)
                        size=1;
                this.size = size;
                this.list = new LinkedList<>();
        }
        public IntStack(){
               this(1);
        }
        public int getSize(){
                return this.size;
        }
        public int getEleCnt(){
                return list.size();
        }
        public boolean isFull(){
                return this.list.size() >= this.size;
        }
        public boolean isEmpty(){
                return this.list.isEmpty();
        }
        public void push(int val){
                if(this.isFull())
                        throw new ArrayIndexOutOfBoundsException("Stack is full");
                this.list.add(val);
        }
        public int pop() {
                // get the last element
                // delete this element
                if(this.list.isEmpty()){
                        throw new ArrayIndexOutOfBoundsException();
                }
               return this.list.remove(getEleCnt() - 1);
        }
        public int peek() {
                // get the last element
                // without deleting it
                if(this.list.isEmpty())
                        throw new ArrayIndexOutOfBoundsException();
                return this.list.get(getEleCnt()- 1);
        }
        public boolean resize(int size){
                //changes the stack size as long as no element is lost,
                //returns true if the operation has been successfully executed
                if (this.list.size() > size || size < 1)
                        throw new IllegalArgumentException();
                this.size = size;
                return true;
        }
        @Override
        public String toString() {
                return this.list.toString();
        }
}
