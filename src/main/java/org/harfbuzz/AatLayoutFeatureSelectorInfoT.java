package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure representing a setting for an {@link AatLayoutFeatureTypeT}.
 */
public class AatLayoutFeatureSelectorInfoT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_aat_layout_feature_selector_info_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("name_id"),
            Interop.valueLayout.C_INT.withName("enable"),
            Interop.valueLayout.C_INT.withName("disable"),
            Interop.valueLayout.C_INT.withName("reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AatLayoutFeatureSelectorInfoT}
     * @return A new, uninitialized @{link AatLayoutFeatureSelectorInfoT}
     */
    public static AatLayoutFeatureSelectorInfoT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AatLayoutFeatureSelectorInfoT newInstance = new AatLayoutFeatureSelectorInfoT(segment.address());
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
     * Get the value of the field {@code enable}
     * @return The value of the field {@code enable}
     */
    public org.harfbuzz.AatLayoutFeatureSelectorT getEnable() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enable"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.harfbuzz.AatLayoutFeatureSelectorT.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code enable}
     * @param enable The new value of the field {@code enable}
     */
    public void setEnable(org.harfbuzz.AatLayoutFeatureSelectorT enable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enable == null ? MemoryAddress.NULL : enable.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code disable}
     * @return The value of the field {@code disable}
     */
    public org.harfbuzz.AatLayoutFeatureSelectorT getDisable() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("disable"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.harfbuzz.AatLayoutFeatureSelectorT.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code disable}
     * @param disable The new value of the field {@code disable}
     */
    public void setDisable(org.harfbuzz.AatLayoutFeatureSelectorT disable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("disable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (disable == null ? MemoryAddress.NULL : disable.getValue()));
        }
    }
    
    /**
     * Create a AatLayoutFeatureSelectorInfoT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AatLayoutFeatureSelectorInfoT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AatLayoutFeatureSelectorInfoT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AatLayoutFeatureSelectorInfoT(input);
    
    /**
     * A {@link AatLayoutFeatureSelectorInfoT.Builder} object constructs a {@link AatLayoutFeatureSelectorInfoT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AatLayoutFeatureSelectorInfoT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AatLayoutFeatureSelectorInfoT struct;
        
        private Builder() {
            struct = AatLayoutFeatureSelectorInfoT.allocate();
        }
        
        /**
         * Finish building the {@link AatLayoutFeatureSelectorInfoT} struct.
         * @return A new instance of {@code AatLayoutFeatureSelectorInfoT} with the fields 
         *         that were set in the Builder object.
         */
        public AatLayoutFeatureSelectorInfoT build() {
            return struct;
        }
        
        /**
         * The selector's name identifier
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
        
        /**
         * The value to turn the selector on
         * @param enable The value for the {@code enable} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnable(org.harfbuzz.AatLayoutFeatureSelectorT enable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("enable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enable == null ? MemoryAddress.NULL : enable.getValue()));
                return this;
            }
        }
        
        /**
         * The value to turn the selector off
         * @param disable The value for the {@code disable} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisable(org.harfbuzz.AatLayoutFeatureSelectorT disable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("disable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (disable == null ? MemoryAddress.NULL : disable.getValue()));
                return this;
            }
        }
        
        public Builder setReserved(int reserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), reserved);
                return this;
            }
        }
    }
}
