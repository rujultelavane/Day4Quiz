public class Main {

    public static void main (String[] args)
    {
        Addition a = (int x, int y) -> {
            int sum = 0;
            for (int i = x; i < y+1; i ++ )
            {
                sum += i;
            }
            return sum;
        };
    }
}
