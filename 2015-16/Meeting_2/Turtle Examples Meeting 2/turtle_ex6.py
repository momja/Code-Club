from turtle import *
#makes lines 10 pixels thick instead of the default 1
width(10)
for color in ["blue", "green", "red", "orange"]:
    #color will loop through all of the colors in the list
    pencolor(color)
    forward(100)
    right(90)

done()
