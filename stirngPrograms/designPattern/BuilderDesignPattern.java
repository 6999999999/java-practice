package stirngPrograms.designPattern;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Employee employee = new Employee.Builder().setId(1).build();
        System.out.println(employee);

        Student student = new Student.Builder().setName("ravindra").build();
        System.out.println(student);
    }
}

class Employee {
    public String name;
    public int id;
    public double salary;

    private Employee(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.salary = builder.salary;
    }

    public static class Builder {
        private String name;
        private int id;
        private double salary;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Student {
    private final String name;
    private final int rollNo;
    private final double marks;

    public Student(Builder builder) {
        this.name = builder.name;
        this.rollNo = builder.rollNo;
        this.marks = builder.marks;

    }


    public static class Builder {
        private String name;
        private int rollNo;
        private double marks;

        public Builder setMarks(double marks) {
            this.marks = marks;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}