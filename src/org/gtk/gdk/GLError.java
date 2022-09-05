package org.gtk.gdk;

/**
 * Error enumeration for `GdkGLContext`.
 */
public enum GLError {

    /**
     * OpenGL support is not available
     */
    NOT_AVAILABLE,
    
    /**
     * The requested visual format is not supported
     */
    UNSUPPORTED_FORMAT,
    
    /**
     * The requested profile is not supported
     */
    UNSUPPORTED_PROFILE,
    
    /**
     * The shader compilation failed
     */
    COMPILATION_FAILED,
    
    /**
     * The shader linking failed
     */
    LINK_FAILED;
    
    public static GLError fromValue(int value) {
        return switch(value) {
            case 0 -> NOT_AVAILABLE;
            case 1 -> UNSUPPORTED_FORMAT;
            case 2 -> UNSUPPORTED_PROFILE;
            case 3 -> COMPILATION_FAILED;
            case 4 -> LINK_FAILED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NOT_AVAILABLE -> 0;
            case UNSUPPORTED_FORMAT -> 1;
            case UNSUPPORTED_PROFILE -> 2;
            case COMPILATION_FAILED -> 3;
            case LINK_FAILED -> 4;
        };
    }

}
