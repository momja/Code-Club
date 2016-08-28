import turtle
from random import randint
from random import choice
t = turtle.Turtle()

#the function polygon_maker takes three parameters
def polygon_maker(sides, position, color):
    randomSides = randint(0,15)
    randomColorList = choice(["blue", "green", "yellow", "red", "orange"])
    t.up()
    t.goto(position)
    t.down()
    t.begin_fill()
    t.fillcolor("yellow")
    t.pencolor(randomColorList)
    t.width(50)
    for i in range(0,randomSides):
        #changes the size of the shape based on the number of sides it has
        t.forward(1000/randomSides)
        #calculates the angle to turn for shapes with different numbers of sides
        t.right(180-(180*(randomSides-2))/randomSides)
    t.end_fill()

polygon_maker(int(raw_input("How many sides: ")), (-100,200), raw_input("Color: "))
