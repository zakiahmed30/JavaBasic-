package conditions;

public class ArrayPractice {
    public static void main(String[] args) {
        //Array -- []
        String[] name = {"Mr X", "Mr Y", "Mr Z", "Mr A", "Mr B"};

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name.length);
        System.out.println("****************");

        System.out.println(name.length);

        for (int a = 0; a < name.length; a++) {
            System.out.println(name[a]);

            int[] numbers = {12, 11, 111, 223, 322};
            Object[] objectArray = {"Mr B", 1};

            for (int z = 0; z < objectArray.length; z++) {
//                System.out.println(objectArray[i]);

                //enhanced for loop

                for (int i = 0; i < numbers.length; i++) {
                    System.out.println(numbers[i]);

                    //do while loop
                    int s = 5;
                    do {
                        System.out.println("i love java");
                        s++;
                    }
                    while(s < 10);

                            }

                }

            }
        }

    }