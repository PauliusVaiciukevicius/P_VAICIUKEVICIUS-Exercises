package lt.techin;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        if (name.isEmpty() || name == null){
            System.out.println("Not correct name ....");
        } else {
            this.name = name;
        }
        setAge(age);
    }
    public void setAge(int age) {
        if (age <=0){
            System.out.println("Not correct age....");
        } else {
            this.age = age;

        }
        }


    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }
    public void eat(){
        System.out.println("Human eats ....");
    }

    @java.lang.Override
    public String toString() {
        return "Human{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Human human = (Human) object;

        if (age != human.age) return false;
        return name.equals(human.name);
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
}

