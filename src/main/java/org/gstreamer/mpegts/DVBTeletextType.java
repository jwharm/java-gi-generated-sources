package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of teletext page.
 * <p>
 * As specified in Table 100 of ETSI EN 300 468 v1.13.1
 */
public enum DVBTeletextType implements io.github.jwharm.javagi.Enumeration {
    NITIAL_PAGE(1),
    UBTITLE_PAGE(2),
    DDITIONAL_INFO_PAGE(3),
    ROGRAMME_SCHEDULE_PAGE(4),
    EARING_IMPAIRED_PAGE(5);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBTeletextType";
    
    private final int value;
    DVBTeletextType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DVBTeletextType of(int value) {
        return switch (value) {
            case 1 -> NITIAL_PAGE;
            case 2 -> UBTITLE_PAGE;
            case 3 -> DDITIONAL_INFO_PAGE;
            case 4 -> ROGRAMME_SCHEDULE_PAGE;
            case 5 -> EARING_IMPAIRED_PAGE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
