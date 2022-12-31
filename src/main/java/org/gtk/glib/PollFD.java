package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents a file descriptor, which events to poll for, and which events
 * occurred.
 */
public class PollFD extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GPollFD";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("fd"),
            Interop.valueLayout.C_SHORT.withName("events"),
            Interop.valueLayout.C_SHORT.withName("revents")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PollFD}
     * @return A new, uninitialized @{link PollFD}
     */
    public static PollFD allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PollFD newInstance = new PollFD(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code fd}
     * @return The value of the field {@code fd}
     */
    public int getFd() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fd"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code fd}
     * @param fd The new value of the field {@code fd}
     */
    public void setFd(int fd) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fd"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), fd);
    }
    
    /**
     * Get the value of the field {@code events}
     * @return The value of the field {@code events}
     */
    public short getEvents() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("events"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code events}
     * @param events The new value of the field {@code events}
     */
    public void setEvents(short events) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("events"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), events);
    }
    
    /**
     * Get the value of the field {@code revents}
     * @return The value of the field {@code revents}
     */
    public short getRevents() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("revents"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code revents}
     * @param revents The new value of the field {@code revents}
     */
    public void setRevents(short revents) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("revents"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), revents);
    }
    
    /**
     * Create a PollFD proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PollFD(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PollFD> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PollFD(input, ownership);
    
    /**
     * A {@link PollFD.Builder} object constructs a {@link PollFD} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PollFD.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PollFD struct;
        
        private Builder() {
            struct = PollFD.allocate();
        }
        
         /**
         * Finish building the {@link PollFD} struct.
         * @return A new instance of {@code PollFD} with the fields 
         *         that were set in the Builder object.
         */
        public PollFD build() {
            return struct;
        }
        
        /**
         * the file descriptor to poll (or a HANDLE on Win32)
         * @param fd The value for the {@code fd} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFd(int fd) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fd"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), fd);
            return this;
        }
        
        /**
         * a bitwise combination from {@link IOCondition}, specifying which
         *     events should be polled for. Typically for reading from a file
         *     descriptor you would use {@link IOCondition#IN} | {@link IOCondition#HUP} | {@link IOCondition#ERR}, and
         *     for writing you would use {@link IOCondition#OUT} | {@link IOCondition#ERR}.
         * @param events The value for the {@code events} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEvents(short events) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("events"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), events);
            return this;
        }
        
        /**
         * a bitwise combination of flags from {@link IOCondition}, returned
         *     from the poll() function to indicate which events occurred.
         * @param revents The value for the {@code revents} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRevents(short revents) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("revents"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), revents);
            return this;
        }
    }
}
