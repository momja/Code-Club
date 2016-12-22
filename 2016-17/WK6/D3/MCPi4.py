from mcpi.minecraft import Minecraft
from mcpi import block
from gpiozero import Button
from signal import pause

mc = minecraft.create()

# Create three variables, with the coordinates of the player's location
x, y, z = mc.player.getPos()

button = Button(24)

button.when_pressed = makeCube()

pause()

def makeCube():
    mc.setBlocks(x+1, y+1, z+1, x+11, y+11, z+11, block.STONE.id)
