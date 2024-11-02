# Stack-Operations
The stack implementation in Python utilizes a simple class-based structure that adheres to the Last-In-First-Out (LIFO) principle, where the most recently added item is the first to be removed. This stack is represented by a list, allowing efficient addition and removal of elements from the top of the stack.

### Class and Initialization
The `Stack` class begins with an initializer method, `__init__`, which sets up an empty list, `self.stack`. This list represents the stack where items will be added or removed. The initializer ensures that each instance of `Stack` starts with a clean slate, free of any elements.

### Push Operation
The `push` method adds an element to the stack by appending it to the end of `self.stack`. Appending to a list in Python is an O(1) operation, making it efficient for this purpose. The method accepts a single parameter, `item`, which is the element to be pushed onto the stack. After appending, a message is printed to confirm the successful addition of the item.

### Pop Operation
The `pop` method handles the removal of the top element from the stack. Before attempting to remove an item, it checks if the stack is empty using the `is_empty` helper method. If the stack is not empty, it removes the last item in `self.stack` and returns it, providing a way for external code to access the removed element. If the stack is empty, it displays an error message to indicate that there are no items to pop, returning `None` to handle the edge case gracefully.

### Peek Operation
The `peek` method allows users to view the top element without modifying the stack. Similar to `pop`, it first checks if the stack is empty. If not, it returns the last element of `self.stack`. If the stack is empty, it prints a message indicating that there are no items to peek at.

### is_empty Helper Method
The `is_empty` method checks if the stack contains any items by evaluating the length of `self.stack`. This method returns a Boolean value, where `True` indicates an empty stack, and `False` indicates otherwise.

Overall, this stack implementation provides a simple, efficient way to perform core stack operations with a clear output for each action, enhancing usability and error handling.
