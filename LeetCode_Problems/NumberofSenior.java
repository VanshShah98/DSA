public class NumberofSenior {
    /*
     * You are given a 0-indexed array of strings details. Each element of details
     * provides information about a given passenger compressed into a string of
     * length 15. The system is such that:
     * 
     * The first ten characters consist of the phone number of passengers.
     * The next character denotes the gender of the person.
     * The following two characters are used to indicate the age of the person.
     * The last two characters determine the seat allotted to that person.
     * Return the number of passengers who are strictly more than 60 years old.
     */
    public static void main(String[] args) {
        String[] details = { "7868190130M7522", "5303914400F9211", "9273338290F4010" };
        System.out.println(countSeniors(details));

    }

    public static int countSeniors(String[] details) {
        int i = 0;
        int count = 0;
        while (i < details.length) {
            String str = details[i];
            int age = Integer.parseInt(str.substring(11, 13));
            if (age > 60) {
                count++;
            }
            i++;
        }
        return count;
    }

}
