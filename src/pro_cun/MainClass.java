package pro_cun;


public class MainClass {

    public static void main(String [] args) {
        ShareRecrouce recrouce = new ShareRecrouce();
        new Thread(new Produce(recrouce)).start();
        new Thread(new Cunneeee(recrouce)).start();
    }

}
