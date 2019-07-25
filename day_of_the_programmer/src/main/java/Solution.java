/**
 * @author Kosolapov Ilya (d_dexter@mail.ru)
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
public class Solution {

    static String dayOfProgrammer(int year) {
        String day;
        if (year == 1918) {
            day = "26.09.1918";
        } else if ((year <= 1917 && year % 4 == 0)
                || (year > 1918 && ((year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0)))) {
            day = "12.09." + year;
        } else {
            day = "13.09." + year;
        }
        return day;
    }


}
