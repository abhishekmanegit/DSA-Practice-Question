class StackArray{
    int top = -1;
    int size = 5;
    int[] stack = new int[size];

    void push(int value){
        if(top == size-1){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = value;
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Popped value: " + stack[top--]);
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i] + " ");
        }
    }

        public static void main(String [] args){
            StackArray s = new StackArray();
            s.push(10);
            s.push(20);
            s.push(30);
            s.pop();
            s.display();
        }
    }
