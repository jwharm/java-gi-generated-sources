package org.harfbuzz;

/**
 * An integral type representing an OpenType 'name' table name identifier.
 * There are predefined name IDs, as well as name IDs return from other
 * API.  These can be used to fetch name strings from a font face.
 * <p>
 * For more information on these fields, see the
 * <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/name#name-ids">OpenType spec</a>.
 */
public class OtNameIdT extends io.github.jwharm.javagi.Alias<Integer> {
    public OtNameIdT(int value) {
        super(value);
    }
    
}
