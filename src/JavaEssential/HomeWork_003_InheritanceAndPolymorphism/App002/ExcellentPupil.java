package JavaEssential.HomeWork_003_InheritanceAndPolymorphism.App002;

public class ExcellentPupil extends Pupil{
    private final String EXCELLENT_PUPIL = this.getClass().getSimpleName();
    @Override
    void study() {
        super.study();
        System.out.println( EXCELLENT_PUPIL + getSTUDYING());
    }

    @Override
    void read() {
        super.read();
        System.out.println(EXCELLENT_PUPIL + getREADING());
    }

    @Override
    void write() {
        super.write();
        System.out.println(EXCELLENT_PUPIL + getWRITING());
    }

    @Override
    void relax() {
        super.relax();
        System.out.println(EXCELLENT_PUPIL + getRELAXING());
    }

    ExcellentPupil() {
        study();
        read();
        write();
        relax();
    }
}
