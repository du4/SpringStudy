package by.du4.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        IdmMusic idmMusic = context.getBean("idmMusic", IdmMusic.class);
        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println( idmMusic.getSong() );
        System.out.println( rockMusic.getSong() );
        System.out.println( classicalMusic.getSong() );
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//
//        musicPlayer2.setVolume(333);
//        musicPlayer1.playMusic();
//
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);

        context.close();
    }
}
