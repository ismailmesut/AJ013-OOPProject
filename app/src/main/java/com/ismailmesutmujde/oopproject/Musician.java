package com.ismailmesutmujde.oopproject;

public class Musician {

    // Kapsülleme; public, protected, private, default erişim belirleyicileriyle yapılır.
    private String name;
    private String instrument;
    private int age;

    public Musician(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
    }

    // Getter ve Setter Metodlar
    // Kapsülleme ile iç içe olan bir konuda getter ve setter metodlar konusudur. Kapsülleme'de bu metodların da görevi vardır.
    // Erişim belirleyicilerini anlattığımızda private elemanlara, başka bir sınıftan erişemeyeceğimizi söylemiştik. Java'da ve diğer dillerde, bu private elemanlara erişmenin bir
    // yolu vardır. C# dilinde bunlara get-set metodları da denir. Java'da ise bunlar getter ve setter metodlar olarak adlandırılır.
    // Bu metodlar sayesinde private olan üyeler okunabilir ve değerleri değiştirilebilir. Okuyabilmek için getter, yazabilmek içinse setter metodlar kullanılır.
    // Getter metodlar, okuma yaptığı için parametre almazlar. Setter metodlar ise private üyelere değer atadığı için parametre alırlar.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, String password) {
        if (password.matches("Mesut")){
            this.age = age;
        }
    }
}
