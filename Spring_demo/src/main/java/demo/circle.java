package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class circle implements  shape {

    private point center;

    public point getCenter() {
        return center;
    }

    @Autowired
    @Qualifier("pointa")
    public void setCenter(point center) {
        this.center = center;
    }
    public void draw(){
        System.out.println(getCenter().getX() + " " + getCenter().getY() );
    }
}
