import java.util.Scanner;

public class StageFive{

public static void main(String[]args){
Scanner scan = new Scanner(System.in);

int number = scan.nextInt();

for (int i = 1; i < number; i++) {
for (int j = 1; j <= i; j++) {
System.out.print(j);
}
System.out.println();
}
for (int i = number; i > 1; i--) {
for (int j = 1; j < i; j++) {
System.out.print(j);
}
System.out.println();
}
}}
