package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of license for an application.
 * <p>
 * This enumeration can be expanded at later date.
 */
public enum License implements io.github.jwharm.javagi.Enumeration {
    /**
     * No license specified
     */
    UNKNOWN(0),
    /**
     * A license text is going to be specified by the
     *   developer
     */
    CUSTOM(1),
    /**
     * The GNU General Public License, version 2.0 or later
     */
    GPL_2_0(2),
    /**
     * The GNU General Public License, version 3.0 or later
     */
    GPL_3_0(3),
    /**
     * The GNU Lesser General Public License, version 2.1 or later
     */
    LGPL_2_1(4),
    /**
     * The GNU Lesser General Public License, version 3.0 or later
     */
    LGPL_3_0(5),
    /**
     * The BSD standard license
     */
    BSD(6),
    /**
     * The MIT/X11 standard license
     */
    MIT_X11(7),
    /**
     * The Artistic License, version 2.0
     */
    ARTISTIC(8),
    /**
     * The GNU General Public License, version 2.0 only
     */
    GPL_2_0_ONLY(9),
    /**
     * The GNU General Public License, version 3.0 only
     */
    GPL_3_0_ONLY(10),
    /**
     * The GNU Lesser General Public License, version 2.1 only
     */
    LGPL_2_1_ONLY(11),
    /**
     * The GNU Lesser General Public License, version 3.0 only
     */
    LGPL_3_0_ONLY(12),
    /**
     * The GNU Affero General Public License, version 3.0 or later
     */
    AGPL_3_0(13),
    /**
     * The GNU Affero General Public License, version 3.0 only
     */
    AGPL_3_0_ONLY(14),
    /**
     * The 3-clause BSD licence
     */
    BSD_3(15),
    /**
     * The Apache License, version 2.0
     */
    APACHE_2_0(16),
    /**
     * The Mozilla Public License, version 2.0
     */
    MPL_2_0(17);
    
    private static final java.lang.String C_TYPE_NAME = "GtkLicense";
    
    private final int value;
    License(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static License of(int value) {
        return switch (value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
