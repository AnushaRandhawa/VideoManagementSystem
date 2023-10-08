public class Main {
    public static void main(String[] args) {

        VideoManager vm = new VideoManager();

        Video a = new Video(1,"Hunger Games" , 0, "Available");
        Video b = new Video(2,"MazeRunner" , 0, "Available");
        Video c = new Video(3,"Spiderman" , 0, "Available");
        Video d = new Video(4,"Fast and Furious" , 0, "Available");
        Video e = new Video(5,"Jurassic World" , 0, "Available");

        Customer f = new Customer(11, "Andy" , null);
        Customer g = new Customer(12, "Ben" , null);
        Customer h = new Customer(13, "Ken" , null);
        Customer i = new Customer(14, "Daniel" , null);
        Customer j = new Customer(15, "Kathy" , null);

        vm.addvideo(a);  vm.addvideo(b);  vm.addvideo(c);  vm.addvideo(d);  vm.addvideo(e);

        //Note: printvideos() prints a List of All Videos in the Store
        //      printAllRented() prints a List of All Videos currently Rented by Each Customer

        vm.printVideos();
        System.out.println();

        vm.addCustomer(f); vm.addCustomer(g);  vm.addCustomer(h);  vm.addCustomer(i);  vm.addCustomer(j);
        vm.printAllRented(); //As no videos rented by any customer yet, printed accordingly
        System.out.println();

        vm.rentvideo(a,f);   //Andy rented video a (id no.1)
        vm.rentvideo(b,j);   //Kathy rented video b (id no.2)
        vm.rentvideo(e,j);   //Kathy rented video e (id no.5)
        System.out.println();

        vm.printVideos();
        System.out.println();

        vm.printAllRented();
        System.out.println();

        vm.rentvideo(a,g);  //Ben trying to rent an unavailable book
        System.out.println();

        vm.returnvideo(a,f);   //Andy returns video id no.1
        vm.returnvideo(b,j);   //Kathy returns video id no.2 , Kathy has one rented video left now (id no.5)
        System.out.println();

        vm.printVideos();
        System.out.println();

        vm.printAllRented();
        System.out.println();

        vm.printdetails(4);      //prints details of video id no.4
        System.out.println();

        System.out.println(vm.isAvailable(5));       //checks if video id no. 5 is available (should print false)
        System.out.println(vm.isAvailable("Jurassic World"));  //checks if "Jurassic World" is available (should print false)
        System.out.println();

        System.out.println(vm.isAvailable(2));           //checks if video id no. 2 is available (should print true)
        System.out.println(vm.isAvailable("MazeRunner"));  ////checks if "MazeRunner" is available (should print true)
        System.out.println();


        System.out.println("Print a report of rented videos of all time");
        vm.printReport();
        System.out.println();

        //Making changes to the list of videos owned by the store
        System.out.println("Making changes to the list of videos owned by the store");
        Video x = new Video(6,"The Lion King" , 0, "Available");
        vm.addvideo(x);   //x added
        vm.printVideos();
        System.out.println();
        vm.removevideo(a);  //a removed from the store  (id no.1 Hunger Games)
        vm.removevideo(c);   // c  removed from the store (id no.3 Spiderman)
        vm.printVideos();
        System.out.println();

        //Making changes to the customer database
        System.out.println("Making changes to customers database");
        Customer y = new Customer(16, "Leo" , null);
        vm.addCustomer(y);
        vm.printAllRented();
        System.out.println();

        vm.deleteCustomer(h);  //Customer Ken with id no.13 deleted
        vm.printAllRented();
        System.out.println();

        vm.updateCustomerID(f,25); //ID number of customer f, (Andy) updated to 25
        vm.printAllRented();
        System.out.println();

        vm.updateCustomerName(g,"Ben10"); //Name of customer g, (id no.12), updated to Ben10
        vm.printAllRented();
        System.out.println();

    }
}