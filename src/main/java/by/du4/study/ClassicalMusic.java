package by.du4.study;

public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    @Override
    public String getSong() {
        return "Hungarian rhapsody.";
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
}
