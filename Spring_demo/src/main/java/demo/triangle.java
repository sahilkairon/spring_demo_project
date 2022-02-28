package demo;
public class triangle implements  shape {

    private point pointa;
    private point pointb;
    private point pointc;

    public point getPointa() {
        return pointa;
    }

    public void setPointa(point pointa) {
        this.pointa = pointa;
    }

    public point getPointb() {
        return pointb;
    }

    public void setPointb(point pointb) {
        this.pointb = pointb;
    }

    public point getPointc() {
        return pointc;
    }

    public void setPointc(point pointc) {
        this.pointc = pointc;
    }

    public void draw(){
        System.out.println(pointa.getX() +"ok" + pointb.getX());
    }

}
