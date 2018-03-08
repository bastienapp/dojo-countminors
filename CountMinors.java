class CountMinors {

    // Compter le nombre de mineurs dans un tableau.
    public static int countWhile(int[] tbMinors)
    {   
        int i = 0;
        int minor = 0;
        while (i < tbMinors.length) 
        {
            int value = tbMinors[i];
            if (value < 18)
            {
                minor = minor + 1;
            }
            i = i + 1;
        }
            
        return minor;
    }

    public static int countFor(int[] tbMinors)
    {   
        int minor = 0;
        for (int i = 0; i < tbMinors.length; i = i + 1) 
        {
            int value = tbMinors[i];
            if (value < 18)
            { 
                minor = minor + 1;
            }
        }
            
        return minor;
    }
}
