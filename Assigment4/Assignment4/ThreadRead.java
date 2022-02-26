package Assignment4;
import java.io.*;
import java.util.concurrent.ArrayBlockingQueue;

public class ThreadRead implements Runnable {
    ArrayBlockingQueue<String> q = null;
    public ThreadRead(ArrayBlockingQueue<String> q) {
        this.q = q;
    }
    private String Cal(String s){
        int res = 0;
        char lc = ' ';
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int n = Character.getNumericValue(c);
                if(lc != ' '){
                    if (lc == '+'){
                        res += n;
                    }
                    if (lc == '-'){
                        res -= n;
                    }
                }
                else{
                    res += n;
                }
            }
            else if (c == '+' && c == '-'){
                lc = c;
            }
        }
        StringBuilder sb = new StringBuilder(s);
        sb.append(' ').append('=').append(' ').append(res);
        return sb.toString();
    }

    @Override
    public void run() {
        BufferedReader r = null;
        try{
            r = new BufferedReader(new FileReader("/Users/Sean/Downloads/Assignment4/assignment4.txt"));
            String buffer = null;
            while((buffer = r.readLine()) != null){
                if(!(buffer.equals(' '))){
                    q.put(Cal(buffer));
                }
                else{
                    q.put(buffer);
                }
            }
            q.put("EOF");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally{
            try {
                r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}