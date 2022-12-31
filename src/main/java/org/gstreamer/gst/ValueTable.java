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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_LONG.withName("type"),
            Interop.valueLayout.ADDRESS.withName("compare"),
            Interop.valueLayout.ADDRESS.withName("serialize"),
            Interop.valueLayout.ADDRESS.withName("deserialize"),
            Interop.valueLayout.ADDRESS.withName("deserialize_with_pspec"),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
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
    public org.gtk.glib.Type getType() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gtk.glib.Type type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
    }
    
    /**
     * Get the value of the field {@code compare}
     * @return The value of the field {@code compare}
     */
    public org.gstreamer.gst.ValueCompareFunc getCompare() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compare"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code compare}
     * @param compare The new value of the field {@code compare}
     */
    public void setCompare(org.gstreamer.gst.ValueCompareFunc compare) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compare"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (compare == null ? MemoryAddress.NULL : (Addressable) compare.toCallback()));
    }
    
    /**
     * Get the value of the field {@code serialize}
     * @return The value of the field {@code serialize}
     */
    public org.gstreamer.gst.ValueSerializeFunc getSerialize() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("serialize"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code serialize}
     * @param serialize The new value of the field {@code serialize}
     */
    public void setSerialize(org.gstreamer.gst.ValueSerializeFunc serialize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("serialize"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (serialize == null ? MemoryAddress.NULL : (Addressable) serialize.toCallback()));
    }
    
    /**
     * Get the value of the field {@code deserialize}
     * @return The value of the field {@code deserialize}
     */
    public org.gstreamer.gst.ValueDeserializeFunc getDeserialize() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("deserialize"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code deserialize}
     * @param deserialize The new value of the field {@code deserialize}
     */
    public void setDeserialize(org.gstreamer.gst.ValueDeserializeFunc deserialize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("deserialize"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deserialize == null ? MemoryAddress.NULL : (Addressable) deserialize.toCallback()));
    }
    
    /**
     * Get the value of the field {@code deserialize_with_pspec}
     * @return The value of the field {@code deserialize_with_pspec}
     */
    public org.gstreamer.gst.ValueDeserializeWithPSpecFunc getDeserializeWithPspec() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("deserialize_with_pspec"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code deserialize_with_pspec}
     * @param deserializeWithPspec The new value of the field {@code deserialize_with_pspec}
     */
    public void setDeserializeWithPspec(org.gstreamer.gst.ValueDeserializeWithPSpecFunc deserializeWithPspec) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("deserialize_with_pspec"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deserializeWithPspec == null ? MemoryAddress.NULL : (Addressable) deserializeWithPspec.toCallback()));
    }
    
    /**
     * Create a ValueTable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ValueTable(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ValueTable> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ValueTable(input, ownership);
    
    /**
     * A {@link ValueTable.Builder} object constructs a {@link ValueTable} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ValueTable.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ValueTable struct;
        
        private Builder() {
            struct = ValueTable.allocate();
        }
        
         /**
         * Finish building the {@link ValueTable} struct.
         * @return A new instance of {@code ValueTable} with the fields 
         *         that were set in the Builder object.
         */
        public ValueTable build() {
            return struct;
        }
        
        /**
         * a {@link org.gtk.glib.Type}
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gtk.glib.Type type) {
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
        public Builder setCompare(org.gstreamer.gst.ValueCompareFunc compare) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("compare"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (compare == null ? MemoryAddress.NULL : (Addressable) compare.toCallback()));
            return this;
        }
        
        /**
         * a {@link ValueSerializeFunc}
         * @param serialize The value for the {@code serialize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSerialize(org.gstreamer.gst.ValueSerializeFunc serialize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("serialize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (serialize == null ? MemoryAddress.NULL : (Addressable) serialize.toCallback()));
            return this;
        }
        
        /**
         * a {@link ValueDeserializeFunc}
         * @param deserialize The value for the {@code deserialize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDeserialize(org.gstreamer.gst.ValueDeserializeFunc deserialize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deserialize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deserialize == null ? MemoryAddress.NULL : (Addressable) deserialize.toCallback()));
            return this;
        }
        
        /**
         * a {@link ValueDeserializeWithPSpecFunc}
         * @param deserializeWithPspec The value for the {@code deserializeWithPspec} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDeserializeWithPspec(org.gstreamer.gst.ValueDeserializeWithPSpecFunc deserializeWithPspec) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deserialize_with_pspec"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deserializeWithPspec == null ? MemoryAddress.NULL : (Addressable) deserializeWithPspec.toCallback()));
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
