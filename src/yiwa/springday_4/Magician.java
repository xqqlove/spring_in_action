package yiwa.springday_4;

public class Magician implements MindReader {
    private String thoughts;
    @Override
    public void interceptionThoughts(String thoughts) {
        System.out.println("Intercepting volunteer`s thounghts;");
        this.thoughts=thoughts;
        System.out.println(thoughts);
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
