package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GObjectConstructParam struct is an auxiliary structure used to hand
 * {@link ParamSpec}/{@link Value} pairs to the {@code constructor} of a {@link ObjectClass}.
 */
public class ObjectConstructParam extends Struct {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GObjectConstructParam";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("pspec"),
        Interop.valueLayout.ADDRESS.withName("value")
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
     * Allocate a new {@link ObjectConstructParam}
     * @return A new, uninitialized @{link ObjectConstructParam}
     */
    public static ObjectConstructParam allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ObjectConstructParam newInstance = new ObjectConstructParam(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code pspec}
     * @return The value of the field {@code pspec}
     */
    public org.gtk.gobject.ParamSpec pspec$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pspec"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code pspec}
     * @param pspec The new value of the field {@code pspec}
     */
    public void pspec$set(org.gtk.gobject.ParamSpec pspec) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pspec"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pspec.handle());
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public org.gtk.gobject.Value value$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.Value(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void value$set(org.gtk.gobject.Value value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), value.handle());
    }
    
    /**
     * Create a ObjectConstructParam proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ObjectConstructParam(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ObjectConstructParam struct;
        
         /**
         * A {@link ObjectConstructParam.Build} object constructs a {@link ObjectConstructParam} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ObjectConstructParam.allocate();
        }
        
         /**
         * Finish building the {@link ObjectConstructParam} struct.
         * @return A new instance of {@code ObjectConstructParam} with the fields 
         *         that were set in the Build object.
         */
        public ObjectConstructParam construct() {
            return struct;
        }
        
        /**
         * the {@link ParamSpec} of the construct parameter
         * @param pspec The value for the {@code pspec} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPspec(org.gtk.gobject.ParamSpec pspec) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pspec"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pspec == null ? MemoryAddress.NULL : pspec.handle()));
            return this;
        }
        
        /**
         * the value to set the parameter to
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValue(org.gtk.gobject.Value value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : value.handle()));
            return this;
        }
    }
}
