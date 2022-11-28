package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * VTable for the {@link org.gtk.gobject.Value} {@code type}.
 */
public class ValueTable extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstValueTable";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_LONG.withName("type"),
        Interop.valueLayout.ADDRESS.withName("compare"),
        Interop.valueLayout.ADDRESS.withName("serialize"),
        Interop.valueLayout.ADDRESS.withName("deserialize"),
        Interop.valueLayout.ADDRESS.withName("deserialize_with_pspec"),
        MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link ValueTable}
     * @return A new, uninitialized @{link ValueTable}
     */
    public static ValueTable allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ValueTable newInstance = new ValueTable(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gtk.glib.Type type$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(org.gtk.glib.Type type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type.getValue().longValue());
    }
    
    /**
     * Get the value of the field {@code compare}
     * @return The value of the field {@code compare}
     */
    public org.gstreamer.gst.ValueCompareFunc compare$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compare"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code serialize}
     * @return The value of the field {@code serialize}
     */
    public org.gstreamer.gst.ValueSerializeFunc serialize$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("serialize"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code deserialize}
     * @return The value of the field {@code deserialize}
     */
    public org.gstreamer.gst.ValueDeserializeFunc deserialize$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("deserialize"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code deserialize_with_pspec}
     * @return The value of the field {@code deserialize_with_pspec}
     */
    public org.gstreamer.gst.ValueDeserializeWithPSpecFunc deserializeWithPspec$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("deserialize_with_pspec"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a ValueTable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ValueTable(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ValueTable struct;
        
         /**
         * A {@link ValueTable.Build} object constructs a {@link ValueTable} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ValueTable.allocate();
        }
        
         /**
         * Finish building the {@link ValueTable} struct.
         * @return A new instance of {@code ValueTable} with the fields 
         *         that were set in the Build object.
         */
        public ValueTable construct() {
            return struct;
        }
        
        /**
         * a {@link org.gtk.gobject.Type}
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setType(org.gtk.glib.Type type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
            return this;
        }
        
        /**
         * a {@link ValueCompareFunc}
         * @param compare The value for the {@code compare} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCompare(java.lang.foreign.MemoryAddress compare) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("compare"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (compare == null ? MemoryAddress.NULL : compare));
            return this;
        }
        
        /**
         * a {@link ValueSerializeFunc}
         * @param serialize The value for the {@code serialize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSerialize(java.lang.foreign.MemoryAddress serialize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("serialize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (serialize == null ? MemoryAddress.NULL : serialize));
            return this;
        }
        
        /**
         * a {@link ValueDeserializeFunc}
         * @param deserialize The value for the {@code deserialize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDeserialize(java.lang.foreign.MemoryAddress deserialize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deserialize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deserialize == null ? MemoryAddress.NULL : deserialize));
            return this;
        }
        
        /**
         * a {@link ValueDeserializeWithPSpecFunc}
         * @param deserializeWithPspec The value for the {@code deserializeWithPspec} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDeserializeWithPspec(java.lang.foreign.MemoryAddress deserializeWithPspec) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deserialize_with_pspec"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deserializeWithPspec == null ? MemoryAddress.NULL : deserializeWithPspec));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
