package ie.tudublin;

import processing.core.PApplet;


public class bar  {
  
  public void settings (){
    float x;        
    float y;
    float barW;
    float barH;
    float random;
    float time;
    float bMax;
    float bMin;
 
 
 int change = 0;
  }
  
  public bar(float x , float y , float barW , float barH){
    
    this.x = x;
    this.y = y;
    this.barW = barW;
    this.barH = barH;
    this.time = 60;
    this.bMax = barH - 50;
    this.bMin = 0;
    this.change = 1;
  }
  
}