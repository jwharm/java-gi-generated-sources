package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure used by {@link DataQueue}. You can supply a different structure, as
 * long as the top of the structure is identical to this structure.
 */
public class DataQueueItem extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDataQueueItem";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("object"),
            Interop.valueLayout.C_INT.withName("size"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("duration"),
            Interop.valueLayout.C_INT.withName("visible"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("destroy"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DataQueueItem}
     * @return A new, uninitialized @{link DataQueueItem}
     */
    public static DataQueueItem allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DataQueueItem newInstance = new DataQueueItem(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code object}
     * @return The value of the field {@code object}
     */
    public org.gstreamer.gst.MiniObject getObject() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("object"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.MiniObject.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code object}
     * @param object The new value of the field {@code object}
     */
    public void setObject(org.gstreamer.gst.MiniObject object) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("object"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (object == null ? MemoryAddress.NULL : object.handle()));
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public int getSize() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void setSize(int size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
    }
    
    /**
     * Get the value of the field {@code duration}
     * @return The value of the field {@code duration}
     */
    public long getDuration() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("duration"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code duration}
     * @param duration The new value of the field {@code duration}
     */
    public void setDuration(long duration) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("duration"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), duration);
    }
    
    /**
     * Get the value of the field {@code visible}
     * @return The value of the field {@code visible}
     */
    public boolean getVisible() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("visible"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code visible}
     * @param visible The new value of the field {@code visible}
     */
    public void setVisible(boolean visible) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("visible"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(visible, null).intValue());
    }
    
    /**
     * Get the value of the field {@code destroy}
     * @return The value of the field {@code destroy}
     */
    public org.gtk.glib.DestroyNotify getDestroy() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code destroy}
     * @param destroy The new value of the field {@code destroy}
     */
    public void setDestroy(org.gtk.glib.DestroyNotify destroy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
    }
    
    /**
     * Create a DataQueueItem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DataQueueItem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DataQueueItem> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DataQueueItem(input, ownership);
    
    /**
     * A {@link DataQueueItem.Builder} object constructs a {@link DataQueueItem} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DataQueueItem.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DataQueueItem struct;
        
        private Builder() {
            struct = DataQueueItem.allocate();
        }
        
         /**
         * Finish building the {@link DataQueueItem} struct.
         * @return A new instance of {@code DataQueueItem} with the fields 
         *         that were set in the Builder object.
         */
        public DataQueueItem build() {
            return struct;
        }
        
        /**
         * the {@link org.gstreamer.gst.MiniObject} to queue.
         * @param object The value for the {@code object} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setObject(org.gstreamer.gst.MiniObject object) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (object == null ? MemoryAddress.NULL : object.handle()));
            return this;
        }
        
        /**
         * the size in bytes of the miniobject.
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(int size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
            return this;
        }
        
        /**
         * the duration in {@link org.gstreamer.gst.ClockTime} of the miniobject. Can not be
         * {@code GST_CLOCK_TIME_NONE}.
         * @param duration The value for the {@code duration} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDuration(long duration) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duration"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), duration);
            return this;
        }
        
        /**
         * {@code true} if {@code object} should be considered as a visible object.
         * @param visible The value for the {@code visible} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVisible(boolean visible) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("visible"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(visible, null).intValue());
            return this;
        }
        
        /**
         * The {@link org.gtk.glib.DestroyNotify} function to use to free the {@link DataQueueItem}.
         * This function should also drop the reference to {@code object} the owner of the
         * {@link DataQueueItem} is assumed to hold.
         * @param destroy The value for the {@code destroy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDestroy(org.gtk.glib.DestroyNotify destroy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
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
