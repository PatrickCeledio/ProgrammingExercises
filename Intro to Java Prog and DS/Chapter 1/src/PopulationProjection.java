/*
    Patrick Celedio Intro to Java Prog. and Data Struct. 12th Ed

    1.11 (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
    One birth every 7 seconds
    One death every 13 seconds
    One new immigrant every 45 seconds

    Write a program to display the population for each of the next five years.
    n = 312,032,486 citizens
    year = 365 days
 */
public class PopulationProjection {
    public static void main(String[] args){
        // days * hours * minutes * seconds
        int yearToSeconds = 365 * 24 * 60 * 60;
        int population = 312032486;
        double birthEverySevenSec = yearToSeconds/7;
        double deathEveryThirteenSec = yearToSeconds/13;
        double newImmigrantEveryFortyFiveSec = yearToSeconds/45;
        double totalNewCitizens = (birthEverySevenSec - deathEveryThirteenSec) + newImmigrantEveryFortyFiveSec;
        System.out.println("Population growth for the next five years given: \n" +
                "    One birth every 7 seconds\n" +
                "    One death every 13 seconds\n" +
                "    One new immigrant every 45 seconds\n" +
                "    n = 312,032,486 citizens\n" +
                "    year = 365 days");
        // Formula: Take the given population and sum it up with the total births, deaths, and new immigrants.
        // To account for the years, we take the total births, deaths, and new immigrants, and multiply by the amount
        // of years progressed
        System.out.println("Year 1: " + (population + (int)(totalNewCitizens)));
        System.out.println("Year 2: " + (population + (int)(2*totalNewCitizens)));
        System.out.println("Year 3: " + (population + (int)(3*totalNewCitizens)));
        System.out.println("Year 4: " + (population + (int)(4*totalNewCitizens)));
        System.out.println("Year 5: " + (population + (int)(5*totalNewCitizens)));

    }
}
