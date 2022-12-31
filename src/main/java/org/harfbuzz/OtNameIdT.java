package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    @ApiStatus.Internal
    public static OtNameIdT[] fromNativeArray(MemoryAddress address, long length) {
        OtNameIdT[] array = new OtNameIdT[(int) length];
        long bytesSize = Interop.valueLayout.C_INT.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new OtNameIdT(address.get(Interop.valueLayout.C_INT, i * bytesSize));
        }
        return array;
    }
}
