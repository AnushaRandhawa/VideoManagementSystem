
//IMPORTANT, PLEASE READ
/* Checklist
   Instruction as mentioned in Assignment File | Corresponding name of function in my code
   1. Rent a Video :  rentvideo(Video v, Customer c)
   2. Return a video :  returnvideo(Video v, Customer c)
   3. Create a List of Videos Owned by the Store : Done in the beginning of this class
      Maintained by using
      addvideo(Video v)
      removeVideo(Video v)
   4. Show Details of a Particular Video : printdetails(int x)
   5. Print a List of All Videos in the Store : printvideos()
   6. Check Whether a Particular Video is in the Store :
      isAvailable(String s)
      isAvailable(int i)
   7. Maintain a Customer Database :  3 actions -- add,update,delete
      addCustomer(Customer c)
      updateCustomerID(Customer c, int id)
      updateCustomerName(Customer c, String name)
      deleteCustomer(Customer c)
   8. Print a List of All Videos Rented by Each Customer currently : printAllRented()
      Print a List of All Videos Rented by Each Customer of all time till date : printReport()
    */

public class VideoManager {

    List <Video> videos = new List();
    List <Customer> customers = new List();

    public void rentvideo(Video v, Customer c) {
        if (isAvailable(v.id)) {
            System.out.println("Video is available. Rented!");
            v.status = "Unavailable";
            v.desc = c.id;
            c.add(v);
        }
        else
            System.out.println("Sorry, the requested video is not available at the moment");
    }
    public void returnvideo(Video v, Customer c) {
     //   videos.add(v);
        System.out.println("You have returned the video successfully! Thank you.");
        v.status = "Available";
        v.desc = 0;
        c.delete(v);
    }

    public void addvideo(Video v) {
        videos.add(v);
    }
    public void removevideo(Video v) {
        videos.remove(v);
    }

    // for a particular video, given its id number
    public void printdetails(int x) {
        Node curr = videos.head;
        Video v = null;

        if (videos.head == null) {System.out.println("No videos are there.");
            return; }

        while (curr != null) {
            v = (Video)curr.data;
            if (v.id == x) {
                System.out.println(curr.data.toString());
                return;
            }
            curr = curr.next;
        }
        System.out.println("Not present in the store.");
    }

    //Print a List of All Videos in the Store
    public void printVideos() {
        Node curr = videos.head;
        while (curr != null) {                      //traverses videos linked list
            System.out.println(curr.data.toString());
            curr = curr.next;
        }
    }

    //by name
    public boolean isAvailable(String s) {
        Node curr = videos.head;
        Video v;
        while (curr != null) {
            v = (Video)curr.data;
            if (v.name.equals(s) && v.status.equals("Available")) {
                return true;
                }
                curr = curr.next;
            }

        return false;
        }

        //by id
        public boolean isAvailable(int i) {
        Node curr = videos.head;
        Video v;
        while (curr != null) {
            v = (Video)curr.data;
            if (v.id==i && v.status.equals("Available")) {
                return true;
            }
                curr = curr.next;
            }
            return false;
        }


        // Print a List of All Videos Rented by Each Customer of all time till dat
    public void printReport() {
         System.out.println("Videos rented till date");
         Node curr = customers.head;
         while(curr != null) {                                   //traversing the customers linked list
             System.out.println(((Customer)curr.data).toString());
             if (((Customer) curr.data).allvids != null)
                 System.out.println(((Customer) curr.data).alltoString());
             curr = curr.next;
         }
     }



    //Print a List of All Videos Rented by Each Customer currently
    public void printAllRented() {
        Node curr = customers.head;
        while (curr != null) {                                   //traversing the customers linked list
            System.out.println(((Customer) curr.data).toString());
            if (((Customer) curr.data).rentedvids != null)
                System.out.println(((Customer) curr.data).rentedtoString());
            curr = curr.next;
        }
    }
        public void addCustomer (Customer c){
            customers.add(c);
        }


    public void updateCustomerID(Customer c, int id) {
        Node curr = customers.head;
        while (curr != null) {
            if (((Customer)curr.data).id == c.id) {
                c.id = id;
                return;
            }
            curr = curr.next;
        }
    }
    public void updateCustomerName(Customer c, String name) {
        Node curr = customers.head;
        while (curr != null) {
            if (((Customer)curr.data).name.equals(c.name)) {
                c.name = name;
                return;
            }
            curr = curr.next;
        }
    }
    public void deleteCustomer(Customer c) {
        customers.remove(c);
    }


    }

