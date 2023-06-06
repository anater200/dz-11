public class Man extends Person {
    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public void setAge(int age) {
        super.setAge(age);
    }

    public int getAge() {
        return super.getAge();
    }
    @Override
    public boolean isRetired() {
        return getAge() >= 65;
    }
}
