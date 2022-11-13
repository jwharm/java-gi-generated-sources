package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure representing a setting for an {@link AatLayoutFeatureTypeT}.
 */
public class AatLayoutFeatureSelectorInfoT extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_aat_layout_feature_selector_info_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("name_id"),
        Interop.valueLayout.C_INT.withName("enable"),
        Interop.valueLayout.C_INT.withName("disable"),
        ValueLayout.JAVA_INT.withName("reserved")
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
    
    public static AatLayoutFeatureSelectorInfoT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AatLayoutFeatureSelectorInfoT newInstance = new AatLayoutFeatureSelectorInfoT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name_id}
     * @return The value of the field {@code name_id}
     */
    public org.harfbuzz.OtNameIdT name_id$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.OtNameIdT(RESULT);
    }
    
    /**
     * Change the value of the field {@code name_id}
     * @param name_id The new value of the field {@code name_id}
     */
    public void name_id$set(org.harfbuzz.OtNameIdT name_id) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), name_id.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code enable}
     * @return The value of the field {@code enable}
     */
    public org.harfbuzz.AatLayoutFeatureSelectorT enable$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("enable"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.AatLayoutFeatureSelectorT(RESULT);
    }
    
    /**
     * Change the value of the field {@code enable}
     * @param enable The new value of the field {@code enable}
     */
    public void enable$set(org.harfbuzz.AatLayoutFeatureSelectorT enable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("enable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), enable.getValue());
    }
    
    /**
     * Get the value of the field {@code disable}
     * @return The value of the field {@code disable}
     */
    public org.harfbuzz.AatLayoutFeatureSelectorT disable$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("disable"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.AatLayoutFeatureSelectorT(RESULT);
    }
    
    /**
     * Change the value of the field {@code disable}
     * @param disable The new value of the field {@code disable}
     */
    public void disable$set(org.harfbuzz.AatLayoutFeatureSelectorT disable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("disable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), disable.getValue());
    }
    
    /**
     * Create a AatLayoutFeatureSelectorInfoT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AatLayoutFeatureSelectorInfoT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
