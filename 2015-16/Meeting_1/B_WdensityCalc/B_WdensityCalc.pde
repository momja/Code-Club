

PImage img;
String text[] = {};

void setup() {
  String finalPicture[] = {};
  size(47,65);
  img = loadImage("max.png");
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
      
      color c = color(0,0,0);
      
      if (r <= 25) {
        text = append(text, " ");
        c = color(25,25,25);
      }
      else if (r <= 50) {
        text = append(text, ".");
        c = color(50,50,50);
      }
      else if (r <= 75) {
        text = append(text, "-");
        c = color(75,75,75);
      }
      else if (r <= 100) {
        text = append(text, "+");
        c = color(100,100,100);
      }
      else if (r <= 125) {
        text = append(text, "?");
        c = color(125,125,125);
      }
      else if ( r <= 150) {
        text = append(text, "@");
        c = color(150,150,150);
      }
      
      else if (r <= 175) {
        text = append(text, "");
        c = color(175,175,175);
      }
      else if (r <= 200) {
        text = append(text, "");
        c = color(200,200,200);
      }
      else if (r <= 225) {
        text = append(text, "");
        c = color(225,225,225);
      }
      else {
        text = append(text, "");
        c = color (250,250,250);
      }
      //if (r > b && r > g) {
      //  text = append(text, "r");
      //}
      //else if (b > g && b > r) {
      //  text = append(text, "b");
      //}
      //else if (g > r && g > b) {
      // text = append(text, "g");
      //}
      //else if (g == r && r == b && g != 255) {
      //  text = append(text, "x");
      //}
      //else {
      //  text = append(text, "W");
      //}
      
      pixels[loc] = c;
    }
  }
  
  updatePixels();
  for (int y = 0; y < img.height - 1; y++) {
      finalPicture = append(finalPicture,
      new String(
      join(subset(text, y*img.width,img.width), " ")));
  }
  print(join(finalPicture, '\n'));
}

void draw() {
  
}