public class Woman extends Person {
    public Woman(String firstName, String lastName, int age) {
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
        return getAge() >= 60;
    }

    @Override
    public void registerPartnership() {
        if (getPartner() != null) {
            setLastName(getPartner().getLastName());
        }
    }

    @Override
    public void deregisterPartnership(boolean revertLastName) {
        if (getPartner() != null) {
            if (revertLastName) {
                setLastName(getPartner().getFirstName());
            } else {
                setPartner(null);
            }
        }
    }
}
