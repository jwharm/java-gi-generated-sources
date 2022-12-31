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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("value"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("nick"),
            Interop.valueLayout.ADDRESS.withName("description"),
            Interop.valueLayout.C_INT.withName("quark")
        ).withName(C_TYPE_NAME);
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
    public org.gstreamer.gst.Format getValue() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.Format.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(org.gstreamer.gst.Format value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : value.getValue()));
    }
    
    /**
     * Get the value of the field {@code nick}
     * @return The value of the field {@code nick}
     */
    public java.lang.String getNick() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nick"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code nick}
     * @param nick The new value of the field {@code nick}
     */
    public void setNick(java.lang.String nick) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nick"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nick == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(nick, null)));
    }
    
    /**
     * Get the value of the field {@code description}
     * @return The value of the field {@code description}
     */
    public java.lang.String getDescription() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code description}
     * @param description The new value of the field {@code description}
     */
    public void setDescription(java.lang.String description) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, null)));
    }
    
    /**
     * Get the value of the field {@code quark}
     * @return The value of the field {@code quark}
     */
    public org.gtk.glib.Quark getQuark() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("quark"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Change the value of the field {@code quark}
     * @param quark The new value of the field {@code quark}
     */
    public void setQuark(org.gtk.glib.Quark quark) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("quark"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (quark == null ? MemoryAddress.NULL : quark.getValue().intValue()));
    }
    
    /**
     * Create a FormatDefinition proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FormatDefinition(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FormatDefinition> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FormatDefinition(input, ownership);
    
    /**
     * A {@link FormatDefinition.Builder} object constructs a {@link FormatDefinition} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FormatDefinition.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FormatDefinition struct;
        
        private Builder() {
            struct = FormatDefinition.allocate();
        }
        
         /**
         * Finish building the {@link FormatDefinition} struct.
         * @return A new instance of {@code FormatDefinition} with the fields 
         *         that were set in the Builder object.
         */
        public FormatDefinition build() {
            return struct;
        }
        
        /**
         * The unique id of this format
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(org.gstreamer.gst.Format value) {
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
        public Builder setNick(java.lang.String nick) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nick"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nick == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(nick, null)));
            return this;
        }
        
        /**
         * A longer description of the format
         * @param description The value for the {@code description} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDescription(java.lang.String description) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, null)));
            return this;
        }
        
        /**
         * A quark for the nick
         * @param quark The value for the {@code quark} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setQuark(org.gtk.glib.Quark quark) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("quark"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (quark == null ? MemoryAddress.NULL : quark.getValue().intValue()));
            return this;
        }
    }
}
