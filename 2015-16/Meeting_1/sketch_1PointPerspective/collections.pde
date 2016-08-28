class Bed {
  Bed(int size, int locX, int locY, float depth, float length) {
    Box bedpostConnector = new Box(size*4/5, size/10, locX - size/10, locY - size/2, depth, depth + length/8, true);
    Box bedpost1 = new Box(size/10, size*4/5, locX, locY, depth, depth + length/8, true);
    Box bedpost2 = new Box(size/10, size*4/5, locX - size + size/10, locY, depth, depth + length/8, true);
    Box bed = new Box(size, size/5, locX, locY - size/5, depth, length + depth, true);
    Box bedpost3 = new Box(size/10, size*3/5, locX, locY, depth + length*7/8, length + depth, true);
    Box bedpost4 = new Box(size/10, size*3/5, locX - size + size/10, locY, depth + length*7/8, length + depth, true);
  }
}

class Chair {
  Chair(int size, int locX, int locY, float depth, float length) {
    Box leg1 = new Box(size/5, size*3, locX, locY + size, depth, length + depth, true);
    Box seat = new Box(size, size/5, locX, locY, depth, length + depth, true);
    Box leg2 = new Box(size/5, size, locX - size + size/5, locY + size, depth, depth + length/5, true);
    Box leg3 = new Box(size/5, size, locX - size + size/5, locY + size, depth + length*4/5, length + depth, true);
  }
}

class RoomA {
  RoomA(int location) {
    Box wallsR1 = new Box(300, 300, location, location, 0.5, 1.0, false);
    Box painting = new Box(70, 50, location - 50, location - 140, 0.5, 0.5, false);
    Box window = new Box(0, 100, location, location - 150, 0.7, 0.8, false);
    Box nightstand = new Box(50, 70, location - 100 + 20, location, 0.51, 0.525, true);
    Bed bedR1 = new Bed(150, location - 145, location, 0.52, 0.1);
    Chair chair = new Chair(50, location - 10, location - 50, 0.725, 0.05);
  }
  
}
