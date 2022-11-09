package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure holding in-depth information for a specific signal.
 * <p>
 * See also: g_signal_query()
 */
public class SignalQuery extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSignalQuery";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("signal_id"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("signal_name"),
        ValueLayout.JAVA_LONG.withName("itype"),
        Interop.valueLayout.C_INT.withName("signal_flags"),
        MemoryLayout.paddingLayout(32),
        ValueLayout.JAVA_LONG.withName("return_type"),
        ValueLayout.JAVA_INT.withName("n_params"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("param_types")
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
    
    public static SignalQuery allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SignalQuery newInstance = new SignalQuery(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code signal_id}
     * @return The value of the field {@code signal_id}
     */
    public int signal_id$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code signal_id}
     * @param signal_id The new value of the field {@code signal_id}
     */
    public void signal_id$set(int signal_id) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), signal_id);
    }
    
    /**
     * Get the value of the field {@code signal_name}
     * @return The value of the field {@code signal_name}
     */
    public java.lang.String signal_name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code signal_name}
     * @param signal_name The new value of the field {@code signal_name}
     */
    public void signal_name$set(java.lang.String signal_name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(signal_name));
    }
    
    /**
     * Get the value of the field {@code itype}
     * @return The value of the field {@code itype}
     */
    public org.gtk.glib.Type itype$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("itype"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code itype}
     * @param itype The new value of the field {@code itype}
     */
    public void itype$set(org.gtk.glib.Type itype) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("itype"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), itype.getValue().longValue());
    }
    
    /**
     * Get the value of the field {@code signal_flags}
     * @return The value of the field {@code signal_flags}
     */
    public org.gtk.gobject.SignalFlags signal_flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.SignalFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code signal_flags}
     * @param signal_flags The new value of the field {@code signal_flags}
     */
    public void signal_flags$set(org.gtk.gobject.SignalFlags signal_flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), signal_flags.getValue());
    }
    
    /**
     * Get the value of the field {@code return_type}
     * @return The value of the field {@code return_type}
     */
    public org.gtk.glib.Type return_type$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("return_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code return_type}
     * @param return_type The new value of the field {@code return_type}
     */
    public void return_type$set(org.gtk.glib.Type return_type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("return_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), return_type.getValue().longValue());
    }
    
    /**
     * Get the value of the field {@code n_params}
     * @return The value of the field {@code n_params}
     */
    public int n_params$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_params"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_params}
     * @param n_params The new value of the field {@code n_params}
     */
    public void n_params$set(int n_params) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_params"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), n_params);
    }
    
    /**
     * Create a SignalQuery proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SignalQuery(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
