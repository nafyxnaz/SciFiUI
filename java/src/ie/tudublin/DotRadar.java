public class DotRadar {

  float dx;
  float dy;
  float radius;
  float speed;
  float ex;
  float ey;  
  BeepDot dot;
 
  public void settings() (float dx, float dy, float radius, float speed){   
   
    this.dx = dx;
   this.dy = dy;
   this.radius = radius;
   this.speed = speed;
    
  };
  
  
  public void moveRadar(){
    if ( dx < (width / 2 - radius) ){
      ex = random((width /2 + radius) , width);
      strokeWeight(10);
      line(dx,dy,ex,dy);

      }
    else {
      ex = random(0, width/2);
      strokeWeight(10);
      line(dx,dy,ex,dy);
    }
  }
}