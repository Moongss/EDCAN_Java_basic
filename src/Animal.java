/**
 * Created by min on 2017. 3. 19..
 */
public class Animal implements AnimalInterface{

    private int age; //이 클래스 안쪽에서만 쓸 수 있는것 ->static을 쓰면 공유가됨.

    public Animal() {
        System.out.println("Animal이 생겼어요"); // 생성될때 무조건 한번은 시작이 됨(생성자
    }

    public void eat(){ //public이니까 다른데서도 사용 가능함
        System.out.println("먹는다");
    }
    public void run(){
        System.out.println("달린다");
    }

    public int getAge(){
        return age;
    } //private를 사용하는법

    public void setAge(int age){
        this.age = age;
    }

    abstract void sleep(); // 추상 메소드 상속을 받아야 쓸 수 있다 <--협업
}
