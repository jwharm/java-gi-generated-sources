package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Known metadata tags from https://docs.microsoft.com/en-us/typography/opentype/spec/meta
 * @version 2.6.0
 */
public enum OtMetaTagT implements io.github.jwharm.javagi.Enumeration {
    /**
     * Design languages. Text, using only
     * Basic Latin (ASCII) characters. Indicates languages and/or scripts
     * for the user audiences that the font was primarily designed for.
     */
    DESIGN_LANGUAGES(1684827751),
    /**
     * Supported languages. Text, using
     * only Basic Latin (ASCII) characters. Indicates languages and/or scripts
     * that the font is declared to be capable of supporting.
     */
    SUPPORTED_LANGUAGES(1936485991);
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_meta_tag_t";
    
    private final int value;
    OtMetaTagT(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static OtMetaTagT of(int value) {
        return switch (value) {
            case 1684827751 -> DESIGN_LANGUAGES;
            case 1936485991 -> SUPPORTED_LANGUAGES;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
