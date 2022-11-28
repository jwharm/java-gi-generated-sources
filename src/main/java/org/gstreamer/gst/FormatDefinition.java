package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A format definition
 */
public class FormatDefinition extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstFormatDefinition";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("value"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("nick"),
        Interop.valueLayout.ADDRESS.withName("description"),
        Interop.valueLayout.C_INT.withName("quark")
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
     * Allocate a new {@link FormatDefinition}
     * @return A new, uninitialized @{link FormatDefinition}
     */
    public static FormatDefinition allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FormatDefinition newInstance = new FormatDefinition(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public org.gstreamer.gst.Format value$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Format(RESULT);
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void value$set(org.gstreamer.gst.Format value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), value.getValue());
    }
    
    /**
     * Get the value of the field {@code nick}
     * @return The value of the field {@code nick}
     */
    public java.lang.String nick$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nick"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code nick}
     * @param nick The new value of the field {@code nick}
     */
    public void nick$set(java.lang.String nick) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nick"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(nick));
    }
    
    /**
     * Get the value of the field {@code description}
     * @return The value of the field {@code description}
     */
    public java.lang.String description$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code description}
     * @param description The new value of the field {@code description}
     */
    public void description$set(java.lang.String description) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(description));
    }
    
    /**
     * Get the value of the field {@code quark}
     * @return The value of the field {@code quark}
     */
    public org.gtk.glib.Quark quark$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("quark"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Change the value of the field {@code quark}
     * @param quark The new value of the field {@code quark}
     */
    public void quark$set(org.gtk.glib.Quark quark) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("quark"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), quark.getValue().intValue());
    }
    
    /**
     * Create a FormatDefinition proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FormatDefinition(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private FormatDefinition struct;
        
         /**
         * A {@link FormatDefinition.Build} object constructs a {@link FormatDefinition} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = FormatDefinition.allocate();
        }
        
         /**
         * Finish building the {@link FormatDefinition} struct.
         * @return A new instance of {@code FormatDefinition} with the fields 
         *         that were set in the Build object.
         */
        public FormatDefinition construct() {
            return struct;
        }
        
        /**
         * The unique id of this format
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValue(org.gstreamer.gst.Format value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : value.getValue()));
            return this;
        }
        
        /**
         * A short nick of the format
         * @param nick The value for the {@code nick} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNick(java.lang.String nick) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nick"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)));
            return this;
        }
        
        /**
         * A longer description of the format
         * @param description The value for the {@code description} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDescription(java.lang.String description) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (description == null ? MemoryAddress.NULL : Interop.allocateNativeString(description)));
            return this;
        }
        
        /**
         * A quark for the nick
         * @param quark The value for the {@code quark} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setQuark(org.gtk.glib.Quark quark) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("quark"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (quark == null ? MemoryAddress.NULL : quark.getValue().intValue()));
            return this;
        }
    }
}
