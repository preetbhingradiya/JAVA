//    *     i=1  2*1-1=1 star
//   ***    i=2  2*2-1=3 star
//  *****   i=3  2*3-1=5 star 
public class diamon_pattern {
    public static void main(String[] args) {        

        // Uperr Half
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int p = 1; p <= 2*i-1; p++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <=5-i; j++) {
                System.out.print(" ");
            }

            for (int p = 1; p <=2*i-1 ; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//seconde aproch

// public class diamon_pattern {
//     public static void main(String[] args) {

//         // Uperr Half
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= 5 - i; j++) {
//                 System.out.print(" ");
//             }

//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*");
//             }

//             for (int p = 2; p <= i; p++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         // Lower Half
//         for (int i = 5; i >= 1; i--) {

//             for (int j = 5; j >= i; j--) {
//                 System.out.print(" ");
//             }

//             for (int j = 1; j <= i-1; j++) {
//                 System.out.print("*");
//             }

//             for (int p = 1; p <=i-2 ; p++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
