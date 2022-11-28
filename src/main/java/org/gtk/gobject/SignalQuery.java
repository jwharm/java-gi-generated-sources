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
    public int signalId$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code signal_id}
     * @param signalId The new value of the field {@code signal_id}
     */
    public void signalId$set(int signalId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), signalId);
    }
    
    /**
     * Get the value of the field {@code signal_name}
     * @return The value of the field {@code signal_name}
     */
    public java.lang.String signalName$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code signal_name}
     * @param signalName The new value of the field {@code signal_name}
     */
    public void signalName$set(java.lang.String signalName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(signalName));
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
    public org.gtk.gobject.SignalFlags signalFlags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.SignalFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code signal_flags}
     * @param signalFlags The new value of the field {@code signal_flags}
     */
    public void signalFlags$set(org.gtk.gobject.SignalFlags signalFlags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), signalFlags.getValue());
    }
    
    /**
     * Get the value of the field {@code return_type}
     * @return The value of the field {@code return_type}
     */
    public org.gtk.glib.Type returnType$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("return_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code return_type}
     * @param returnType The new value of the field {@code return_type}
     */
    public void returnType$set(org.gtk.glib.Type returnType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("return_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), returnType.getValue().longValue());
    }
    
    /**
     * Get the value of the field {@code n_params}
     * @return The value of the field {@code n_params}
     */
    public int nParams$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_params"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_params}
     * @param nParams The new value of the field {@code n_params}
     */
    public void nParams$set(int nParams) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_params"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nParams);
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
         * @param signalId The value for the {@code signalId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSignalId(int signalId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), signalId);
            return this;
        }
        
        /**
         * The signal name.
         * @param signalName The value for the {@code signalName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSignalName(java.lang.String signalName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (signalName == null ? MemoryAddress.NULL : Interop.allocateNativeString(signalName)));
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
         * @param signalFlags The value for the {@code signalFlags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSignalFlags(org.gtk.gobject.SignalFlags signalFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (signalFlags == null ? MemoryAddress.NULL : signalFlags.getValue()));
            return this;
        }
        
        /**
         * The return type for user callbacks.
         * @param returnType The value for the {@code returnType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setReturnType(org.gtk.glib.Type returnType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("return_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (returnType == null ? MemoryAddress.NULL : returnType.getValue().longValue()));
            return this;
        }
        
        /**
         * The number of parameters that user callbacks take.
         * @param nParams The value for the {@code nParams} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNParams(int nParams) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_params"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nParams);
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
         * @param paramTypes The value for the {@code paramTypes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParamTypes(org.gtk.glib.Type[] paramTypes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("param_types"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (paramTypes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false)));
            return this;
        }
    }
}
