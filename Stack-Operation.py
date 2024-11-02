class Stack:
    def __init__(self):
        self.stack = []

    def push(self, item):
        self.stack.append(item)
        print(f"Pushed {item} onto the stack.")

    def pop(self):
        if not self.is_empty():
            item = self.stack.pop()
            print(f"Popped {item} from the stack.")
            return item
        else:
            print("Stack is empty. Cannot pop.")
            return None

    def is_empty(self):
        return len(self.stack) == 0

    def peek(self):
        if not self.is_empty():
            print(f"Top item is {self.stack[-1]}")
            return self.stack[-1]
        else:
            print("Stack is empty.")
            return None

# Example Usage
s = Stack()
s.push(10)
s.push(20)
s.push(30)
s.peek()
s.pop()
s.peek()
s.pop()
s.pop()
s.pop()
