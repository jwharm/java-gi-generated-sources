package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Status extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final Status SUCCESS = new Status(0);
    
    public static final Status NO_MEMORY = new Status(1);
    
    public static final Status INVALID_RESTORE = new Status(2);
    
    public static final Status INVALID_POP_GROUP = new Status(3);
    
    public static final Status NO_CURRENT_POINT = new Status(4);
    
    public static final Status INVALID_MATRIX = new Status(5);
    
    public static final Status INVALID_STATUS = new Status(6);
    
    public static final Status NULL_POINTER = new Status(7);
    
    public static final Status INVALID_STRING = new Status(8);
    
    public static final Status INVALID_PATH_DATA = new Status(9);
    
    public static final Status READ_ERROR = new Status(10);
    
    public static final Status WRITE_ERROR = new Status(11);
    
    public static final Status SURFACE_FINISHED = new Status(12);
    
    public static final Status SURFACE_TYPE_MISMATCH = new Status(13);
    
    public static final Status PATTERN_TYPE_MISMATCH = new Status(14);
    
    public static final Status INVALID_CONTENT = new Status(15);
    
    public static final Status INVALID_FORMAT = new Status(16);
    
    public static final Status INVALID_VISUAL = new Status(17);
    
    public static final Status FILE_NOT_FOUND = new Status(18);
    
    public static final Status INVALID_DASH = new Status(19);
    
    public static final Status INVALID_DSC_COMMENT = new Status(20);
    
    public static final Status INVALID_INDEX = new Status(21);
    
    public static final Status CLIP_NOT_REPRESENTABLE = new Status(22);
    
    public static final Status TEMP_FILE_ERROR = new Status(23);
    
    public static final Status INVALID_STRIDE = new Status(24);
    
    public static final Status FONT_TYPE_MISMATCH = new Status(25);
    
    public static final Status USER_FONT_IMMUTABLE = new Status(26);
    
    public static final Status USER_FONT_ERROR = new Status(27);
    
    public static final Status NEGATIVE_COUNT = new Status(28);
    
    public static final Status INVALID_CLUSTERS = new Status(29);
    
    public static final Status INVALID_SLANT = new Status(30);
    
    public static final Status INVALID_WEIGHT = new Status(31);
    
    public static final Status INVALID_SIZE = new Status(32);
    
    public static final Status USER_FONT_NOT_IMPLEMENTED = new Status(33);
    
    public static final Status DEVICE_TYPE_MISMATCH = new Status(34);
    
    public static final Status DEVICE_ERROR = new Status(35);
    
    public static final Status INVALID_MESH_CONSTRUCTION = new Status(36);
    
    public static final Status DEVICE_FINISHED = new Status(37);
    
    public static final Status JBIG2_GLOBAL_MISSING = new Status(38);
    
    public Status(int value) {
        super(value);
    }
}
