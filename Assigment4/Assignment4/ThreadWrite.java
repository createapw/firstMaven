package Assignment4;
import java.io.*;
import java.util.concurrent.ArrayBlockingQueue;

public class ThreadWrite implements Runnable{
    ArrayBlockingQueue<String> q = null;
    public ThreadWrite(ArrayBlockingQueue<String> q) {
        this.q = q;
    }
    @Override
    public void run() {
        FileWriter w = null;
        try{
            w = new FileWriter("/Users/Sean/Downloads/Assignment4/input.txt");
            while(true){
                String buffer = q.take();
                if(buffer.equals("EOF")){
                    break;
                }
                w.write(buffer);
                w.write('\n');
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally{
            try {
                w.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
