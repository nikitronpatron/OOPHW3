import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Comparator<Notebook> CompareToMaxMin = new CompareToMaxMin();
        Comparator<Notebook> CompareToMinMax = new CompareToMinMax();
        Comparator<Notebook> CompareToRAM = new CompareToRam();

        Notebook notebook1 = new Notebook(17990, 4);
        Notebook notebook2 = new Notebook(49990, 8);
        Notebook notebook3 = new Notebook(179990, 16);
        Notebook notebook4 = new Notebook(18990, 4);
        Notebook notebook5 = new Notebook(79990, 16);
        Notebook notebook6 = new Notebook(39990, 4);
        Notebook notebook7 = new Notebook(49990, 8);
        Notebook notebook8 = new Notebook(19990, 4);
        Notebook notebook9 = new Notebook(11990, 4);
        Notebook notebook10 = new Notebook(89990, 8);

        ArrayList<Notebook> notebooks = new ArrayList<>();

        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);
        notebooks.add(notebook10);

        for (Notebook notebook : notebooks)
        {
            System.out.println(notebook);
        }
        System.out.println();
        
        notebooks.sort(CompareToMaxMin);
        for (Notebook notebook : notebooks)
        {
            System.out.println(notebook);
        }
        System.out.println();

        notebooks.sort(CompareToMinMax);
        for (Notebook notebook : notebooks)
        {
            System.out.println(notebook);
        }
        System.out.println();

        // notebooks.sort(CompareToRam);
        // for (Notebook notebook : notebooks)
        // {
        //     System.out.println(notebook);
        // }

    }    
}
