package ie.tudublin;

import processing.core.PApplet;

public class Dot {
    
  public void settings () {
  float cx;
  float cy;
  float radius = 0;

  
  public Dot (float cx,float cy, float radius){
   this.cx = cx;
   this.cy = cy;
   this.radius = radius;
  }
  } 
  
  
 public void update(){
    
  fill(0);
  ellipse(cx,cy,radius,radius);
  radius++;
    
  }
  
  
}