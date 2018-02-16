package JavaEssential.HomeWork_004_Abstraction.App003;

public class Player implements Recordable, Playable {
    void doAll(){
        play();
        pause();
        record();
        stop();
    }
    @Override
    public void play() {
        System.out.println("Music is playing.");
    }

    @Override
    public void record() {
        System.out.println("Music is recording.");

    }

    @Override
    public void pause() {
        System.out.println("Paused.");
    }

    @Override
    public void stop() {
        System.out.println("Stoped.");
    }
}
