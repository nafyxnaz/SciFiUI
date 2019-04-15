package ie.tudublin;

import processing.core.PApplet;

public class ARC  {
  
  public void settings (){
  float x;
  float y;
  float radius;
  float start;
  float stop;
  float speed;
  float theta;
  float frequency;
  float s,t;
  float end;
  float rMax;
  float rMin;
  float strokeIntensity;
  
  }
  
  public ARC ( float cx, float cy, float radius, float start, float stop , float frequency){

   this.x = x;
   this.y = y;
   this.radius = radius;
   this.start = start;
   this.stop = stop;
   this.frequency = frequency;
   this.speed = (TWO_PI/ 60.00 ) * frequency;
   this.end = 0;
   this.rMax = radius + 50;
   this.rMin = radius;
   this.strokeIntensity = 3;
  }
}

public void render(){
    strokeWeight(strokeIntensity);
    arc(0, 0, (radius * 2) , (radius * 2), s , t, OPEN);
  }
  
public void mouseClicked(){
    click = true;
  }

 //Makes the arc increase in size when hovered over
  public void hover(){
    if ( mouseX >= (width / 2 - radius) && mouseX <= (width /2 + radius) && mouseY >= height / 2 -  radius && mouseY <= height / 2 + radius && radius < rMax){
       radius++; 
       if(strokeIntensity < 7){
         strokeIntensity++;
         }
    }
    else if (  radius > rMin) {
       radius--; 
       if( strokeIntensity > 3){
         strokeIntensity--;
       }
        
      } 
    }
}
  
 