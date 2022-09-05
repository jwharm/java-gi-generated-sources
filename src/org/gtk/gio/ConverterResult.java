package org.gtk.gio;

/**
 * Results returned from g_converter_convert().
 */
public enum ConverterResult {

    /**
     * There was an error during conversion.
     */
    ERROR,
    
    /**
     * Some data was consumed or produced
     */
    CONVERTED,
    
    /**
     * The conversion is finished
     */
    FINISHED,
    
    /**
     * Flushing is finished
     */
    FLUSHED;
    
    public static ConverterResult fromValue(int value) {
        return switch(value) {
            case 0 -> ERROR;
            case 1 -> CONVERTED;
            case 2 -> FINISHED;
            case 3 -> FLUSHED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ERROR -> 0;
            case CONVERTED -> 1;
            case FINISHED -> 2;
            case FLUSHED -> 3;
        };
    }

}
