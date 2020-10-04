package reportlab3;

//Linked list of Artist objects.
public class TopStreamingArtists {

    //Private link to the first element.
    private Artist first;

    //Constructor sets first to null.
    public void TopStreamingArtists() {
        first = null;
    }

    //Returns true if list is empty.
    public boolean isEmpty() {
        return (first == null);
    }

    //Accepts new values.
    public void insertFirst(String name, int appearance) {
        //Creates new node.
        Artist a = new Artist(name, appearance);
        //New node's next is original first.
        a.next = first;
        //First points to new node.
        first = a;
    }

    public void displayList() {
        //Current starts from first.
        Artist current = first;
        //Move forward
        while (current != null) {
            //Shows node's information.
            current.displayArtist();
            current = current.next;
        }
    }
}
