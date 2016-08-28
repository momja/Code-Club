import turtle

t = turtle.Turtle()

def square(color, size):
    t.color(color)
    t.forward(size)
    t.right(90)
    t.forward(size)
    t.right(90)
    t.forward(size)
    t.right(90)
    t.forward(size)

color = raw_input("What color would you like this square to be?")
size = int(raw_input("How big would you like your square"))
square(color, size)

print("Done drawing")
