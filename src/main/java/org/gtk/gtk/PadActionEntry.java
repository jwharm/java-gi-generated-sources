package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Struct defining a pad action entry.
 */
public class PadActionEntry extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPadActionEntry";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("type"),
            Interop.valueLayout.C_INT.withName("index"),
            Interop.valueLayout.C_INT.withName("mode"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("label"),
            Interop.valueLayout.ADDRESS.withName("action_name")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PadActionEntry}
     * @return A new, uninitialized @{link PadActionEntry}
     */
    public static PadActionEntry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PadActionEntry newInstance = new PadActionEntry(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gtk.gtk.PadActionType getType() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.gtk.PadActionType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gtk.gtk.PadActionType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
    }
    
    /**
     * Get the value of the field {@code index}
     * @return The value of the field {@code index}
     */
    public int getIndex() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("index"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code index}
     * @param index The new value of the field {@code index}
     */
    public void setIndex(int index) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), index);
    }
    
    /**
     * Get the value of the field {@code mode}
     * @return The value of the field {@code mode}
     */
    public int getMode() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code mode}
     * @param mode The new value of the field {@code mode}
     */
    public void setMode(int mode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), mode);
    }
    
    /**
     * Get the value of the field {@code label}
     * @return The value of the field {@code label}
     */
    public java.lang.String getLabel() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("label"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code label}
     * @param label The new value of the field {@code label}
     */
    public void setLabel(java.lang.String label) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("label"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)));
    }
    
    /**
     * Get the value of the field {@code action_name}
     * @return The value of the field {@code action_name}
     */
    public java.lang.String getActionName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("action_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code action_name}
     * @param actionName The new value of the field {@code action_name}
     */
    public void setActionName(java.lang.String actionName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("action_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (actionName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(actionName, null)));
    }
    
    /**
     * Create a PadActionEntry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PadActionEntry(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PadActionEntry> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PadActionEntry(input, ownership);
    
    /**
     * A {@link PadActionEntry.Builder} object constructs a {@link PadActionEntry} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PadActionEntry.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PadActionEntry struct;
        
        private Builder() {
            struct = PadActionEntry.allocate();
        }
        
         /**
         * Finish building the {@link PadActionEntry} struct.
         * @return A new instance of {@code PadActionEntry} with the fields 
         *         that were set in the Builder object.
         */
        public PadActionEntry build() {
            return struct;
        }
        
        /**
         * the type of pad feature that will trigger this action entry.
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gtk.gtk.PadActionType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        /**
         * the 0-indexed button/ring/strip number that will trigger this action
         *   entry.
         * @param index The value for the {@code index} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIndex(int index) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("index"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), index);
            return this;
        }
        
        /**
         * the mode that will trigger this action entry, or -1 for all modes.
         * @param mode The value for the {@code mode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMode(int mode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), mode);
            return this;
        }
        
        /**
         * Human readable description of this action entry, this string should
         *   be deemed user-visible.
         * @param label The value for the {@code label} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLabel(java.lang.String label) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("label"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)));
            return this;
        }
        
        /**
         * action name that will be activated in the {@code GActionGroup}.
         * @param actionName The value for the {@code actionName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActionName(java.lang.String actionName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("action_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (actionName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(actionName, null)));
            return this;
        }
    }
}
