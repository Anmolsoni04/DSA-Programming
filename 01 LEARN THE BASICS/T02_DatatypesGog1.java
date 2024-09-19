// Ques Link: https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type

class T02_DatatypesGog1 {
    public static int dataType(String str) {
        switch (str) {
            case "Character":
                return 2;
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Float":
                return 4;
            case "Double":
                return 8;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        if(args.length > 0) {
            String input = args[0];
            System.out.println(dataType(input));
        } else{
            System.out.println("No input has provided");
        }
    }
}