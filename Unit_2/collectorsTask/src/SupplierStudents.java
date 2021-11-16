import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierStudents implements Supplier<List<Student>> {
    private List<Student> students = Stream.of(
            new Student(18, "����", Faculty.CSIT),
            new Student(18, "����", Faculty.ECONOMICS),
            new Student(18, "����", Faculty.CSIT),
            new Student(18, "����", Faculty.BIOLOGY),
            new Student(19, "����", Faculty.CSIT),
            new Student(19, "����", Faculty.BIOLOGY),
            new Student(19, "����", Faculty.CSIT),
            new Student(20, "�����", Faculty.CSIT),
            new Student(20, "������", Faculty.ECONOMICS),
            new Student(21, "����", Faculty.CSIT),
            new Student(21, "���", Faculty.BIOLOGY)
    ).collect(Collectors.toList());

    @Override
    public List<Student> get() {
        return students;
    }
}
