package org.harfbuzz;

/**
 * Known metadata tags from https://docs.microsoft.com/en-us/typography/opentype/spec/meta
 */
public enum OtMetaTagT {

    /**
     * Design languages. Text, using only
     * Basic Latin (ASCII) characters. Indicates languages and/or scripts
     * for the user audiences that the font was primarily designed for.
     */
    DESIGN_LANGUAGES,
    
    /**
     * Supported languages. Text, using
     * only Basic Latin (ASCII) characters. Indicates languages and/or scripts
     * that the font is declared to be capable of supporting.
     */
    SUPPORTED_LANGUAGES;
    
    public static OtMetaTagT fromValue(int value) {
        return switch(value) {
            case 1684827751 -> DESIGN_LANGUAGES;
            case 1936485991 -> SUPPORTED_LANGUAGES;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DESIGN_LANGUAGES -> 1684827751;
            case SUPPORTED_LANGUAGES -> 1936485991;
        };
    }

}
