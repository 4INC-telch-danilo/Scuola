public class ManipolazioneStringhe {
    public static void main(String[] args) {
        // Metodi di java.lang.String
        String str = "Hello, World!";
        System.out.println("Original String: " + str);

        // length()
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // charAt()
        char charAt5 = str.charAt(5);
        System.out.println("Character at index 5: " + charAt5);

        // substring()
        String subString1 = str.substring(7);
        System.out.println("Substring from index 7: " + subString1);

        String subString2 = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + subString2);

        // equals()
        boolean isEqual = str.equals("Hello, World!");
        System.out.println("Is the string equal to 'Hello, World!': " + isEqual);

        // equalsIgnoreCase()
        boolean isEqualIgnoreCase = str.equalsIgnoreCase("HELLO, world!");
        System.out.println("Is the string equal to 'HELLO, world!' (ignoring case): " + isEqualIgnoreCase);

        // compareTo()
        int compareToResult = str.compareTo("Hello, Universe!");
        System.out.println("Comparison result with 'Hello, Universe!': " + compareToResult);

        // compareToIgnoreCase()
        int compareToIgnoreCaseResult = str.compareToIgnoreCase("HELLO, universe!");
        System.out.println("Comparison result with 'HELLO, universe!' (ignoring case): " + compareToIgnoreCaseResult);

        // indexOf()
        int indexOfComma = str.indexOf(",");
        System.out.println("Index of ',' in the string: " + indexOfComma);

        // indexOf() with fromIndex
        int indexOfCommaFromIndex = str.indexOf(",", 5);
        System.out.println("Index of ',' starting from index 5: " + indexOfCommaFromIndex);

        // lastIndexOf()
        int lastIndexOfO = str.lastIndexOf("o");
        System.out.println("Last index of 'o' in the string: " + lastIndexOfO);

        // lastIndexOf() with fromIndex
        int lastIndexOfOFromIndex = str.lastIndexOf("o", 8);
        System.out.println("Last index of 'o' before index 8: " + lastIndexOfOFromIndex);

        // startsWith() and endsWith()
        boolean startsWithHello = str.startsWith("Hello");
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        System.out.println("Ends with 'World!': " + endsWithWorld);

        // isEmpty()
        boolean isEmpty = str.isEmpty();
        System.out.println("Is the string empty: " + isEmpty);

        // toUpperCase() and toLowerCase()
        String upperCaseStr = str.toUpperCase();
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Uppercase: " + upperCaseStr);
        System.out.println("Lowercase: " + lowerCaseStr);

        // trim()
        String spacedStr = "   Trim me!   ";
        String trimmedStr = spacedStr.trim();
        System.out.println("Original string with spaces: '" + spacedStr + "'");
        System.out.println("Trimmed string: '" + trimmedStr + "'");

        // replace()
        String replacedStr = str.replace('o', '0');
        System.out.println("String after replacing 'o' with '0': " + replacedStr);

        // replace(CharSequence target, CharSequence replacement)
        String replacedStr2 = str.replace("World", "Universe");
        System.out.println("String after replacing 'World' with 'Universe': " + replacedStr2);

        // replaceAll()
        String regexReplacedStr = str.replaceAll("[aeiou]", "*");
        System.out.println("String after replacing vowels with '*': " + regexReplacedStr);

        // replaceFirst()
        String firstOccurrenceReplacedStr = str.replaceFirst("[aeiou]", "*");
        System.out.println("String after replacing the first vowel with '*': " + firstOccurrenceReplacedStr);

        // split()
        String[] splitStr = str.split(",");
        System.out.print("String split by ',': ");
        for (String s : splitStr) {
            System.out.print(s + " ");
        }
        System.out.println();

        // split() with limit
        String[] splitStrWithLimit = str.split(",", 2);
        System.out.print("String split by ',' with limit 2: ");
        for (String s : splitStrWithLimit) {
            System.out.print(s + " ");
        }
        System.out.println();

        // contains()
        boolean containsHello = str.contains("Hello");
        System.out.println("Does the string contain 'Hello': " + containsHello);

        // contentEquals(StringBuffer sb)
        StringBuffer stringBuffer1 = new StringBuffer(str);
        boolean contentEqualsStringBuffer = str.contentEquals(stringBuffer1);
        System.out.println("Is the content equal to StringBuffer: " + contentEqualsStringBuffer);

        // contentEquals(CharSequence cs)
        CharSequence charSequence = new StringBuilder(str);
        boolean contentEqualsCharSequence = str.contentEquals(charSequence);
        System.out.println("Is the content equal to CharSequence: " + contentEqualsCharSequence);

        // matches()
        boolean matchesRegex = str.matches("[A-Za-z,\\s]+");
        System.out.println("Does the string match the regex pattern: " + matchesRegex);

        // regionMatches()
        boolean regionMatches = str.regionMatches(7, "world", 0, 5);
        System.out.println("Does the region match 'world': " + regionMatches);

        // regionMatches() ignoring case
        boolean regionMatchesIgnoreCase = str.regionMatches(true, 7, "WORLD", 0, 5);
        System.out.println("Does the region match 'WORLD' ignoring case: " + regionMatchesIgnoreCase);

        // Metodi di java.lang.StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("\nOriginal StringBuilder: " + stringBuilder);

        // append()
        stringBuilder.append(" Welcome!");
        System.out.println("After appending ' Welcome!': " + stringBuilder);

        // insert()
        stringBuilder.insert(6, " Awesome");
        System.out.println("After inserting ' Awesome' at index 6: " + stringBuilder);

        // delete()
        stringBuilder.delete(12, 17);
        System.out.println("After deleting characters from index 12 to 17: " + stringBuilder);

        // deleteCharAt()
        stringBuilder.deleteCharAt(8);
        System.out.println("After deleting character at index 8: " + stringBuilder);

        // replace()
        stringBuilder.replace(0, 5, "Greetings");
        System.out.println("After replacing characters from index 0 to 5 with 'Greetings': " + stringBuilder);

        // substring()
        String subStringBuilder1 = stringBuilder.substring(7);
        System.out.println("Substring from index 7: " + subStringBuilder1);

        String subStringBuilder2 = stringBuilder.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + subStringBuilder2);

        // reverse()
        stringBuilder.reverse();
        System.out.println("After reversing: " + stringBuilder);

        // toString()
        String stringBuilderToString = stringBuilder.toString();
        System.out.println("StringBuilder converted to String: " + stringBuilderToString);

        // Metodi di java.lang.StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("\nOriginal StringBuffer: " + stringBuffer);

        // append()
        stringBuffer.append(" Welcome!");
        System.out.println("After appending ' Welcome!': " + stringBuffer);

        // insert()
        stringBuffer.insert(6, " Amazing");
        System.out.println("After inserting ' Amazing' at index 6: " + stringBuffer);

        // delete()
        stringBuffer.delete(12, 19);
        System.out.println("After deleting characters from index 12 to 19: " + stringBuffer);

        // deleteCharAt()
        stringBuffer.deleteCharAt(8);
        System.out.println("After deleting character at index 8: " + stringBuffer);

        // replace()
        stringBuffer.replace(0, 5, "Greetings");
        System.out.println("After replacing characters from index 0 to 5 with 'Greetings': " + stringBuffer);

        // substring()
        String subStringBuffer1 = stringBuffer.substring(7);
        System.out.println("Substring from index 7: " + subStringBuffer1);

        String subStringBuffer2 = stringBuffer.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + subStringBuffer2);

        // reverse()
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer);

        // toString()
        String stringBufferToString = stringBuffer.toString();
        System.out.println("StringBuffer converted to String: " + stringBufferToString);
    }
}
