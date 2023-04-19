package dasturlash.uz;

public class Answer {
    private Integer id;
    private String text;

    public Answer(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Answer{" + "id=" + id + ", text='" + text + '\'' + '}';
    }
}
