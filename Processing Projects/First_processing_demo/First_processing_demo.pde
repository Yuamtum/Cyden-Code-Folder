//Happens once at launch
Ball[] ballGroup;
int pos = 0;



void setup() {
    size(1280, 720);
    background(200,200,200);
    ballGroup = new Ball[1000];
}   

void mousePressed() {
    if(pos < ballGroup.length) {
    ballGroup[pos] = new Ball(mouseX, mouseY, 25);
    pos++; //Next empty position
    }
}


//Happens constantly (screen refresh)
void draw() {
    background(200,200,200);

    for(int i = 0; i < pos; i++) {
        ballGroup[i].display();
        ballGroup[i].move();
    }
}


class Ball {
   int x,y,r;
   int dx,dy; // speed
   int cr, cg, cb; //RBG Values
   int grav; //gravity
   //Constructor 
   Ball(int tempx, int tempy, int tempr) {
    x = tempx; //set the x cord
    y = tempy; // set the y cord
    r = tempr; //set the radius

    //set the color value
    cr = int( random(0,255));
    cg = int( random(0,255));
    cb = int( random(0,255));


    //set the velocity
    dx = int( random(5, 25));
    dy = int( random(5, 25));
    grav = -1;
   } 
   void display() {
    fill(cr, cg, cb);
    circle(x,y,r*2);
   }
   
   void move() {
        y = y + dy;
        x = x + dx;
        dy = dy - grav;


    if(y >= height - r || y <= 0+r) {
        dy = dy*-1;
    
    }

    if(x >= width-r || x <= 0+r ) {
        dx = dx*-1;
    }
   }
}