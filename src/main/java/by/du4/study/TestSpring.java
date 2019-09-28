package by.du4.study;

import by.du4.study.beans.Computer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.getMusicPlayer().playMusic(MusicStyle.IDM));

        context.close();
    }
}
