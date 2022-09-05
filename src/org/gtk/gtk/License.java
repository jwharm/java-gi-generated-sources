package org.gtk.gtk;

/**
 * The type of license for an application.
 * 
 * This enumeration can be expanded at later date.
 */
public enum License {

    /**
     * No license specified
     */
    UNKNOWN,
    
    /**
     * A license text is going to be specified by the
     *   developer
     */
    CUSTOM,
    
    /**
     * The GNU General Public License, version 2.0 or later
     */
    GPL_2_0,
    
    /**
     * The GNU General Public License, version 3.0 or later
     */
    GPL_3_0,
    
    /**
     * The GNU Lesser General Public License, version 2.1 or later
     */
    LGPL_2_1,
    
    /**
     * The GNU Lesser General Public License, version 3.0 or later
     */
    LGPL_3_0,
    
    /**
     * The BSD standard license
     */
    BSD,
    
    /**
     * The MIT/X11 standard license
     */
    MIT_X11,
    
    /**
     * The Artistic License, version 2.0
     */
    ARTISTIC,
    
    /**
     * The GNU General Public License, version 2.0 only
     */
    GPL_2_0_ONLY,
    
    /**
     * The GNU General Public License, version 3.0 only
     */
    GPL_3_0_ONLY,
    
    /**
     * The GNU Lesser General Public License, version 2.1 only
     */
    LGPL_2_1_ONLY,
    
    /**
     * The GNU Lesser General Public License, version 3.0 only
     */
    LGPL_3_0_ONLY,
    
    /**
     * The GNU Affero General Public License, version 3.0 or later
     */
    AGPL_3_0,
    
    /**
     * The GNU Affero General Public License, version 3.0 only
     */
    AGPL_3_0_ONLY,
    
    /**
     * The 3-clause BSD licence
     */
    BSD_3,
    
    /**
     * The Apache License, version 2.0
     */
    APACHE_2_0,
    
    /**
     * The Mozilla Public License, version 2.0
     */
    MPL_2_0;
    
    public static License fromValue(int value) {
        return switch(value) {
            case 0 -> UNKNOWN;
            case 1 -> CUSTOM;
            case 2 -> GPL_2_0;
            case 3 -> GPL_3_0;
            case 4 -> LGPL_2_1;
            case 5 -> LGPL_3_0;
            case 6 -> BSD;
            case 7 -> MIT_X11;
            case 8 -> ARTISTIC;
            case 9 -> GPL_2_0_ONLY;
            case 10 -> GPL_3_0_ONLY;
            case 11 -> LGPL_2_1_ONLY;
            case 12 -> LGPL_3_0_ONLY;
            case 13 -> AGPL_3_0;
            case 14 -> AGPL_3_0_ONLY;
            case 15 -> BSD_3;
            case 16 -> APACHE_2_0;
            case 17 -> MPL_2_0;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNKNOWN -> 0;
            case CUSTOM -> 1;
            case GPL_2_0 -> 2;
            case GPL_3_0 -> 3;
            case LGPL_2_1 -> 4;
            case LGPL_3_0 -> 5;
            case BSD -> 6;
            case MIT_X11 -> 7;
            case ARTISTIC -> 8;
            case GPL_2_0_ONLY -> 9;
            case GPL_3_0_ONLY -> 10;
            case LGPL_2_1_ONLY -> 11;
            case LGPL_3_0_ONLY -> 12;
            case AGPL_3_0 -> 13;
            case AGPL_3_0_ONLY -> 14;
            case BSD_3 -> 15;
            case APACHE_2_0 -> 16;
            case MPL_2_0 -> 17;
        };
    }

}
