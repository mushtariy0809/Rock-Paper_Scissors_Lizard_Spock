public abstract class Choice {
    final String NO = "lose";
    final String TIE = "tie";
    final String YES = "win";

    abstract public String beats(Choice other);
    abstract public String isBeatenByRock();
    abstract public String isBeatenByPaper();
    abstract public String isBeatenByScissors();
    abstract public String isBeatenByLizard();
    abstract public String isBeatenBySpock();

    // insert more abstract methods as needed
}
