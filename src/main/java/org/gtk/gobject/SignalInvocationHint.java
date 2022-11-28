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
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSignalInvocationHint";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("signal_id"),
        Interop.valueLayout.C_INT.withName("detail"),
        Interop.valueLayout.C_INT.withName("run_type")
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
     * Allocate a new {@link SignalInvocationHint}
     * @return A new, uninitialized @{link SignalInvocationHint}
     */
    public static SignalInvocationHint allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SignalInvocationHint newInstance = new SignalInvocationHint(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code detail}
     * @return The value of the field {@code detail}
     */
    public org.gtk.glib.Quark detail$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("detail"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Change the value of the field {@code detail}
     * @param detail The new value of the field {@code detail}
     */
    public void detail$set(org.gtk.glib.Quark detail) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("detail"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), detail.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code run_type}
     * @return The value of the field {@code run_type}
     */
    public org.gtk.gobject.SignalFlags runType$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("run_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.SignalFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code run_type}
     * @param runType The new value of the field {@code run_type}
     */
    public void runType$set(org.gtk.gobject.SignalFlags runType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("run_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), runType.getValue());
    }
    
    /**
     * Create a SignalInvocationHint proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SignalInvocationHint(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SignalInvocationHint struct;
        
         /**
         * A {@link SignalInvocationHint.Build} object constructs a {@link SignalInvocationHint} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SignalInvocationHint.allocate();
        }
        
         /**
         * Finish building the {@link SignalInvocationHint} struct.
         * @return A new instance of {@code SignalInvocationHint} with the fields 
         *         that were set in the Build object.
         */
        public SignalInvocationHint construct() {
            return struct;
        }
        
        /**
         * The signal id of the signal invoking the callback
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
         * The detail passed on for this emission
         * @param detail The value for the {@code detail} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDetail(org.gtk.glib.Quark detail) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("detail"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (detail == null ? MemoryAddress.NULL : detail.getValue().intValue()));
            return this;
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
        public Build setRunType(org.gtk.gobject.SignalFlags runType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("run_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (runType == null ? MemoryAddress.NULL : runType.getValue()));
            return this;
        }
    }
}
