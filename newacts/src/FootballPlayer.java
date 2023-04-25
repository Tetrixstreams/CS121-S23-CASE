public class FootballPlayer {
    public int height;
    public int weight;
    public String name;

            public FootballPlayer(double height, double weight, String name) {
                this.height = (int) height;
                this.weight = (int) weight;
                this.name = name;
            }
            public void height(String newHeight) {
                if (height <= 5) {
                    System.out.println("Your too short to be a football player");
                }
            }
}
