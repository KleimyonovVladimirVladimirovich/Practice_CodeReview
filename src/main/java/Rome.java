public class Rome {
    public static void main(String[] args) {
        System.out.println(romanToInt("LXV"));
    }

    public static int romanToInt(String s) {
        int sum =0;
        int x,y=0;
        for(int i=0; i<s.length(); i++) {
            switch(s.charAt(i))
            {
                case 'I':
                    x = 1;
                    break;
                case 'V':
                    x = 5;
                    break;
                case 'X':
                    x = 10;
                    break;
                case 'L':
                    x = 50;
                    break;
                case 'C':
                    x = 100;
                    break;
                case 'D':
                    x = 500;
                    break;
                case 'M':
                    x = 1000;
                    break;
                default:
                    return -1;
            }

            if (i<s.length()-1){
                switch(s.charAt(i+1))
                {
                    case 'I':
                        y = 1;
                        break;
                    case 'V':
                        y = 5;
                        break;
                    case 'X':
                        y = 10;
                        break;
                    case 'L':
                        y = 50;
                        break;
                    case 'C':
                        y = 100;
                        break;
                    case 'D':
                        y = 500;
                        break;
                    case 'M':
                        y = 1000;
                        break;
                    default:
                        return -1;
                }
            }

            if(x<y) {
                sum-=x;
            }else{
                sum+=x;
            }

        }
        return sum;
    }
}
