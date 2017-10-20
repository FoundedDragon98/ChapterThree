package ChapterThree;

public class MultTable
{
    public static void main(String [] args)
    {
        int values;
        for(int row = 0; row < 12; row++) {
            for(int mult = 0; mult < 12; mult++) {
                values = (row+1) * (mult+1);
                System.out.print(values + " ");
            }
            System.out.println("");
        }
    }
}
