import java.util.*;
public class BATSMAN {
    public void bat() {
        System.out.println("I am Batsman");
    }
}

public class BOWLER {
    public void bowl() {
        System.out.println("I am Bowler");
    }
}

public class ALLROUNDER extends BATSMAN, BOWLER {
    public void both() {
        System.out.println("I am Batsman and Bowler");
    }
}