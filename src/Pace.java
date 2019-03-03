class Pace {
    float pace;
    public static void  main (String[] args){
        Pace runner1 = new Pace();
        Pace runner2 = new Pace();
        runner1.pace = 4.56f;
        System.out.println(runner1);
        runner2.pace = 4.97f;
        System.out.println(runner2);
        runner1 = runner2;
        System.out.println(runner1);


    }
}
