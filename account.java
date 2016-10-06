// Sybil Snow
// {snowEmoji}
// might wanna delete some of this 
import java.text.NumberFormat;
import java.util.Scanner;

public class account {

public account() {
intro();
}

public static void main(String[] args) {
// make them objects GURRRRRRL mmm
new account();
}

private void computeCharges(Double bal, Double chgs) {
String pattern = "#,###.##;(#,###.##)";
NumberFormat nf = NumberFormat.getCurrencyInstance();
double interest = 0.0;

System.out.println();
printHeader();
System.out.println("Previous balance: " +
nf.format(bal));
System.out.println("Service Charges: " +
nf.format(chgs));
if (bal > 0) {
interest = .02 * bal;
System.out.println("Interest @ 2%: " +
nf.format(interest));
System.out.println();
bal += interest;

}
bal += chgs;
double minPay = bal;
if (bal >= 50.0 && bal <= 300.0) {
minPay = 50.0;
} else if (bal > 300.0) {
minPay = bal * .20;
}
System.out.println("New Balance: " +
nf.format(bal));
System.out.println("Minimum Payment: " +
nf.format(minPay));
System.out.println(
"------------------------" );
}
private void intro() {
Scanner sc = new Scanner(System.in);
do {
printHeader();
mess("Enter the previous balance");
double balance = loopInput(sc);
mess("Enter any additional charges");
double charges = loopInput(sc);

computeCharges(balance, charges);

mess("Do another? [y/n]");
} while (!sc.nextLine().equalsIgnoreCase("n"));
System.out.println("fine, whatever bye");
}

private Double loopInput(Scanner sc) {
String sNum;

do {
sNum = sc.nextLine();
} while (!validate(sNum));

return Double.parseDouble(sNum);

}
// validation because having a robust program is like essential amirite 
private boolean validate(String value) {
try {
Double.parseDouble(value);
return true;
} catch (Exception e) {
mess("-----------------\n");
mess("Please enter a valid amount");
return false;
}

}

private void mess(String s) {
System.out.printf("%s ==>", s);
}

private void printHeader() {
String head =
"CS CARD International Statement\n";
head += "===============================\n";
System.out.println(head);
}
} 
