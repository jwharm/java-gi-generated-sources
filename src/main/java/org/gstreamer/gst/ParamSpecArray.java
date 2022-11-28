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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("element_spec")
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
     * Allocate a new {@link ParamSpecArray}
     * @return A new, uninitialized @{link ParamSpecArray}
     */
    public static ParamSpecArray allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ParamSpecArray newInstance = new ParamSpecArray(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.ParamSpec parentInstance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.ParamSpec(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code element_spec}
     * @return The value of the field {@code element_spec}
     */
    public org.gtk.gobject.ParamSpec elementSpec$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("element_spec"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code element_spec}
     * @param elementSpec The new value of the field {@code element_spec}
     */
    public void elementSpec$set(org.gtk.gobject.ParamSpec elementSpec) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("element_spec"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), elementSpec.handle());
    }
    
    /**
     * Create a ParamSpecArray proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ParamSpecArray(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ParamSpecArray struct;
        
         /**
         * A {@link ParamSpecArray.Build} object constructs a {@link ParamSpecArray} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ParamSpecArray.allocate();
        }
        
         /**
         * Finish building the {@link ParamSpecArray} struct.
         * @return A new instance of {@code ParamSpecArray} with the fields 
         *         that were set in the Build object.
         */
        public ParamSpecArray construct() {
            return struct;
        }
        
        /**
         * super class
         * @param parentInstance The value for the {@code parentInstance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentInstance(org.gtk.gobject.ParamSpec parentInstance) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_instance"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentInstance == null ? MemoryAddress.NULL : parentInstance.handle()));
            return this;
        }
        
        /**
         * the {@link org.gtk.gobject.ParamSpec} of the type of values in the array
         * @param elementSpec The value for the {@code elementSpec} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setElementSpec(org.gtk.gobject.ParamSpec elementSpec) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_spec"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (elementSpec == null ? MemoryAddress.NULL : elementSpec.handle()));
            return this;
        }
    }
}
