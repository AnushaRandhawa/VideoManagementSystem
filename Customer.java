public class Customer {

    String name;
    int id;
    List<Video> rentedvids = new List();
    List <Video> allvids = new List();


    public Customer(int id, String name, List<Video> rentedvids) {
        this.id = id;
        this.name = name;
        if (rentedvids != null)
        this.rentedvids = rentedvids;
    }

    public String toString() {
        return "Customer ID: " + id + ", Name: " + name;
    }

    //Method to return a String having details of Rented Videos of the Customer
    public String rentedtoString() {
        String x = "";
        Node curr = rentedvids.head;
        if (curr == null) {
            return "No videos rented right now";
        }
        while (curr != null) {
            x = x + curr.data.toString() + " | ";
            curr = curr.next;
        }
        return "Rented Videos: " + x;
    }

    public String alltoString() {
        String x = "";
        Node curr = allvids.head;
        if (curr == null) {
            return "No videos rented ever";
        }
        while (curr != null) {
            x = x + curr.data.toString() + " | ";
            curr = curr.next;
        }
        return "Rented Videos: " + x;
    }


    // add, update, and delete methods for the Rented Videos linkedlist of a customer
    public void add(Video v) {
        rentedvids.add(v);
        allvids.add(v);

    }
    public void delete(Video v) {
        rentedvids.remove(v);

    }




}
