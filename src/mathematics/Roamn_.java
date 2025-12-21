package mathematics;

public class Roamn_ {
    public static void main(String[] args) {
        String s ="XIV";
        int sum=0;
        for(int i=0; i<s.length(); i++){

            int current = value(s.charAt(i));

            if((s.length()-i) > 1) {
                int next = value(s.charAt(i + 1));
                if(current < next){
                    sum -= current;
                }

                else{
                    sum += current;
                }
            }
            else{
                sum += current;

            }
        }
        System.out.println(sum);

    }

    static int value(char s){
        if(s == 'I') return 1;
        if(s == 'V') return 5;
        if(s == 'X') return 10;
        if(s == 'L') return 50;
        if(s == 'C') return 100;
        if(s == 'D') return 500;
        if(s == 'M') return 1000;
        return -1;
    }
}
