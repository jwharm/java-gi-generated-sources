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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_BYTE.withName("unused")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link UserDataKeyT}
     * @return A new, uninitialized @{link UserDataKeyT}
     */
    public static UserDataKeyT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        UserDataKeyT newInstance = new UserDataKeyT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a UserDataKeyT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public UserDataKeyT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private UserDataKeyT struct;
        
         /**
         * A {@link UserDataKeyT.Build} object constructs a {@link UserDataKeyT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = UserDataKeyT.allocate();
        }
        
         /**
         * Finish building the {@link UserDataKeyT} struct.
         * @return A new instance of {@code UserDataKeyT} with the fields 
         *         that were set in the Build object.
         */
        public UserDataKeyT construct() {
            return struct;
        }
        
        public Build setUnused(byte unused) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unused"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), unused);
            return this;
        }
    }
}
