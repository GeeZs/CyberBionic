package JavaEssential.InheritanceAndPolymorphism.App002;

public class BadPupil extends Pupil{
    private final String BAD_PUPIL = this.getClass().getSimpleName();
    @Override
    void study() {
        super.study();
        System.out.println( BAD_PUPIL + getSTUDYING());
    }

    @Override
    void read() {
        super.read();
        System.out.println( BAD_PUPIL + getREADING());
    }

    @Override
    void write() {
        super.write();
        System.out.println( BAD_PUPIL + getWRITING());
    }

    @Override
    void relax() {
        super.relax();
        System.out.println( BAD_PUPIL + getRELAXING());
    }
    BadPupil(){
        study();
        read();
        write();
        relax();
    }
}
