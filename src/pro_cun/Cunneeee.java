package pro_cun;


public class Cunneeee implements Runnable {
    private ShareRecrouce recrouce;

    public Cunneeee (ShareRecrouce recrouce){
        this.recrouce = recrouce;
    }
    @Override
    public void run() {
        for (int i=0;i<50;i++){
            recrouce.pull();
        }
    }
}
