import processing.core.PApplet;

public class ARC extends PApplet {
  
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
  
 