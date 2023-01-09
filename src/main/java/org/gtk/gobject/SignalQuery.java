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
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSignalQuery";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SignalQuery}
     * @return A new, uninitialized @{link SignalQuery}
     */
    public static SignalQuery allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SignalQuery newInstance = new SignalQuery(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code signal_id}
     * @return The value of the field {@code signal_id}
     */
    public int getSignalId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code signal_id}
     * @param signalId The new value of the field {@code signal_id}
     */
    public void setSignalId(int signalId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), signalId);
        }
    }
    
    /**
     * Get the value of the field {@code signal_name}
     * @return The value of the field {@code signal_name}
     */
    public java.lang.String getSignalName() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_name"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code signal_name}
     * @param signalName The new value of the field {@code signal_name}
     */
    public void setSignalName(java.lang.String signalName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (signalName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(signalName, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code itype}
     * @return The value of the field {@code itype}
     */
    public org.gtk.glib.Type getItype() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("itype"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gtk.glib.Type(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code itype}
     * @param itype The new value of the field {@code itype}
     */
    public void setItype(org.gtk.glib.Type itype) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("itype"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (itype == null ? MemoryAddress.NULL : itype.getValue().longValue()));
        }
    }
    
    /**
     * Get the value of the field {@code signal_flags}
     * @return The value of the field {@code signal_flags}
     */
    public org.gtk.gobject.SignalFlags getSignalFlags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_flags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gtk.gobject.SignalFlags(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code signal_flags}
     * @param signalFlags The new value of the field {@code signal_flags}
     */
    public void setSignalFlags(org.gtk.gobject.SignalFlags signalFlags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (signalFlags == null ? MemoryAddress.NULL : signalFlags.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code return_type}
     * @return The value of the field {@code return_type}
     */
    public org.gtk.glib.Type getReturnType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("return_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gtk.glib.Type(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code return_type}
     * @param returnType The new value of the field {@code return_type}
     */
    public void setReturnType(org.gtk.glib.Type returnType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("return_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (returnType == null ? MemoryAddress.NULL : returnType.getValue().longValue()));
        }
    }
    
    /**
     * Get the value of the field {@code n_params}
     * @return The value of the field {@code n_params}
     */
    public int getNParams() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_params"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code n_params}
     * @param nParams The new value of the field {@code n_params}
     */
    public void setNParams(int nParams) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_params"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), nParams);
        }
    }
    
    /**
     * Get the value of the field {@code param_types}
     * @return The value of the field {@code param_types}
     */
    public PointerLong getParamTypes() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("param_types"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerLong(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code param_types}
     * @param paramTypes The new value of the field {@code param_types}
     */
    public void setParamTypes(org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("param_types"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (paramTypes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE)));
        }
    }
    
    /**
     * Create a SignalQuery proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SignalQuery(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SignalQuery> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SignalQuery(input);
    
    /**
     * A {@link SignalQuery.Builder} object constructs a {@link SignalQuery} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SignalQuery.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SignalQuery struct;
        
        private Builder() {
            struct = SignalQuery.allocate();
        }
        
        /**
         * Finish building the {@link SignalQuery} struct.
         * @return A new instance of {@code SignalQuery} with the fields 
         *         that were set in the Builder object.
         */
        public SignalQuery build() {
            return struct;
        }
        
        /**
         * The signal id of the signal being queried, or 0 if the
         *  signal to be queried was unknown.
         * @param signalId The value for the {@code signalId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSignalId(int signalId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("signal_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), signalId);
                return this;
            }
        }
        
        /**
         * The signal name.
         * @param signalName The value for the {@code signalName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSignalName(java.lang.String signalName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("signal_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (signalName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(signalName, SCOPE)));
                return this;
            }
        }
        
        /**
         * The interface/instance type that this signal can be emitted for.
         * @param itype The value for the {@code itype} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setItype(org.gtk.glib.Type itype) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("itype"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (itype == null ? MemoryAddress.NULL : itype.getValue().longValue()));
                return this;
            }
        }
        
        /**
         * The signal flags as passed in to g_signal_new().
         * @param signalFlags The value for the {@code signalFlags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSignalFlags(org.gtk.gobject.SignalFlags signalFlags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("signal_flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (signalFlags == null ? MemoryAddress.NULL : signalFlags.getValue()));
                return this;
            }
        }
        
        /**
         * The return type for user callbacks.
         * @param returnType The value for the {@code returnType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setReturnType(org.gtk.glib.Type returnType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("return_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (returnType == null ? MemoryAddress.NULL : returnType.getValue().longValue()));
                return this;
            }
        }
        
        /**
         * The number of parameters that user callbacks take.
         * @param nParams The value for the {@code nParams} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNParams(int nParams) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("n_params"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), nParams);
                return this;
            }
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
        public Builder setParamTypes(org.gtk.glib.Type[] paramTypes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("param_types"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (paramTypes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE)));
                return this;
            }
        }
    }
}
