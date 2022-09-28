package org.gtk.gtk;

/**
 * The type of license for an application.
 * <p>
 * This enumeration can be expanded at later date.
 */
public class License {

    /**
     * No license specified
     */
    public static final License UNKNOWN = new License(0);
    
    /**
     * A license text is going to be specified by the
     *   developer
     */
    public static final License CUSTOM = new License(1);
    
    /**
     * The GNU General Public License, version 2.0 or later
     */
    public static final License GPL_2_0 = new License(2);
    
    /**
     * The GNU General Public License, version 3.0 or later
     */
    public static final License GPL_3_0 = new License(3);
    
    /**
     * The GNU Lesser General Public License, version 2.1 or later
     */
    public static final License LGPL_2_1 = new License(4);
    
    /**
     * The GNU Lesser General Public License, version 3.0 or later
     */
    public static final License LGPL_3_0 = new License(5);
    
    /**
     * The BSD standard license
     */
    public static final License BSD = new License(6);
    
    /**
     * The MIT/X11 standard license
     */
    public static final License MIT_X11 = new License(7);
    
    /**
     * The Artistic License, version 2.0
     */
    public static final License ARTISTIC = new License(8);
    
    /**
     * The GNU General Public License, version 2.0 only
     */
    public static final License GPL_2_0_ONLY = new License(9);
    
    /**
     * The GNU General Public License, version 3.0 only
     */
    public static final License GPL_3_0_ONLY = new License(10);
    
    /**
     * The GNU Lesser General Public License, version 2.1 only
     */
    public static final License LGPL_2_1_ONLY = new License(11);
    
    /**
     * The GNU Lesser General Public License, version 3.0 only
     */
    public static final License LGPL_3_0_ONLY = new License(12);
    
    /**
     * The GNU Affero General Public License, version 3.0 or later
     */
    public static final License AGPL_3_0 = new License(13);
    
    /**
     * The GNU Affero General Public License, version 3.0 only
     */
    public static final License AGPL_3_0_ONLY = new License(14);
    
    /**
     * The 3-clause BSD licence
     */
    public static final License BSD_3 = new License(15);
    
    /**
     * The Apache License, version 2.0
     */
    public static final License APACHE_2_0 = new License(16);
    
    /**
     * The Mozilla Public License, version 2.0
     */
    public static final License MPL_2_0 = new License(17);
    
    private int value;
    
    public License(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(License[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
