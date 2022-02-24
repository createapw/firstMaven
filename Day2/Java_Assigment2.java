import java.io.File;
import java.util.Scanner;

public class Java_Assigment2 {
    static class Criteria {
        private String path;
        private String extension;
        private boolean includeSubFolder;
        public Criteria (String path, boolean includeSubFolder) {
            this.path = path;
            this.includeSubFolder = includeSubFolder;
        }
        public String getPath() {
            return this.path;
        }
        public boolean getisCountSubFolder() {
            return this.includeSubFolder;
        }
    }
    public static void count(Criteria criteria) {
        File file = new File(criteria.getPath());
        int countDirctory = 0;
        int countFile = 0;
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File fileIndex:files){
                if(fileIndex.isDirectory()){
                    countDirctory++;
                }else {
                    countFile++;
                }
            }
        }
        if (criteria.includeSubFolder) {
            System.out.println("There are " + countFile + " files and " + countFile +"inside folders");
        } else {
            System.out.println("There are " + countFile + " files");
        }
    }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String extension = null;
        System.out.println("Enter your path");
        String path = sc.nextLine();
        File dir = new File(path);
        System.out.println("Do you want count subfolder?");
        String sub = sc.nextLine();
        boolean countSubFolder = false;
        if (sub.equals("y") || sub.equals("yes") || sub.equals("Y") || sub.equals("YES")) {
            countSubFolder = true;
        } else {
            countSubFolder = false;
        }
        try {
            if (path != null && path.length() > 0) {
                Criteria myCriteria = new Criteria(path, countSubFolder);
                count(myCriteria);
            }
        } catch (NullPointerException e) {
            System.out.print("NullPointerException Caught");
        }
    }
}
