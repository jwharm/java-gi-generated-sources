package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ClosureNotifyData extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GClosureNotifyData";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("data"),
            Interop.valueLayout.ADDRESS.withName("notify")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ClosureNotifyData}
     * @return A new, uninitialized @{link ClosureNotifyData}
     */
    public static ClosureNotifyData allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ClosureNotifyData newInstance = new ClosureNotifyData(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress getData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(java.lang.foreign.MemoryAddress data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
    }
    
    /**
     * Get the value of the field {@code notify}
     * @return The value of the field {@code notify}
     */
    public org.gtk.gobject.ClosureNotify getNotify() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("notify"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code notify}
     * @param notify The new value of the field {@code notify}
     */
    public void setNotify(org.gtk.gobject.ClosureNotify notify) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("notify"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
    }
    
    /**
     * Create a ClosureNotifyData proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ClosureNotifyData(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ClosureNotifyData> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ClosureNotifyData(input, ownership);
    
    /**
     * A {@link ClosureNotifyData.Builder} object constructs a {@link ClosureNotifyData} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ClosureNotifyData.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ClosureNotifyData struct;
        
        private Builder() {
            struct = ClosureNotifyData.allocate();
        }
        
         /**
         * Finish building the {@link ClosureNotifyData} struct.
         * @return A new instance of {@code ClosureNotifyData} with the fields 
         *         that were set in the Builder object.
         */
        public ClosureNotifyData build() {
            return struct;
        }
        
        public Builder setData(java.lang.foreign.MemoryAddress data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
            return this;
        }
        
        public Builder setNotify(org.gtk.gobject.ClosureNotify notify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
            return this;
        }
    }
}
