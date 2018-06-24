package pro_cun;


public class Produce implements Runnable {
    private ShareRecrouce recrouce;

    public Produce (ShareRecrouce recrouce) {
        this.recrouce = recrouce;
    }
    @Override
    public void run() {
        for (int i=0;i<50;i++) {
            if (i % 2 == 0) {
                recrouce.push("李雷","男");
            }else {
                recrouce.push("韩梅梅","女");
            }
        }
    }
}
