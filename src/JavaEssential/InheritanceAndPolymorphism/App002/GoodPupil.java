package JavaEssential.InheritanceAndPolymorphism.App002;

public class GoodPupil extends Pupil{
    private final String GOOD_PUPIL = this.getClass().getSimpleName();
    @Override
    void study() {
        super.study();
        System.out.println( GOOD_PUPIL + getSTUDYING());
    }

    @Override
    void read() {
        super.read();
        System.out.println( GOOD_PUPIL + getREADING());
    }

    @Override
    void write() {
        super.write();
        System.out.println( GOOD_PUPIL + getWRITING());
    }

    @Override
    void relax() {
        super.relax();
        System.out.println( GOOD_PUPIL + getRELAXING());
    }
    GoodPupil(){
        study();
        read();
        write();
        relax();
    }
}
