package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GParamSpec derived structure for arrays of values.
 */
public class ParamSpecArray extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstParamSpecArray";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("element_spec")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ParamSpecArray}
     * @return A new, uninitialized @{link ParamSpecArray}
     */
    public static ParamSpecArray allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ParamSpecArray newInstance = new ParamSpecArray(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.ParamSpec getParentInstance() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return (org.gtk.gobject.ParamSpec) Interop.register(((MemoryAddress) handle()).addOffset(OFFSET), org.gtk.gobject.ParamSpec.fromAddress).marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_instance}
     * @param parentInstance The new value of the field {@code parent_instance}
     */
    public void setParentInstance(org.gtk.gobject.ParamSpec parentInstance) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_instance"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentInstance == null ? MemoryAddress.NULL : parentInstance.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code element_spec}
     * @return The value of the field {@code element_spec}
     */
    public org.gtk.gobject.ParamSpec getElementSpec() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_spec"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return (org.gtk.gobject.ParamSpec) Interop.register(RESULT, org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code element_spec}
     * @param elementSpec The new value of the field {@code element_spec}
     */
    public void setElementSpec(org.gtk.gobject.ParamSpec elementSpec) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_spec"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (elementSpec == null ? MemoryAddress.NULL : elementSpec.handle()));
        }
    }
    
    /**
     * Create a ParamSpecArray proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ParamSpecArray(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpecArray> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpecArray(input);
    
    /**
     * A {@link ParamSpecArray.Builder} object constructs a {@link ParamSpecArray} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ParamSpecArray.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ParamSpecArray struct;
        
        private Builder() {
            struct = ParamSpecArray.allocate();
        }
        
        /**
         * Finish building the {@link ParamSpecArray} struct.
         * @return A new instance of {@code ParamSpecArray} with the fields 
         *         that were set in the Builder object.
         */
        public ParamSpecArray build() {
            return struct;
        }
        
        /**
         * super class
         * @param parentInstance The value for the {@code parentInstance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentInstance(org.gtk.gobject.ParamSpec parentInstance) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_instance"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentInstance == null ? MemoryAddress.NULL : parentInstance.handle()));
                return this;
            }
        }
        
        /**
         * the {@link org.gtk.gobject.ParamSpec} of the type of values in the array
         * @param elementSpec The value for the {@code elementSpec} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setElementSpec(org.gtk.gobject.ParamSpec elementSpec) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("element_spec"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (elementSpec == null ? MemoryAddress.NULL : elementSpec.handle()));
                return this;
            }
        }
    }
}
