from mcpi.minecraft import Minecraft

mc = minecraft.create()

# Create three variables, with the coordinates of the player's location
x, y, z = mc.player.getPos()

# Create a block and place it right in front of the player
mc.setBlock(x + 1, y, z, 1)
