package lesson3.intermediate;

/**
 * Created by Angelina on 29.01.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        String initial = "checkChangingProfilePicture";

        char[] toCharArr = initial.toCharArray();
        String output="";
        char j;
        output = Character.toString(Character.toUpperCase(toCharArr[0]));
        for (int i=1; i < initial.length(); i++ ){
            j = toCharArr[i];
            if (Character.isUpperCase(j)){
                j = Character.toLowerCase(j);
                output += " "+j;
            }
            else{
                output += j;
            }
        }
        System.out.println(output);
    }
}
