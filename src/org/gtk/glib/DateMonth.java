package org.gtk.glib;

/**
 * Enumeration representing a month; values are %G_DATE_JANUARY,
 * %G_DATE_FEBRUARY, etc. %G_DATE_BAD_MONTH is the invalid value.
 */
public enum DateMonth {

    /**
     * invalid value
     */
    BAD_MONTH,
    
    /**
     * January
     */
    JANUARY,
    
    /**
     * February
     */
    FEBRUARY,
    
    /**
     * March
     */
    MARCH,
    
    /**
     * April
     */
    APRIL,
    
    /**
     * May
     */
    MAY,
    
    /**
     * June
     */
    JUNE,
    
    /**
     * July
     */
    JULY,
    
    /**
     * August
     */
    AUGUST,
    
    /**
     * September
     */
    SEPTEMBER,
    
    /**
     * October
     */
    OCTOBER,
    
    /**
     * November
     */
    NOVEMBER,
    
    /**
     * December
     */
    DECEMBER;
    
    public static DateMonth fromValue(int value) {
        return switch(value) {
            case 0 -> BAD_MONTH;
            case 1 -> JANUARY;
            case 2 -> FEBRUARY;
            case 3 -> MARCH;
            case 4 -> APRIL;
            case 5 -> MAY;
            case 6 -> JUNE;
            case 7 -> JULY;
            case 8 -> AUGUST;
            case 9 -> SEPTEMBER;
            case 10 -> OCTOBER;
            case 11 -> NOVEMBER;
            case 12 -> DECEMBER;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BAD_MONTH -> 0;
            case JANUARY -> 1;
            case FEBRUARY -> 2;
            case MARCH -> 3;
            case APRIL -> 4;
            case MAY -> 5;
            case JUNE -> 6;
            case JULY -> 7;
            case AUGUST -> 8;
            case SEPTEMBER -> 9;
            case OCTOBER -> 10;
            case NOVEMBER -> 11;
            case DECEMBER -> 12;
        };
    }

}
