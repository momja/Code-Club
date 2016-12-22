from mcpi.minecraft import Minecraft

mc = minecraft.create()

# Create three variables, with the coordinates of the player's location
x, y, z = mc.player.getPos()

# Move player forward 100 y units
mc.player.setPos(x, y+100, z)
