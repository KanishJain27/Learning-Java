package Recursion;

public class TowerofHanoi {
    public static void towerofhanoi(int n, String source, String helper, String destination){
        if (n==1){
            System.out.println("Transfer disk " + n + " from "+ source +" to "+ destination);
            return;
        }
        towerofhanoi(n-1,source,destination,helper);
        System.out.println("Transfer disk "+ n + " from "+ source+" to "+ destination);
        towerofhanoi(n-1,helper,source,destination);

    }

    public static void main(String[] args){
        int n = 3;
        towerofhanoi(n,"Source","Helper", "Destination" );

    }
}

