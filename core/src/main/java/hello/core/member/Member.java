package hello.core.member;

public class Member {
    private Long id;
    private String name;
    private Grade grade;

    public Member(Grade grade, String name, Long id) {
        this.grade = grade;
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }
}
