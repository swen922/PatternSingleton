public class King {

    private String name;
    private int number;

    private static King ourKing;

    private King() {
    }

    public static King getKingInstance() {
        if (ourKing == null) {
            ourKing = new King();
            ourKing.setName("Loui");
            ourKing.setNumber(14);
        }
        return ourKing;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }


}
