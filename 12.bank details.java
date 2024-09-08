import java.util.Scanner;

class Bank {
    float getROI() {
        return 0;
    }
}

class SBI extends Bank {
    float getROI() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getROI() {
        return 7.8f;
    }
}

class AXIS extends Bank {
    float getROI() {
        return 9.0f;
    }
}

public class ak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the bank name (SBI, ICICI, AXIS): ");
        String bankName = sc.nextLine();
        
        Bank b;
        
        switch (bankName.toUpperCase()) {
            case "SBI":
                b = new SBI();
                break;
            case "ICICI":
                b = new ICICI();
                break;
            case "AXIS":
                b = new AXIS();
                break;
            default:
                System.out.println("Invalid bank name.");
                return;
        }
        
        System.out.println("Rate of Interest: " + b.getROI() + "%");
        
        sc.close();
    }
}
