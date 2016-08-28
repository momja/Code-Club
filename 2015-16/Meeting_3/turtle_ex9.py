import turtle

t = turtle.Turtle()

def spiral():
    for i in range(200):
        t.forward(i)
        t.left(20)

spiral()
