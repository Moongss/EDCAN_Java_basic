/**
 * Created by min on 2017. 3. 19..
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.setAge(11);

        System.out.println(animal1.getAge());
        System.out.println(animal2.getAge());

        animal2.setAge(12);

        System.out.println(animal1.getAge());
        System.out.println(animal2.getAge());
    }
}
