
package sesion02_mul_a;


public class Cartesiano {
	private float x; 
	private float y;
	
	public Cartesiano (float x, float y) {
		this.x=x; 
		this.y=y; 
	}
	public Cartesiano() {
	
	}
        
	public Cartesiano polar_cartesiano (float radio, float angulo) { //Convierte de polares a cartesianas.
		float x= (float) (radio * Math.cos(angulo)); 
		float y=(float) (radio * Math.sin(angulo)); 
		
		return new Cartesiano(); 
	}
        
        public Cartesiano polar_cartesiano (Polar p) {
            return new Cartesiano();
        }
       
        
        public Polar cartesiano_polar(float x, float y){
            float radio = (float) Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
            float angulo = (float) Math.atan(y/x);
            return new Polar(radio, angulo);
        }
        
        public Polar cartesiano_polar (Cartesiano c) {
            return new Polar();
        }
        
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	} 
	
	

}
