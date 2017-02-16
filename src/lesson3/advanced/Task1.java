package lesson3.advanced;

import java.sql.Array;
import java.util.ArrayList;

/**
 * Created by Angelina on 28.01.2017.
 */
public class Task1 {
    public static void main(String[] args) {

        System.out.println(getPassword());
    }
    public static ArrayList getPassword() {
        ArrayList<Character> n = new ArrayList();
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        int num = 0;
        int mLetter = 0;
        int bLetter = 0;
        char[] symbols = letters.toCharArray();
        int r;

        for (int i = 0; i < 6; i++) {
            r = (int) (Math.random() * symbols.length);
            if (r <= 26) mLetter = 1;
            else if (r >= 53) num = 1;
            else bLetter = 1;

            n.add(symbols[r]);
        }
        if ((mLetter + num + bLetter) >= 2)
        {
            r = (int) (Math.random() * symbols.length);
            if (r <= 26) mLetter = 1;
            else if (r >= 53) num = 1;
            else bLetter = 1;
            n.add(symbols[r]);

        } else {
            while ((mLetter + num + bLetter) == 1)
            {
                r = (int) (Math.random() * symbols.length);
                if (r <= 26) mLetter = 1;
                else if (r >= 53) num = 1;
                else bLetter = 1;
                if ((mLetter + num + bLetter) == 2)
                   n.add(symbols[r]);
            }
        }

        if (((mLetter + num + bLetter) == 3))
        {
            r = (int) (Math.random() * symbols.length);
            n.add(symbols[r]);
        } else {
            while ((mLetter + num + bLetter) == 2)
            {
                r = (int) (Math.random() * symbols.length);
                if (r <= 26) mLetter = 1;
                else if (r >= 53) num = 1;
                else bLetter = 1;
                if ((mLetter + num + bLetter) == 3)
                    n.add(symbols[r]);
            }
        }
        return n;
    }
}
