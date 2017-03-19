/**
 * Created by min on 2017. 3. 19..
 */
public class Tiger extends Animal { // 상속 animal에 있는걸 tiger tiger = new tiger해서 쓸 수 있음
    @Override
    public void eat(){
//        super.eat();
        System.out.println("호랑이가 먹는다");
    }
    // 상속이 overridng  ******   메소드 이름이 같아도 인자 차이나면 된다는게 overloading


}

