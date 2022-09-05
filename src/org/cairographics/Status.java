package org.cairographics;

public enum Status {

    SUCCESS,
    
    NO_MEMORY,
    
    INVALID_RESTORE,
    
    INVALID_POP_GROUP,
    
    NO_CURRENT_POINT,
    
    INVALID_MATRIX,
    
    INVALID_STATUS,
    
    NULL_POINTER,
    
    INVALID_STRING,
    
    INVALID_PATH_DATA,
    
    READ_ERROR,
    
    WRITE_ERROR,
    
    SURFACE_FINISHED,
    
    SURFACE_TYPE_MISMATCH,
    
    PATTERN_TYPE_MISMATCH,
    
    INVALID_CONTENT,
    
    INVALID_FORMAT,
    
    INVALID_VISUAL,
    
    FILE_NOT_FOUND,
    
    INVALID_DASH,
    
    INVALID_DSC_COMMENT,
    
    INVALID_INDEX,
    
    CLIP_NOT_REPRESENTABLE,
    
    TEMP_FILE_ERROR,
    
    INVALID_STRIDE,
    
    FONT_TYPE_MISMATCH,
    
    USER_FONT_IMMUTABLE,
    
    USER_FONT_ERROR,
    
    NEGATIVE_COUNT,
    
    INVALID_CLUSTERS,
    
    INVALID_SLANT,
    
    INVALID_WEIGHT,
    
    INVALID_SIZE,
    
    USER_FONT_NOT_IMPLEMENTED,
    
    DEVICE_TYPE_MISMATCH,
    
    DEVICE_ERROR,
    
    INVALID_MESH_CONSTRUCTION,
    
    DEVICE_FINISHED,
    
    JBIG2_GLOBAL_MISSING;
    
    public static Status fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case SUCCESS -> 0;
            case NO_MEMORY -> 1;
            case INVALID_RESTORE -> 2;
            case INVALID_POP_GROUP -> 3;
            case NO_CURRENT_POINT -> 4;
            case INVALID_MATRIX -> 5;
            case INVALID_STATUS -> 6;
            case NULL_POINTER -> 7;
            case INVALID_STRING -> 8;
            case INVALID_PATH_DATA -> 9;
            case READ_ERROR -> 10;
            case WRITE_ERROR -> 11;
            case SURFACE_FINISHED -> 12;
            case SURFACE_TYPE_MISMATCH -> 13;
            case PATTERN_TYPE_MISMATCH -> 14;
            case INVALID_CONTENT -> 15;
            case INVALID_FORMAT -> 16;
            case INVALID_VISUAL -> 17;
            case FILE_NOT_FOUND -> 18;
            case INVALID_DASH -> 19;
            case INVALID_DSC_COMMENT -> 20;
            case INVALID_INDEX -> 21;
            case CLIP_NOT_REPRESENTABLE -> 22;
            case TEMP_FILE_ERROR -> 23;
            case INVALID_STRIDE -> 24;
            case FONT_TYPE_MISMATCH -> 25;
            case USER_FONT_IMMUTABLE -> 26;
            case USER_FONT_ERROR -> 27;
            case NEGATIVE_COUNT -> 28;
            case INVALID_CLUSTERS -> 29;
            case INVALID_SLANT -> 30;
            case INVALID_WEIGHT -> 31;
            case INVALID_SIZE -> 32;
            case USER_FONT_NOT_IMPLEMENTED -> 33;
            case DEVICE_TYPE_MISMATCH -> 34;
            case DEVICE_ERROR -> 35;
            case INVALID_MESH_CONSTRUCTION -> 36;
            case DEVICE_FINISHED -> 37;
            case JBIG2_GLOBAL_MISSING -> 38;
        };
    }

}
