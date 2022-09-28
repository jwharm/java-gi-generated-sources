package org.harfbuzz;

/**
 * An integral type representing an OpenType 'name' table name identifier.
 * There are predefined name IDs, as well as name IDs return from other
 * API.  These can be used to fetch name strings from a font face.
 * <p>
 * For more information on these fields, see the
 * <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/name#name-ids">OpenType spec</a>.
 */
public class OtNameIdT {
    private int value;
    
    public OtNameIdT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(OtNameIdT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
