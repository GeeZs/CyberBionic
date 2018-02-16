package JavaEssential.HomeWork_003_InheritanceAndPolymorphism.App002;

class Pupil {
    private static final String STUDYING = " is studying.";
    private static final String READING = " is reading.";
    private static final String WRITING = " is writing.";
    private static final String RELAXING = " is relaxing.";

    static String getSTUDYING() {
        return STUDYING;
    }

    static String getREADING() {
        return READING;
    }

    static String getWRITING() {
        return WRITING;
    }

    static String getRELAXING() {
        return RELAXING;
    }

    void study(){};
    void read(){};
    void write(){};
    void relax(){};

}
