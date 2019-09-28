package by.du4.study;

public interface Music {

    default int randomNumber(int maxInt) {
        return (int)(Math.random() * maxInt);
    }

    String getSong();

}
