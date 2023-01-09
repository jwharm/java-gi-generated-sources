package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum Status implements io.github.jwharm.javagi.Enumeration {
    
    SUCCESS(0),
    
    NO_MEMORY(1),
    
    INVALID_RESTORE(2),
    
    INVALID_POP_GROUP(3),
    
    NO_CURRENT_POINT(4),
    
    INVALID_MATRIX(5),
    
    INVALID_STATUS(6),
    
    NULL_POINTER(7),
    
    INVALID_STRING(8),
    
    INVALID_PATH_DATA(9),
    
    READ_ERROR(10),
    
    WRITE_ERROR(11),
    
    SURFACE_FINISHED(12),
    
    SURFACE_TYPE_MISMATCH(13),
    
    PATTERN_TYPE_MISMATCH(14),
    
    INVALID_CONTENT(15),
    
    INVALID_FORMAT(16),
    
    INVALID_VISUAL(17),
    
    FILE_NOT_FOUND(18),
    
    INVALID_DASH(19),
    
    INVALID_DSC_COMMENT(20),
    
    INVALID_INDEX(21),
    
    CLIP_NOT_REPRESENTABLE(22),
    
    TEMP_FILE_ERROR(23),
    
    INVALID_STRIDE(24),
    
    FONT_TYPE_MISMATCH(25),
    
    USER_FONT_IMMUTABLE(26),
    
    USER_FONT_ERROR(27),
    
    NEGATIVE_COUNT(28),
    
    INVALID_CLUSTERS(29),
    
    INVALID_SLANT(30),
    
    INVALID_WEIGHT(31),
    
    INVALID_SIZE(32),
    
    USER_FONT_NOT_IMPLEMENTED(33),
    
    DEVICE_TYPE_MISMATCH(34),
    
    DEVICE_ERROR(35),
    
    INVALID_MESH_CONSTRUCTION(36),
    
    DEVICE_FINISHED(37),
    
    JBIG2_GLOBAL_MISSING(38);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_status_t";
    
    private final int value;
    
    /**
     * Create a new Status for the provided value
     * @param numeric value the enum value
     */
    Status(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new Status for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Status of(int value) {
        return switch (value) {
            case 0 -> SUCCESS;
            case 1 -> NO_MEMORY;
            case 2 -> INVALID_RESTORE;
            case 3 -> INVALID_POP_GROUP;
            case 4 -> NO_CURRENT_POINT;
            case 5 -> INVALID_MATRIX;
            case 6 -> INVALID_STATUS;
            case 7 -> NULL_POINTER;
            case 8 -> INVALID_STRING;
            case 9 -> INVALID_PATH_DATA;
            case 10 -> READ_ERROR;
            case 11 -> WRITE_ERROR;
            case 12 -> SURFACE_FINISHED;
            case 13 -> SURFACE_TYPE_MISMATCH;
            case 14 -> PATTERN_TYPE_MISMATCH;
            case 15 -> INVALID_CONTENT;
            case 16 -> INVALID_FORMAT;
            case 17 -> INVALID_VISUAL;
            case 18 -> FILE_NOT_FOUND;
            case 19 -> INVALID_DASH;
            case 20 -> INVALID_DSC_COMMENT;
            case 21 -> INVALID_INDEX;
            case 22 -> CLIP_NOT_REPRESENTABLE;
            case 23 -> TEMP_FILE_ERROR;
            case 24 -> INVALID_STRIDE;
            case 25 -> FONT_TYPE_MISMATCH;
            case 26 -> USER_FONT_IMMUTABLE;
            case 27 -> USER_FONT_ERROR;
            case 28 -> NEGATIVE_COUNT;
            case 29 -> INVALID_CLUSTERS;
            case 30 -> INVALID_SLANT;
            case 31 -> INVALID_WEIGHT;
            case 32 -> INVALID_SIZE;
            case 33 -> USER_FONT_NOT_IMPLEMENTED;
            case 34 -> DEVICE_TYPE_MISMATCH;
            case 35 -> DEVICE_ERROR;
            case 36 -> INVALID_MESH_CONSTRUCTION;
            case 37 -> DEVICE_FINISHED;
            case 38 -> JBIG2_GLOBAL_MISSING;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
