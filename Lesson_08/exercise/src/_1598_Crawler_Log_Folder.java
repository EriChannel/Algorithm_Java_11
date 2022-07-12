public class _1598_Crawler_Log_Folder {
    public int minOperations(String[] logs) {
        int sum=0;
        for (String i: logs){
            if (i.equals("../")) {
                if (sum>0) sum--;
            }
            else if(!i.equals("./")) sum++;
        }
        return sum;
    }
}
