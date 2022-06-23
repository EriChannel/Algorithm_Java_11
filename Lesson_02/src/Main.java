public class Main {
    public static void main(String[] args) {
        String s = "Hello123";
        char[] temp = s.toCharArray();

        for(char c : temp){
            System.out.println(Character.toUpperCase(c));
        }

        char c = 'A';
        System.out.println(c + " tương ứng với mã ASCII " + (int)c);


        for(char ch : temp){
            if(Character.isDigit(ch)){
                System.out.println(ch);
            }
        }


        char[] chars = {'1','2','3','4'};

        String rs =new String();

        for(char ch : chars){
            rs += ch;
        }

        System.out.println(rs);

        StringBuilder sb = new StringBuilder();

        for(char ch : chars){
            sb.append(ch);
        }

        System.out.println("Sử dụng StringBuilder: " + sb);

        sb.insert(2, 'x');
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);




    }
}