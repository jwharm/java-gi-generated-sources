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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("name_id"),
            MemoryLayout.paddingLayout(32),
            org.harfbuzz.VarIntT.getMemoryLayout().withName("var"),
            org.harfbuzz.LanguageT.getMemoryLayout().withName("language")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link OtNameEntryT}
     * @return A new, uninitialized @{link OtNameEntryT}
     */
    public static OtNameEntryT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        OtNameEntryT newInstance = new OtNameEntryT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name_id}
     * @return The value of the field {@code name_id}
     */
    public org.harfbuzz.OtNameIdT getNameId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.harfbuzz.OtNameIdT(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code name_id}
     * @param nameId The new value of the field {@code name_id}
     */
    public void setNameId(org.harfbuzz.OtNameIdT nameId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nameId == null ? MemoryAddress.NULL : nameId.getValue().intValue()));
        }
    }
    
    /**
     * Create a OtNameEntryT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected OtNameEntryT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, OtNameEntryT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new OtNameEntryT(input);
    
    /**
     * A {@link OtNameEntryT.Builder} object constructs a {@link OtNameEntryT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link OtNameEntryT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final OtNameEntryT struct;
        
        private Builder() {
            struct = OtNameEntryT.allocate();
        }
        
        /**
         * Finish building the {@link OtNameEntryT} struct.
         * @return A new instance of {@code OtNameEntryT} with the fields 
         *         that were set in the Builder object.
         */
        public OtNameEntryT build() {
            return struct;
        }
        
        /**
         * name ID
         * @param nameId The value for the {@code nameId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNameId(org.harfbuzz.OtNameIdT nameId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nameId == null ? MemoryAddress.NULL : nameId.getValue().intValue()));
                return this;
            }
        }
        
        public Builder setVar(org.harfbuzz.VarIntT var) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("var"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (var == null ? MemoryAddress.NULL : var.handle()));
                return this;
            }
        }
        
        /**
         * language
         * @param language The value for the {@code language} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLanguage(org.harfbuzz.LanguageT language) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("language"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (language == null ? MemoryAddress.NULL : language.handle()));
                return this;
            }
        }
    }
}
