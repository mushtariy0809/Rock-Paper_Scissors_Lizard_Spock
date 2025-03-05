
public class RockPaperScissorsLizardSpock
{
  public static void main(String [] args)
  {
    if (args.length < 2)
    {
      System.out.println("Is two arguments that hard?");
      return;
    }
    else
    {
      RockPaperScissorsLizardSpock game = new RockPaperScissorsLizardSpock();
      game.testAll();
      game.play(args[0], args[1]);
    }
  }

  public void testAll() // test all pairs
  {
    Choice r = new Rock();
    Choice p = new Paper();
    Choice s = new Scissors();
    Choice l = new Lizard();
    Choice sp = new Spock();

    System.out.println(r.beats(r) + " " + r.beats(p) + " " + r.beats(s) 
                       + " " + r.beats(l) + " " + r.beats(sp));
    System.out.println(p.beats(r) + " " + p.beats(p) + " " + p.beats(s) 
                       + " " + p.beats(l) + " " + p.beats(sp));
    System.out.println(s.beats(r) + " " + s.beats(p) + " " + s.beats(s) 
                       + " " + s.beats(l) + " " + s.beats(sp));
    System.out.println(l.beats(r) + " " + l.beats(p) + " " + l.beats(s) 
                       + " " + l.beats(l) + " " + l.beats(sp));
    System.out.println(sp.beats(r) + " " + sp.beats(p) + " " + sp.beats(s) 
                       + " " + sp.beats(l) + " " + sp.beats(sp));
  }

  public void play(String player1Choice, String player2Choice)
  {
    Choice p1 = choiceFactory(player1Choice);
    Choice p2 = choiceFactory(player2Choice);
    if (p1 == null || p2 == null){
      System.out.println("I see spelling is not your strong suit!");
      return;
    }
    else
      System.out.println(player1Choice + " beats "
              + player2Choice + " ... " + p1.beats(p2));
  }

  private Choice choiceFactory(String choice)
  {
    switch(choice)
    {
      case "Rock": return new Rock();
      case "Paper": return new Paper();
      case "Scissors": return new Scissors();
      case "Lizard": return new Lizard();
      case "Spock": return new Spock();
      default: return null;
    }
  }

}
