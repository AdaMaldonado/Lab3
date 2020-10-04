package reportlab3;

//I made the node extend the class so I can print out the output into the text file.
public class Artist extends ReportLab3{

    private String name;
    private int appearance;
    public Artist next;

    //Contructor for creating a new node.
    public Artist(String name, int appearance) {
        this.name = name;
        this.appearance = appearance;
    }

    //Displays the artist's information.
    public void displayArtist() {
        ps.printf("%-30s %5s%n", name, appearance);
    }
}
