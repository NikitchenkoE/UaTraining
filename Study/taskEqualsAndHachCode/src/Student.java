import java.util.Objects;

public final class Student {
    private final String name;
    private final Age age;
    private final String group;

    public Student(String name, Age age, String group) {
        this.name = name;
        Age clonedAge = new Age();
        clonedAge.setYear(age.getYear());
        this.age = clonedAge;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        Age conAge = new Age();
        conAge.setYear(this.age.getYear());
        return conAge;
    }

    public String getGroup() {
        return group;
    }

//    @Override
//    public boolean equals (Object o){
//        if (this == o) return true;
//        if (o == null) return false;
//        if (o instanceof Student){
//            Student student = (Student) o;
//            return age==student.age&&name.equals(student.name)&&group.equals(student.group);
//        }else return false;
//    }

//    @Override
//    public int hashCode(){
//        int result = group==null?0:group.hashCode();
//        int result2 = name==null?0:group.hashCode();
//        result=age.getYear()+result+result2*31;
//        return result;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, group);
    }

    public static void main(String[] args) {
        Age age = new Age();
        age.setYear(18);
        Age age1 = new Age();
        age1.setYear(18);
        Student student1 = new Student("Stepan", age, "A1");
        Student student2 = new Student("Stepan", age1, "A1");
        System.out.println(student1.hashCode() + " " + student2.hashCode());
        System.out.println(student1.equals(student2));
    }
}



