package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link SignalInvocationHint} structure is used to pass on additional information
 * to callbacks during a signal emission.
 */
public class SignalInvocationHint extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSignalInvocationHint";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("signal_id"),
            Interop.valueLayout.C_INT.withName("detail"),
            Interop.valueLayout.C_INT.withName("run_type")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SignalInvocationHint}
     * @return A new, uninitialized @{link SignalInvocationHint}
     */
    public static SignalInvocationHint allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SignalInvocationHint newInstance = new SignalInvocationHint(segment.address());
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
     * Get the value of the field {@code detail}
     * @return The value of the field {@code detail}
     */
    public org.gtk.glib.Quark getDetail() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("detail"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gtk.glib.Quark(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code detail}
     * @param detail The new value of the field {@code detail}
     */
    public void setDetail(org.gtk.glib.Quark detail) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("detail"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (detail == null ? MemoryAddress.NULL : detail.getValue().intValue()));
        }
    }
    
    /**
     * Get the value of the field {@code run_type}
     * @return The value of the field {@code run_type}
     */
    public org.gtk.gobject.SignalFlags getRunType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("run_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gtk.gobject.SignalFlags(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code run_type}
     * @param runType The new value of the field {@code run_type}
     */
    public void setRunType(org.gtk.gobject.SignalFlags runType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("run_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (runType == null ? MemoryAddress.NULL : runType.getValue()));
        }
    }
    
    /**
     * Create a SignalInvocationHint proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SignalInvocationHint(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SignalInvocationHint> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SignalInvocationHint(input);
    
    /**
     * A {@link SignalInvocationHint.Builder} object constructs a {@link SignalInvocationHint} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SignalInvocationHint.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SignalInvocationHint struct;
        
        private Builder() {
            struct = SignalInvocationHint.allocate();
        }
        
        /**
         * Finish building the {@link SignalInvocationHint} struct.
         * @return A new instance of {@code SignalInvocationHint} with the fields 
         *         that were set in the Builder object.
         */
        public SignalInvocationHint build() {
            return struct;
        }
        
        /**
         * The signal id of the signal invoking the callback
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
         * The detail passed on for this emission
         * @param detail The value for the {@code detail} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDetail(org.gtk.glib.Quark detail) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("detail"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (detail == null ? MemoryAddress.NULL : detail.getValue().intValue()));
                return this;
            }
        }
        
        /**
         * The stage the signal emission is currently in, this
         *  field will contain one of {@link SignalFlags#RUN_FIRST},
         *  {@link SignalFlags#RUN_LAST} or {@link SignalFlags#RUN_CLEANUP} and {@link SignalFlags#ACCUMULATOR_FIRST_RUN}.
         *  {@link SignalFlags#ACCUMULATOR_FIRST_RUN} is only set for the first run of the accumulator
         *  function for a signal emission.
         * @param runType The value for the {@code runType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRunType(org.gtk.gobject.SignalFlags runType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("run_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (runType == null ? MemoryAddress.NULL : runType.getValue()));
                return this;
            }
        }
    }
}
