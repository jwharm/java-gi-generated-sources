package org.gtk.gio;

/**
 * GEmblemOrigin is used to add information about the origin of the emblem
 * to #GEmblem.
 */
public enum EmblemOrigin {

    /**
     * Emblem of unknown origin
     */
    UNKNOWN,
    
    /**
     * Emblem adds device-specific information
     */
    DEVICE,
    
    /**
     * Emblem depicts live metadata, such as "readonly"
     */
    LIVEMETADATA,
    
    /**
     * Emblem comes from a user-defined tag, e.g. set by nautilus (in the future)
     */
    TAG;
    
    public static EmblemOrigin fromValue(int value) {
        return switch(value) {
            case 0 -> UNKNOWN;
            case 1 -> DEVICE;
            case 2 -> LIVEMETADATA;
            case 3 -> TAG;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNKNOWN -> 0;
            case DEVICE -> 1;
            case LIVEMETADATA -> 2;
            case TAG -> 3;
        };
    }

}
