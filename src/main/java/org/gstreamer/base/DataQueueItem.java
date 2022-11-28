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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("object"),
        Interop.valueLayout.C_INT.withName("size"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.C_LONG.withName("duration"),
        Interop.valueLayout.C_INT.withName("visible"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("destroy"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
    public org.gstreamer.gst.MiniObject object$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("object"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.MiniObject(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code object}
     * @param object The new value of the field {@code object}
     */
    public void object$set(org.gstreamer.gst.MiniObject object) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("object"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), object.handle());
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public int size$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void size$set(int size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
    }
    
    /**
     * Get the value of the field {@code duration}
     * @return The value of the field {@code duration}
     */
    public long duration$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("duration"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code duration}
     * @param duration The new value of the field {@code duration}
     */
    public void duration$set(long duration) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("duration"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), duration);
    }
    
    /**
     * Get the value of the field {@code visible}
     * @return The value of the field {@code visible}
     */
    public boolean visible$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("visible"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code visible}
     * @param visible The new value of the field {@code visible}
     */
    public void visible$set(boolean visible) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("visible"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), visible ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code destroy}
     * @return The value of the field {@code destroy}
     */
    public org.gtk.glib.DestroyNotify destroy$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a DataQueueItem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DataQueueItem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DataQueueItem struct;
        
         /**
         * A {@link DataQueueItem.Build} object constructs a {@link DataQueueItem} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DataQueueItem.allocate();
        }
        
         /**
         * Finish building the {@link DataQueueItem} struct.
         * @return A new instance of {@code DataQueueItem} with the fields 
         *         that were set in the Build object.
         */
        public DataQueueItem construct() {
            return struct;
        }
        
        /**
         * the {@link org.gstreamer.gst.MiniObject} to queue.
         * @param object The value for the {@code object} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setObject(org.gstreamer.gst.MiniObject object) {
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
        public Build setSize(int size) {
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
        public Build setDuration(long duration) {
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
        public Build setVisible(boolean visible) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("visible"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), visible ? 1 : 0);
            return this;
        }
        
        /**
         * The {@link org.gtk.glib.DestroyNotify} function to use to free the {@link DataQueueItem}.
         * This function should also drop the reference to {@code object} the owner of the
         * {@link DataQueueItem} is assumed to hold.
         * @param destroy The value for the {@code destroy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDestroy(java.lang.foreign.MemoryAddress destroy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroy == null ? MemoryAddress.NULL : destroy));
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
