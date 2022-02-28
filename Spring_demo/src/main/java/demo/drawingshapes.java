package demo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.*;
import sun.tools.java.ClassPath;

import java.applet.AppletContext;

public class drawingshapes {
    public static void main(String[] args) {
      ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
     shape s = (shape) factory.getBean("circle");
     s.draw();

    }
}
