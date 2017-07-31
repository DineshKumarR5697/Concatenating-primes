import java.util.Scanner;
class Concatenating_primes {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Integer n = inp.nextInt();
        if(n<3){
            System.out.println("0");
            System.exit(0);
        }
        int flag = -1;
        int len;
        int count=0,count2=0;
        String primes[] = {"2", "3", "5", "7", "11", "13", "17", "19", "23", "29", "31", "37", "41", "43", "47", "53", "59", "61", "67"};

        for(int i=0;i<primes.length;++i){
            if(n>=Integer.parseInt(primes[i]))
                flag=i;
            else if(n<Integer.parseInt(primes[i]))
                break;
        }
//        System.out.println(primes[flag]+" "+flag);
        len = (flag+1)*(flag+1);
        String arr[]= new String[len];
        for(int i=0;i<=flag;++i){
            for(int j=0;j<=flag;++j) {
                arr[count2] = primes[i] + primes[j];
                //System.out.print(arr[count2]+" ");
                count2++;
            }
            //System.out.println();
            //System.out.print("jj"+arr[i]);
        }
//        for(int i=0;i<arr.length;++i){
//            System.out.print(arr[i]+" ");
//        }
        //       System.out.println(arr.length+"lenth"+arr[14]);
        int lol=Integer.parseInt(arr[arr.length - 1]);
        boolean prime[] = new boolean[lol+1];
//        System.out.println(prime.length);
        for(int p = 2; p*p <=lol; p++)
        {
            if(prime[p] == false)
            {
                for(int i = p*2; i <= lol; i += p)
                    prime[i] = true;
            }
        }

//        for(int i = 2; i <prime.length; i++)
//        {
//            if(prime[i] == false){
//                System.out.print(i + " ");
//
//            }
//        }
//        System.out.println("prime");
//        for(int i=0;i<arr.length;++i)
//            System.out.print(arr[i]+" ");
        for(int i=0;i<arr.length;++i)
            for(int j=2;j<prime.length;++j) {
                if (prime[j] == false) {
                    if (Integer.parseInt(arr[i])==j) {
                       // System.out.print(arr[i] + " ");
                        count++;
                    }
                }
            }
        System.out.println(count);
    }
}
