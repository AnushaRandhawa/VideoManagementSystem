public class Video {

    int id;
    String name;
    String status;
    int desc;

    public Video(int id, String name, int desc, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.desc = desc;
    }

    public String toString() {
        if (desc != 0)
        return "Video ID: " + id + ", Video Name: " + name +
                ", Description: Rented by Customer id no." + desc + ", Status: " + status;
        else
            return "Video ID: " + id + ", Video Name: " + name + ", Status: " + status;
    }

}
