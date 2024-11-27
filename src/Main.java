//Rujul Telavane Suha Mallepeddi

public class Main {

    public static void main (String[] args)
    {
        if (args.length == 2){
            int s = Integer.parseInt(args[0]);
            int e = Integer.parseInt(args[1]);

            Addition a = (int x, int y) -> {
                int sum = 0;
                for (int i = x; i < y+1; i ++ )
                {
                    sum += i;
                }
                return sum;
            };

            int total = a.add(s, e);

            System.out.print(total);

        }

    }



}

