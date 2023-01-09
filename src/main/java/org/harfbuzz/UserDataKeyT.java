package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data structure for holding user-data keys.
 */
public class UserDataKeyT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_user_data_key_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("unused")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link UserDataKeyT}
     * @return A new, uninitialized @{link UserDataKeyT}
     */
    public static UserDataKeyT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        UserDataKeyT newInstance = new UserDataKeyT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a UserDataKeyT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected UserDataKeyT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, UserDataKeyT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new UserDataKeyT(input);
    
    /**
     * A {@link UserDataKeyT.Builder} object constructs a {@link UserDataKeyT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link UserDataKeyT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final UserDataKeyT struct;
        
        private Builder() {
            struct = UserDataKeyT.allocate();
        }
        
        /**
         * Finish building the {@link UserDataKeyT} struct.
         * @return A new instance of {@code UserDataKeyT} with the fields 
         *         that were set in the Builder object.
         */
        public UserDataKeyT build() {
            return struct;
        }
        
        public Builder setUnused(byte unused) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unused"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), unused);
                return this;
            }
        }
    }
}
