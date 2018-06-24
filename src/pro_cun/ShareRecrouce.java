package pro_cun;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShareRecrouce {
    private String name;
    private String sex;
    private boolean flag = true;
    private final Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void push (String name,String sex) {
        lock.lock();
        try {
            while (!flag) {
                condition.await();
            }
            this.name = name;
            Thread.sleep(10);
            this.sex = sex;
            condition.signalAll();
            flag = false;
        }catch (Exception e) {
                e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void pull () {
        lock.lock();
        try {
            while (flag) {
                condition.await();
            }
            Thread.sleep(10);
            System.out.println(name + '-' + sex);
            flag = true;
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
