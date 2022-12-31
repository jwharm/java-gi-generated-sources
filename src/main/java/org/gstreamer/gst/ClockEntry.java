package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * All pending timeouts or periodic notifies are converted into
 * an entry.
 * Note that GstClockEntry should be treated as an opaque structure. It must
 * not be extended or allocated using a custom allocator.
 */
public class ClockEntry extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstClockEntry";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("refcount"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("clock"),
            Interop.valueLayout.C_INT.withName("type"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("time"),
            Interop.valueLayout.C_LONG.withName("interval"),
            Interop.valueLayout.C_INT.withName("status"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("func"),
            Interop.valueLayout.ADDRESS.withName("user_data"),
            Interop.valueLayout.ADDRESS.withName("destroy_data"),
            Interop.valueLayout.C_INT.withName("unscheduled"),
            Interop.valueLayout.C_INT.withName("woken_up"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ClockEntry}
     * @return A new, uninitialized @{link ClockEntry}
     */
    public static ClockEntry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ClockEntry newInstance = new ClockEntry(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code refcount}
     * @return The value of the field {@code refcount}
     */
    public int getRefcount() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("refcount"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code refcount}
     * @param refcount The new value of the field {@code refcount}
     */
    public void setRefcount(int refcount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("refcount"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), refcount);
    }
    
    /**
     * Create a ClockEntry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ClockEntry(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ClockEntry> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ClockEntry(input, ownership);
    
    /**
     * A {@link ClockEntry.Builder} object constructs a {@link ClockEntry} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ClockEntry.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ClockEntry struct;
        
        private Builder() {
            struct = ClockEntry.allocate();
        }
        
         /**
         * Finish building the {@link ClockEntry} struct.
         * @return A new instance of {@code ClockEntry} with the fields 
         *         that were set in the Builder object.
         */
        public ClockEntry build() {
            return struct;
        }
        
        /**
         * reference counter (read-only)
         * @param refcount The value for the {@code refcount} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRefcount(int refcount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("refcount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), refcount);
            return this;
        }
        
        public Builder setClock(org.gstreamer.gst.Clock clock) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clock"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clock == null ? MemoryAddress.NULL : clock.handle()));
            return this;
        }
        
        public Builder setType(org.gstreamer.gst.ClockEntryType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        public Builder setTime(org.gstreamer.gst.ClockTime time) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (time == null ? MemoryAddress.NULL : time.getValue().longValue()));
            return this;
        }
        
        public Builder setInterval(org.gstreamer.gst.ClockTime interval) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interval"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interval == null ? MemoryAddress.NULL : interval.getValue().longValue()));
            return this;
        }
        
        public Builder setStatus(org.gstreamer.gst.ClockReturn status) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("status"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (status == null ? MemoryAddress.NULL : status.getValue()));
            return this;
        }
        
        public Builder setFunc(org.gstreamer.gst.ClockCallback func) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()));
            return this;
        }
        
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        public Builder setDestroyData(org.gtk.glib.DestroyNotify destroyData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroyData == null ? MemoryAddress.NULL : (Addressable) destroyData.toCallback()));
            return this;
        }
        
        public Builder setUnscheduled(boolean unscheduled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unscheduled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(unscheduled, null).intValue());
            return this;
        }
        
        public Builder setWokenUp(boolean wokenUp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("woken_up"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(wokenUp, null).intValue());
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
