public class geo {

    public void perimeters(double len , double wid){
        double length = len;
        double width = wid;
        double peri = (2*length) + (2*width);
        System.out.println(peri);


    }

    public void surfacearea(double side){
        double si = side;
        double SA = 6 * (si*si);
        System.out.println(SA);




    }

    public void circlearea(double radius){
        double radi = radius;
        double Are = Math.PI * (radi * radi);
        System.out.println(Are);

    }

}
