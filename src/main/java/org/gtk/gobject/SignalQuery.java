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
public class SignalQuery extends Struct {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSignalQuery";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("signal_id"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("signal_name"),
        Interop.valueLayout.C_LONG.withName("itype"),
        Interop.valueLayout.C_INT.withName("signal_flags"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.C_LONG.withName("return_type"),
        Interop.valueLayout.C_INT.withName("n_params"),
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
    
    /**
     * Allocate a new {@link SignalQuery}
     * @return A new, uninitialized @{link SignalQuery}
     */
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

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SignalQuery struct;
        
         /**
         * A {@link SignalQuery.Build} object constructs a {@link SignalQuery} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SignalQuery.allocate();
        }
        
         /**
         * Finish building the {@link SignalQuery} struct.
         * @return A new instance of {@code SignalQuery} with the fields 
         *         that were set in the Build object.
         */
        public SignalQuery construct() {
            return struct;
        }
        
        /**
         * The signal id of the signal being queried, or 0 if the
         *  signal to be queried was unknown.
         * @param signal_id The value for the {@code signal_id} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSignalId(int signal_id) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), signal_id);
            return this;
        }
        
        /**
         * The signal name.
         * @param signal_name The value for the {@code signal_name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSignalName(java.lang.String signal_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (signal_name == null ? MemoryAddress.NULL : Interop.allocateNativeString(signal_name)));
            return this;
        }
        
        /**
         * The interface/instance type that this signal can be emitted for.
         * @param itype The value for the {@code itype} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setItype(org.gtk.glib.Type itype) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("itype"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (itype == null ? MemoryAddress.NULL : itype.getValue().longValue()));
            return this;
        }
        
        /**
         * The signal flags as passed in to g_signal_new().
         * @param signal_flags The value for the {@code signal_flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSignalFlags(org.gtk.gobject.SignalFlags signal_flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (signal_flags == null ? MemoryAddress.NULL : signal_flags.getValue()));
            return this;
        }
        
        /**
         * The return type for user callbacks.
         * @param return_type The value for the {@code return_type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setReturnType(org.gtk.glib.Type return_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("return_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (return_type == null ? MemoryAddress.NULL : return_type.getValue().longValue()));
            return this;
        }
        
        /**
         * The number of parameters that user callbacks take.
         * @param n_params The value for the {@code n_params} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNParams(int n_params) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_params"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), n_params);
            return this;
        }
        
        /**
         * The individual parameter types for
         *  user callbacks, note that the effective callback signature is:
         *  <pre>{@code <!-- language="C" -->
         *  @return_type callback (#gpointer     data1,
         *  [param_types param_names,]
         *  gpointer     data2);
         *  }</pre>
         * @param param_types The value for the {@code param_types} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParamTypes(org.gtk.glib.Type[] param_types) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("param_types"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (param_types == null ? MemoryAddress.NULL : Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(param_types), false)));
            return this;
        }
    }
}
