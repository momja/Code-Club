

PImage img;
String text[] = {};

void setup() {
  String finalPicture[] = {};
  size(530,380);
  img = loadImage("mallard_duck.jpeg");
  img.loadPixels();
  loadPixels();
  for (int y = 0; y < img.height; y++) {
    for (int x = 0; x < img.width; x++) {
      int loc = x + y*img.width;
      float r,g,b;
      r = red (img.pixels[loc]);
      g = green (img.pixels[loc]);
      b = blue (img.pixels[loc]);
      r = constrain(r, 0, 255);
      g = constrain(g, 0, 255);
      b = constrain(b, 0, 255);
      color c = color(r, g, b);
      pixels[loc] = c;
      
      /*if (r <= 100) {
        text = append(text, "x");
      }
      else if (r <= 200) {
        text = append(text, "o");
      }
      else if (r <= 300) {
        text = append(text, "n");
      }
      else if (r <= 100) {
        text = append(text, '3');

      }
      else if (r <= 125) {
        text = append(text, '4');

      }
      else if (r <= 150) {
        text = append(text, '5');

      }
      else if (r <= 175) {
        text = append(text, '6');

      }
      else if (r <= 200) {
        text = append(text, '7');

      }
      else if (r <= 225) {
        text = append(text, '8');

      }
      else {
        text = append(text, '9');

      }*/
      if (r > b && r > g) {
        text = append(text, "r");
      }
      else if (b > g && b > r) {
        text = append(text, "b");
      }
      else if (g > r && g > b) {
       text = append(text, "g");
      }
      else if (g == r && r == b && g != 255) {
        text = append(text, "x");
      }
      else {
        text = append(text, "W");
      }
    }
  }
  
  updatePixels();
  for (int y = 0; y < img.height - 1; y++) {
      finalPicture = append(finalPicture,
      new String(
      join(subset(text, y*img.width,img.width), "")));
  }
  print(join(finalPicture, '\n'));
}

void draw() {
  
}
