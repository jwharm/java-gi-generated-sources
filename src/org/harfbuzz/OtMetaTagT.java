package org.harfbuzz;

/**
 * Known metadata tags from https://docs.microsoft.com/en-us/typography/opentype/spec/meta
 */
public class OtMetaTagT {

    /**
     * Design languages. Text, using only
     * Basic Latin (ASCII) characters. Indicates languages and/or scripts
     * for the user audiences that the font was primarily designed for.
     */
    public static final OtMetaTagT DESIGN_LANGUAGES = new OtMetaTagT(1684827751);
    
    /**
     * Supported languages. Text, using
     * only Basic Latin (ASCII) characters. Indicates languages and/or scripts
     * that the font is declared to be capable of supporting.
     */
    public static final OtMetaTagT SUPPORTED_LANGUAGES = new OtMetaTagT(1936485991);
    
    private int value;
    
    public OtMetaTagT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(OtMetaTagT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
