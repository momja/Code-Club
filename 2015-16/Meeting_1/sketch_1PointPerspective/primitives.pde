class Box {
  boolean closed;
  Box(int sizeX, int sizeY, int locX, int locY, float depth, float length, boolean closed) {
    locX = locX - sizeX/2;
    locY = locY - sizeY/2;
    
    if(mouseY + locY - sizeY/2 >= b) {
      if(mouseX + locX - sizeX/2 >= a) {
        mathx(mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 4
        mathy(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, depth, length);  //Wall 3
        mathy(mouseX + sizeX/2 - locX, mouseY - sizeY/2 + locY, mouseX - sizeX/2 - locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 1
        mathx(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX - sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 2
      }
      
      else if(mouseX + locX + sizeX/2 < a ) {
        mathx(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX - sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 2
        mathy(mouseX + sizeX/2 - locX, mouseY - sizeY/2 + locY, mouseX - sizeX/2 - locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 1
        mathy(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, depth, length);  //Wall 3
        mathx(mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 4
      }
      
      else {
        mathx(mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 4
        mathx(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX - sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 2
        mathy(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, depth, length);  //Wall 3
        mathy(mouseX + sizeX/2 - locX, mouseY - sizeY/2 + locY, mouseX - sizeX/2 - locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 1
      }
      
    }
    else if(mouseY + locY + sizeY/2 < b) {
      if(mouseX + locX - sizeX/2 >= a) {
        mathy(mouseX + sizeX/2 - locX, mouseY - sizeY/2 + locY, mouseX - sizeX/2 - locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 1
        mathx(mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 4
        mathx(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX - sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 2
        mathy(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, depth, length);  //Wall 3
      }
      
      else if(mouseX + locX + sizeX/2 < a) {
        mathx(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX - sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 2
        mathy(mouseX + sizeX/2 - locX, mouseY - sizeY/2 + locY, mouseX - sizeX/2 - locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 1
        mathy(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, depth, length);  //Wall 3
        mathx(mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 4
      }
      
      else {
        mathx(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX - sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 2
        mathx(mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 4
        mathy(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, depth, length);  //Wall 3
        mathy(mouseX + sizeX/2 - locX, mouseY - sizeY/2 + locY, mouseX - sizeX/2 - locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 1
      }
    }
    
    else {
      if(mouseX + locX - sizeX/2 >= a) {
        mathy(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, depth, length);  //Wall 3
        mathy(mouseX + sizeX/2 - locX, mouseY - sizeY/2 + locY, mouseX - sizeX/2 - locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 1
        mathx(mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 4
        mathx(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX - sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 2
      }
      
      else if(mouseX + locX + sizeX/2 < a) {
        mathy(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, depth, length);  //Wall 3
        mathy(mouseX + sizeX/2 - locX, mouseY - sizeY/2 + locY, mouseX - sizeX/2 - locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 1
        mathx(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX - sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 2
        mathx(mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 4
      }
      
      else {
        mathx(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX - sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 2
        mathx(mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 + locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 4
        mathy(mouseX - sizeX/2 - locX, mouseY + sizeY/2 + locY, mouseX + sizeX/2 - locX, mouseY + sizeY/2 + locY, depth, length);  //Wall 3
        mathy(mouseX + sizeX/2 - locX, mouseY - sizeY/2 + locY, mouseX - sizeX/2 - locX, mouseY - sizeY/2 + locY, depth, length);  //Wall 1
      }
    }
    
    if(closed == true) {
      rect((mouseX - sizeX/2 - locX - a)*length + a,(mouseY - sizeY/2 + locY - b)*length + b, sizeX*length, sizeY*length);
    }
  } 
  
  void mathx(float c1, float d1, float c2, float d2, float depthProportion, float length) {
    float x1 = (c1 - a)*depthProportion + a;
    float y1 = ((d1-b)/(c1-a))*x1 - ((c1*(d1-b))/(c1-a)-d1);
    float y2 = ((d2-b)/(c1-a))*x1 - ((c1*(d2-b))/(c1-a)-d2);
    if (Float.isNaN(y1) || Float.isNaN(y2)) {
      y1 = (d1 - b)*depthProportion + b;
      y2 = (d2 - b)*depthProportion + b;
    }
      c1 = (c1 - a)*length + a;
      d1 = (d1 - b)*length + b;
      c2 = (c2 - a)*length + a;
      d2 = (d2 - b)*length + b;
      quad(Math.round(c1), Math.round(d1), Math.round(c1), Math.round(d2), Math.round(x1), Math.round(y2), Math.round(x1), Math.round(y1));
  }
  void mathy(float c1, float d1, float c2, float d2, float depthProportion, float length) {
    float y1 = (d1 - b)*depthProportion + b;
    float x1 = (((c1*(d1-b))/(c1-a)-d1) + y1)/((d1-b)/(c1-a));
    float x2 = (((c2*(d1-b))/(c2-a)-d1) + y1)/((d1-b)/(c2-a));
    if (Float.isNaN(x1) || Float.isNaN(x2)) {
          x1 = (c1 - a)*depthProportion + a;
          x2 = (c2 - a)*depthProportion + a;
    }
    c1 = (c1 - a)*length + a;
    d1 = (d1 - b)*length + b;
    c2 = (c2 - a)*length + a;
    d2 = (d2 - b)*length + b;
    quad(Math.round(c2), Math.round(d1), Math.round(c1), Math.round(d1), Math.round(x1), Math.round(y1), Math.round(x2), Math.round(y1));
    
  }
}


class Cylinder {
  Cylinder(int r, float locX, float locY, float depth, float length) {
    mathX(mouseX - r - locX, mouseY + r + locY, mouseX - r + locX, mouseY - r + locY, depth, length, r);
  }
  
  void mathX(float c1, float d1, float c2, float d2, float depthProportion, float length, int r) {
    float x1 = (c1 - a)*depthProportion + a;
    float y1 = ((d1-b)/(c1-a))*x1 - ((c1*(d1-b))/(c1-a)-d1);
    double e1 = ((1/(2*(Math.pow(b,2)-2*b*d1+Math.pow(d1,2))))+(Math.sqrt(Math.pow(c1,2)*Math.pow((2*Math.pow(b,2) - 4*b*d1 + 2*Math.pow(d1,2)),2)-4*(Math.pow(b,2)-2*b*d1+Math.pow(d1,2))*(Math.pow(a,2)*Math.pow(c1,2)-4*a*b*c1*d1+2*a*Math.pow(c1,3)+4*a*c1*Math.pow(d1,2)+Math.pow(b,2)*Math.pow(c1,2)+4*Math.pow(b,2)*Math.pow(d1,2)-Math.pow(b,2)*Math.pow(r,2)-6*b*Math.pow(c1,2)*d1-8*b*Math.pow(d1,3)+2*b*d1*Math.pow(r,2)+Math.pow(c1,4)+5*Math.pow(c1,2)*Math.pow(d1,2)+4*Math.pow(d1,4)-Math.pow(d1,2)*Math.pow(r,2))-c1*(2*Math.pow(b,2)-4*b*d1+2*Math.pow(d1,2)))));
    double f1 = Math.sqrt(Math.pow(r,2) - Math.pow(e1+c1,2) - d1);
    double e2 = ((1/(2*(Math.pow(b,2)-2*b*y1+Math.pow(y1,2))))+(Math.sqrt(Math.pow(x1,2)*Math.pow((2*Math.pow(b,2) - 4*b*y1 + 2*Math.pow(y1,2)),2)-4*(Math.pow(b,2)-2*b*y1+Math.pow(y1,2))*(Math.pow(a,2)*Math.pow(x1,2)-4*a*b*x1*y1+2*a*Math.pow(x1,3)+4*a*x1*Math.pow(y1,2)+Math.pow(b,2)*Math.pow(x1,2)+4*Math.pow(b,2)*Math.pow(y1,2)-Math.pow(b,2)*Math.pow(r,2)-6*b*Math.pow(x1,2)*y1-8*b*Math.pow(y1,3)+2*b*y1*Math.pow(r,2)+Math.pow(x1,4)+5*Math.pow(x1,2)*Math.pow(y1,2)+4*Math.pow(y1,4)-Math.pow(y1,2)*Math.pow(r,2))-x1*(2*Math.pow(b,2)-4*b*y1+2*Math.pow(y1,2)))));
    double f2 = Math.sqrt(Math.pow(r,2) - Math.pow(e2+x1,2) - y1);
    line((float) e1, (float)f1,(float)e2,(float)f2);
    println(e1);
  }
}
