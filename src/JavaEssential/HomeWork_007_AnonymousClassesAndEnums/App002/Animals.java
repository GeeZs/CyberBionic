package JavaEssential.HomeWork_007_AnonymousClassesAndEnums.App002;

enum Animals {
    CAT(5),
    DOG(3),
    RAT(1);

    int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                "} " + super.toString();
    }
}
