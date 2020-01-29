import java.util.Scanner;

/**
 * Created by MM on 9/27/2019.
 */
public class Salary {

    public int s;
    public int gh;
    public int p;

    public void calculate(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your salary:");
        s = scanner.nextInt();
        System.out.println("enter your ghest:");
       gh = scanner.nextInt();
        p = s - gh;
        System.out.println("your pure salary:"+p);

    }

}
