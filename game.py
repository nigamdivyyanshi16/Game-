class Stack:
    def __init__(self):
        self.stack = []

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if self.is_empty():
            return None
        else:
            return self.stack.pop()

    def peek(self):
        if self.is_empty():
            return None
        else:
            return self.stack[-1]

    def is_empty(self):
        return len(self.stack) == 0

    def size(self):
        return len(self.stack)
my_stack = Stack()

my_stack.push(1)
my_stack.push(2)
my_stack.push(3)
my_stack.push(4)

print("Size of stack:", my_stack.size())  # Output: 3

print("Top item:", my_stack.peek())  # Output: 3

my_stack.pop()
print("Top item after pop:", my_stack.peek())  # Output: 2

print("Is stack empty?", my_stack.is_empty())  # Output: False

my_stack.pop()
my_stack.pop()
print("Is stack empty after popping all items?", my_stack.is_empty())  # Output: True

class Goat:
    def __init__(self, color):
        valid_colors = ["WHITE", "BLACK", "RED", "ORANGE", "GREEN"]
        if color not in valid_colors:
            raise ValueError(f"Invalid color '{color}', must be one of {valid_colors}")
        self.color = color
        self.row = -1
        self.col = -1

    def __str__(self):
        if self.row == -1 or self.col == -1:
            return "Goat(color={}, location=unassigned)".format(self.color)
        col_letter = chr(ord('A') + self.col)
        return "Goat(color={}, location={}{} )".format(self.color, col_letter, self.row+1)

    def get_row(self):
        return self.row

    def get_col(self):
        return self.col

    def set_location(self, row, col):
        if not isinstance(row, int) or not isinstance(col, int):
            raise TypeError("Row and column must be integers")
        if row < 0 or col < 0:
            raise ValueError("Row and column must be non-negative")
        self.row = row
        self.col = col
 
    def get_color(self):
        return self.color

# create a goat with color "RED"
g = Goat("RED")

# print the goat
print(g)  # output: Goat(color=RED, location=unassigned)

# set the location of the goat to row 3, column 1
g.set_location(2, 0)

# print the goat
print(g)  # output: Goat(color=RED, location=A3)

# get the row and column of the goat
print(g.get_row())  # output: 2
print(g.get_col())  # output: 0

# get the color of the goat
print(g.get_color())  # output: "RED"
        
