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
public class OptionEntry extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GOptionEntry";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("long_name"),
        ValueLayout.JAVA_BYTE.withName("short_name"),
        MemoryLayout.paddingLayout(24),
        ValueLayout.JAVA_INT.withName("flags"),
        Interop.valueLayout.C_INT.withName("arg"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("arg_data"),
        Interop.valueLayout.ADDRESS.withName("description"),
        Interop.valueLayout.ADDRESS.withName("arg_description")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static OptionEntry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OptionEntry newInstance = new OptionEntry(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code long_name}
     * @return The value of the field {@code long_name}
     */
    public java.lang.String long_name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("long_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code long_name}
     * @param long_name The new value of the field {@code long_name}
     */
    public void long_name$set(java.lang.String long_name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("long_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(long_name));
    }
    
    /**
     * Get the value of the field {@code short_name}
     * @return The value of the field {@code short_name}
     */
    public byte short_name$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("short_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code short_name}
     * @param short_name The new value of the field {@code short_name}
     */
    public void short_name$set(byte short_name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("short_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), short_name);
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public int flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(int flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
    }
    
    /**
     * Get the value of the field {@code arg}
     * @return The value of the field {@code arg}
     */
    public org.gtk.glib.OptionArg arg$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("arg"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.OptionArg(RESULT);
    }
    
    /**
     * Change the value of the field {@code arg}
     * @param arg The new value of the field {@code arg}
     */
    public void arg$set(org.gtk.glib.OptionArg arg) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("arg"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), arg.getValue());
    }
    
    /**
     * Get the value of the field {@code arg_data}
     * @return The value of the field {@code arg_data}
     */
    public java.lang.foreign.MemoryAddress arg_data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("arg_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code arg_data}
     * @param arg_data The new value of the field {@code arg_data}
     */
    public void arg_data$set(java.lang.foreign.MemoryAddress arg_data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("arg_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), arg_data);
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
     * Get the value of the field {@code arg_description}
     * @return The value of the field {@code arg_description}
     */
    public java.lang.String arg_description$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("arg_description"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code arg_description}
     * @param arg_description The new value of the field {@code arg_description}
     */
    public void arg_description$set(java.lang.String arg_description) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("arg_description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(arg_description));
    }
    
    @ApiStatus.Internal
    public OptionEntry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
