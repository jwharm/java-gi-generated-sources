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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ClockEntry newInstance = new ClockEntry(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code refcount}
     * @return The value of the field {@code refcount}
     */
    public int getRefcount() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("refcount"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code refcount}
     * @param refcount The new value of the field {@code refcount}
     */
    public void setRefcount(int refcount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("refcount"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), refcount);
        }
    }
    
    /**
     * Create a ClockEntry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ClockEntry(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ClockEntry> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ClockEntry(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("refcount"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), refcount);
                return this;
            }
        }
        
        public Builder setClock(org.gstreamer.gst.Clock clock) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("clock"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (clock == null ? MemoryAddress.NULL : clock.handle()));
                return this;
            }
        }
        
        public Builder setType(org.gstreamer.gst.ClockEntryType type) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
                return this;
            }
        }
        
        public Builder setTime(org.gstreamer.gst.ClockTime time) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("time"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (time == null ? MemoryAddress.NULL : time.getValue().longValue()));
                return this;
            }
        }
        
        public Builder setInterval(org.gstreamer.gst.ClockTime interval) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("interval"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interval == null ? MemoryAddress.NULL : interval.getValue().longValue()));
                return this;
            }
        }
        
        public Builder setStatus(org.gstreamer.gst.ClockReturn status) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("status"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (status == null ? MemoryAddress.NULL : status.getValue()));
                return this;
            }
        }
        
        public Builder setFunc(org.gstreamer.gst.ClockCallback func) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()));
                return this;
            }
        }
        
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
                return this;
            }
        }
        
        public Builder setDestroyData(org.gtk.glib.DestroyNotify destroyData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("destroy_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (destroyData == null ? MemoryAddress.NULL : (Addressable) destroyData.toCallback()));
                return this;
            }
        }
        
        public Builder setUnscheduled(boolean unscheduled) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unscheduled"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(unscheduled, null).intValue());
                return this;
            }
        }
        
        public Builder setWokenUp(boolean wokenUp) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("woken_up"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(wokenUp, null).intValue());
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
