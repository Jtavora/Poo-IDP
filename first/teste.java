class main{
    public static void main (String[] args) {

        // String print
        String hello = "Hello, World!";
        System.out.println(hello);
        System.out.println(hello.toUpperCase()); 
        System.out.println();

        //Percorre array
        System.out.println(args.length);
        for(int i = 0; args.length > i; i++){
            System.out.print(args[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Array print
        int notas[] = {1, 2, 3};
        for(int i = 0; 3 > i; i++){
            System.out.println(notas[i]); //concatena
        }

    }
}