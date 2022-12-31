package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GOptionEntry struct defines a single option. To have an effect, they
 * must be added to a {@link OptionGroup} with g_option_context_add_main_entries()
 * or g_option_group_add_entries().
 */
public class OptionEntry extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GOptionEntry";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("long_name"),
            Interop.valueLayout.C_BYTE.withName("short_name"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("flags"),
            Interop.valueLayout.C_INT.withName("arg"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("arg_data"),
            Interop.valueLayout.ADDRESS.withName("description"),
            Interop.valueLayout.ADDRESS.withName("arg_description")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link OptionEntry}
     * @return A new, uninitialized @{link OptionEntry}
     */
    public static OptionEntry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OptionEntry newInstance = new OptionEntry(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code long_name}
     * @return The value of the field {@code long_name}
     */
    public java.lang.String getLongName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("long_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code long_name}
     * @param longName The new value of the field {@code long_name}
     */
    public void setLongName(java.lang.String longName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("long_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (longName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(longName, null)));
    }
    
    /**
     * Get the value of the field {@code short_name}
     * @return The value of the field {@code short_name}
     */
    public byte getShortName() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("short_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code short_name}
     * @param shortName The new value of the field {@code short_name}
     */
    public void setShortName(byte shortName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("short_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), shortName);
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public int getFlags() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(int flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
    }
    
    /**
     * Get the value of the field {@code arg}
     * @return The value of the field {@code arg}
     */
    public org.gtk.glib.OptionArg getArg() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("arg"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.OptionArg.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code arg}
     * @param arg The new value of the field {@code arg}
     */
    public void setArg(org.gtk.glib.OptionArg arg) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("arg"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (arg == null ? MemoryAddress.NULL : arg.getValue()));
    }
    
    /**
     * Get the value of the field {@code arg_data}
     * @return The value of the field {@code arg_data}
     */
    public java.lang.foreign.MemoryAddress getArgData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("arg_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code arg_data}
     * @param argData The new value of the field {@code arg_data}
     */
    public void setArgData(java.lang.foreign.MemoryAddress argData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("arg_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (argData == null ? MemoryAddress.NULL : (Addressable) argData));
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
     * Get the value of the field {@code arg_description}
     * @return The value of the field {@code arg_description}
     */
    public java.lang.String getArgDescription() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("arg_description"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code arg_description}
     * @param argDescription The new value of the field {@code arg_description}
     */
    public void setArgDescription(java.lang.String argDescription) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("arg_description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (argDescription == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(argDescription, null)));
    }
    
    /**
     * Create a OptionEntry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected OptionEntry(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, OptionEntry> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new OptionEntry(input, ownership);
    
    /**
     * A {@link OptionEntry.Builder} object constructs a {@link OptionEntry} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link OptionEntry.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final OptionEntry struct;
        
        private Builder() {
            struct = OptionEntry.allocate();
        }
        
         /**
         * Finish building the {@link OptionEntry} struct.
         * @return A new instance of {@code OptionEntry} with the fields 
         *         that were set in the Builder object.
         */
        public OptionEntry build() {
            return struct;
        }
        
        /**
         * The long name of an option can be used to specify it
         *     in a commandline as {@code --long_name}. Every option must have a
         *     long name. To resolve conflicts if multiple option groups contain
         *     the same long name, it is also possible to specify the option as
         *     {@code --groupname-long_name}.
         * @param longName The value for the {@code longName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLongName(java.lang.String longName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("long_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (longName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(longName, null)));
            return this;
        }
        
        /**
         * If an option has a short name, it can be specified
         *     {@code -short_name} in a commandline. {@code short_name} must be  a printable
         *     ASCII character different from '-', or zero if the option has no
         *     short name.
         * @param shortName The value for the {@code shortName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShortName(byte shortName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("short_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), shortName);
            return this;
        }
        
        /**
         * Flags from {@link OptionFlags}
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(int flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
            return this;
        }
        
        /**
         * The type of the option, as a {@link OptionArg}
         * @param arg The value for the {@code arg} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setArg(org.gtk.glib.OptionArg arg) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("arg"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (arg == null ? MemoryAddress.NULL : arg.getValue()));
            return this;
        }
        
        /**
         * If the {@code arg} type is {@link OptionArg#CALLBACK}, then {@code arg_data}
         *     must point to a {@link OptionArgFunc} callback function, which will be
         *     called to handle the extra argument. Otherwise, {@code arg_data} is a
         *     pointer to a location to store the value, the required type of
         *     the location depends on the {@code arg} type:
         * <ul>
         * <li>{@link OptionArg#NONE}: {@code gboolean}
         * <li>{@link OptionArg#STRING}: {@code gchar}*
         * <li>{@link OptionArg#INT}: {@code gint}
         * <li>{@link OptionArg#FILENAME}: {@code gchar}*
         * <li>{@link OptionArg#STRING_ARRAY}: {@code gchar}**
         * <li>{@link OptionArg#FILENAME_ARRAY}: {@code gchar}**
         * <li>{@link OptionArg#DOUBLE}: {@code gdouble}
         *     If {@code arg} type is {@link OptionArg#STRING} or {@link OptionArg#FILENAME},
         *     the location will contain a newly allocated string if the option
         *     was given. That string needs to be freed by the callee using g_free().
         *     Likewise if {@code arg} type is {@link OptionArg#STRING_ARRAY} or
         *     {@link OptionArg#FILENAME_ARRAY}, the data should be freed using g_strfreev().
         * </ul>
         * @param argData The value for the {@code argData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setArgData(java.lang.foreign.MemoryAddress argData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("arg_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (argData == null ? MemoryAddress.NULL : (Addressable) argData));
            return this;
        }
        
        /**
         * the description for the option in {@code --help}
         *     output. The {@code description} is translated using the {@code translate_func}
         *     of the group, see g_option_group_set_translation_domain().
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
         * The placeholder to use for the extra argument parsed
         *     by the option in {@code --help} output. The {@code arg_description} is translated
         *     using the {@code translate_func} of the group, see
         *     g_option_group_set_translation_domain().
         * @param argDescription The value for the {@code argDescription} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setArgDescription(java.lang.String argDescription) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("arg_description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (argDescription == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(argDescription, null)));
            return this;
        }
    }
}
