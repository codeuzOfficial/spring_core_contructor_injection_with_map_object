package dasturlash.uz;

import java.util.Map;

public class Question {
    private Integer id;
    private String text;
    private Map<String, Answer> answers;

    public Question(Integer id, String text, Map<String, Answer> answers) {
        this.id = id;
        this.text = text;
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + id + ", text='" + text + '\'' + ", answers=" + answers + '}';
    }
}
