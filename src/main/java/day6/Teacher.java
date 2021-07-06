package day6;

public class Teacher {
    private String name; // имя
    private String subject; // предмет

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }


    // оценить студента
    public void evaluate(Student student) {
        int random_number = 2 + (int) (Math.random() * 4);

        String bewertung = "Оценка"; // оценка
        switch(random_number) {
            case 2:
                bewertung = "неудовлетворительно";
                break;
            case 3:
                bewertung = "удовлетворительно";
                break;
            case 4:
                bewertung = "хорошо";
                break;
            case 5:
                bewertung = "Отлично";
                break;
            default:
                bewertung  = "(ОШИБКА random_number)";
                break;
        }

        System.out.println("Преподаватель " + getName() + " оценил(а) студента с именем " + student.getName() + " по предмету " +
                            getSubject() + " на оценку " + bewertung);
    }
}
