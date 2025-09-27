package agh.ii.prinjava.lab02.lst02_04;

enum EnumBasedSingleton {
    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
