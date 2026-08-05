package arrays;

public class TwoDArrays {
    public static void main(String[] args){
//        String[] fruits = {"apples", "orange", "banana"};
//        String[] vegetables = {"potato", "onion", "carrot"};
//        String[] meats = {"chicken", "pork", "beef", "fish"};
//        String[][] groceries = {fruits, vegetables, meats, {"candy", "cake", "cupcake", "lollipop"}};
//
//        groceries[0][0] = "pineapple";
//
//        for(String[] foods:groceries){
//            for (String food : foods){
//                System.out.print(food + " ");
//            }
//            System.out.println();
//        }

        //mini project
        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for(char[] row : telephone){
            for (char c : row){
                System.out.print(c + " ");
            }
            System.out.println();
        }


    }
}
