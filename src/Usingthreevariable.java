public class Usingthreevariable {
    public static void sort012(int a[],int n){
        int zero=0,one=0,two=0;
        for(int i=0;i<n;i++) {
            if (a[i] == 0) {
                zero++;
            } else if (a[i] == 1) {
                one++;
            } else {
                two++;
            }
        }
        int index=0;
        for(int i=1;i<=zero;i++){
            a[index]=0;
            index++;
        }
        for(int i=1;i<=one;i++){
            a[index]=1;
            index++;
        }
        for(int i=1;i<=two;i++){
            a[index]=2;
            index++;
        }

    }
}
