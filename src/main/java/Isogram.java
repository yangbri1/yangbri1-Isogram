// import Set & HashSet containers from Java's Utility package --- (Set DN contain duplicate values)
import java.util.Set;
import java.util.HashSet;

public class Isogram {
    /**
     * An Isogram is a word where no letters are repeated. You may assume that there will only be lowercase
     * letters in the String.
     *
     * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg", "java", "programming" are not.
     * You could use a Set of characters or a Map of characters to int or boolean to solve this problem.
     * You could even solve it with an array of 26 booleans, and convert characters to an index of that array.
     * It's also possible to solve this with nested for loops.... but it's not as easy or efficient.
     *
     * @param str a String.
     * @return true if str is an isogram, false otherwise.
     */
    public boolean isIsogram(String str){
        // create an array of String datatype w/ fixed size of 'str'.length()
        // String[] strAry = new String[str.length()];
        char[] charAry = str.toCharArray();
        // initialize an empty Set of Character type ...
        // Set like many Java containers only accept Complex datatypes (not primitives) hence why datatype is Wrapper Class 'Character' 
        Set<Character> charSet = new HashSet<Character>();
        // implement for-each loop to iterate via each 'char' within 'charAry'
        for(char ch : charAry){
            // .add() each 'char' into 'charSet' ...
            // Note: Since 'Set' only accepts Complex datatypes --- implicit autoboxing occurs here (converting 'char' -> 'Character')
            charSet.add(ch);
        }

        // if the length of 'charAry' & size() of 'charSet' are equivalent ...
        // if(charSet.size() == charAry.length){
        //     // no char were removed when being appended to Set aka no duplicate letters found -> 'str' is indeed an isogram
        //     return true;
        // }
        // // otw ... 'str' is NOT an isogram -- return false
        // return false;

        // ternary operator equivalent to above if-else block succinct way showing same logic
        boolean isogramStatus = (charSet.size() == charAry.length) ? true : false;
        return isogramStatus;
    }
}
