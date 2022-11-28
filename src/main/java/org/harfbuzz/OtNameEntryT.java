package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure representing a name ID in a particular language.
 * @version 2.1.0
 */
public class OtNameEntryT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_name_entry_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("name_id"),
        MemoryLayout.paddingLayout(32),
        org.harfbuzz.VarIntT.getMemoryLayout().withName("var"),
        org.harfbuzz.LanguageT.getMemoryLayout().withName("language")
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
     * Allocate a new {@link OtNameEntryT}
     * @return A new, uninitialized @{link OtNameEntryT}
     */
    public static OtNameEntryT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OtNameEntryT newInstance = new OtNameEntryT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name_id}
     * @return The value of the field {@code name_id}
     */
    public org.harfbuzz.OtNameIdT nameId$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.OtNameIdT(RESULT);
    }
    
    /**
     * Change the value of the field {@code name_id}
     * @param nameId The new value of the field {@code name_id}
     */
    public void nameId$set(org.harfbuzz.OtNameIdT nameId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nameId.getValue().intValue());
    }
    
    /**
     * Create a OtNameEntryT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public OtNameEntryT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private OtNameEntryT struct;
        
         /**
         * A {@link OtNameEntryT.Build} object constructs a {@link OtNameEntryT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = OtNameEntryT.allocate();
        }
        
         /**
         * Finish building the {@link OtNameEntryT} struct.
         * @return A new instance of {@code OtNameEntryT} with the fields 
         *         that were set in the Build object.
         */
        public OtNameEntryT construct() {
            return struct;
        }
        
        /**
         * name ID
         * @param nameId The value for the {@code nameId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNameId(org.harfbuzz.OtNameIdT nameId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nameId == null ? MemoryAddress.NULL : nameId.getValue().intValue()));
            return this;
        }
        
        public Build setVar(org.harfbuzz.VarIntT var) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("var"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (var == null ? MemoryAddress.NULL : var.handle()));
            return this;
        }
        
        /**
         * language
         * @param language The value for the {@code language} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLanguage(org.harfbuzz.LanguageT language) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (language == null ? MemoryAddress.NULL : language.handle()));
            return this;
        }
    }
}
