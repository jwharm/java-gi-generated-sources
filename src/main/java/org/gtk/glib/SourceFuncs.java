package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GSourceFuncs} struct contains a table of
 * functions used to handle event sources in a generic manner.
 * <p>
 * For idle sources, the prepare and check functions always return {@code true}
 * to indicate that the source is always ready to be processed. The prepare
 * function also returns a timeout value of 0 to ensure that the poll() call
 * doesn't block (since that would be time wasted which could have been spent
 * running the idle function).
 * <p>
 * For timeout sources, the prepare and check functions both return {@code true}
 * if the timeout interval has expired. The prepare function also returns
 * a timeout value to ensure that the poll() call doesn't block too long
 * and miss the next timeout.
 * <p>
 * For file descriptor sources, the prepare function typically returns {@code false},
 * since it must wait until poll() has been called before it knows whether
 * any events need to be processed. It sets the returned timeout to -1 to
 * indicate that it doesn't mind how long the poll() call blocks. In the
 * check function, it tests the results of the poll() call to see if the
 * required condition has been met, and returns {@code true} if so.
 */
public class SourceFuncs extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSourceFuncs";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("prepare"),
            Interop.valueLayout.ADDRESS.withName("check"),
            Interop.valueLayout.ADDRESS.withName("dispatch"),
            Interop.valueLayout.ADDRESS.withName("finalize"),
            Interop.valueLayout.ADDRESS.withName("closure_callback"),
            Interop.valueLayout.ADDRESS.withName("closure_marshal")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SourceFuncs}
     * @return A new, uninitialized @{link SourceFuncs}
     */
    public static SourceFuncs allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SourceFuncs newInstance = new SourceFuncs(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code PrepareCallback} callback.
     */
    @FunctionalInterface
    public interface PrepareCallback {
    
        boolean run(org.gtk.glib.Source source, PointerInteger timeout);
        
        @ApiStatus.Internal default int upcall(MemoryAddress source, MemoryAddress timeout) {
            var RESULT = run(org.gtk.glib.Source.fromAddress.marshal(source, null), new PointerInteger(timeout));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrepareCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare}
     * @param prepare The new value of the field {@code prepare}
     */
    public void setPrepare(PrepareCallback prepare) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CheckCallback} callback.
     */
    @FunctionalInterface
    public interface CheckCallback {
    
        boolean run(org.gtk.glib.Source source);
        
        @ApiStatus.Internal default int upcall(MemoryAddress source) {
            var RESULT = run(org.gtk.glib.Source.fromAddress.marshal(source, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CheckCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code check}
     * @param check The new value of the field {@code check}
     */
    public void setCheck(CheckCallback check) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("check"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (check == null ? MemoryAddress.NULL : check.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DispatchCallback} callback.
     */
    @FunctionalInterface
    public interface DispatchCallback {
    
        boolean run(org.gtk.glib.Source source, org.gtk.glib.SourceFunc callback);
        
        @ApiStatus.Internal default int upcall(MemoryAddress source, MemoryAddress callback, MemoryAddress userData) {
            var RESULT = run(org.gtk.glib.Source.fromAddress.marshal(source, null), null /* Unsupported parameter type */);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DispatchCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dispatch}
     * @param dispatch The new value of the field {@code dispatch}
     */
    public void setDispatch(DispatchCallback dispatch) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispatch"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dispatch == null ? MemoryAddress.NULL : dispatch.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FinalizeCallback} callback.
     */
    @FunctionalInterface
    public interface FinalizeCallback {
    
        void run(org.gtk.glib.Source source);
        
        @ApiStatus.Internal default void upcall(MemoryAddress source) {
            run(org.gtk.glib.Source.fromAddress.marshal(source, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FinalizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code finalize}
     * @param finalize The new value of the field {@code finalize}
     */
    public void setFinalize(FinalizeCallback finalize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize.toCallback()));
        }
    }
    
    /**
     * Create a SourceFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SourceFuncs(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SourceFuncs> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SourceFuncs(input);
    
    /**
     * A {@link SourceFuncs.Builder} object constructs a {@link SourceFuncs} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SourceFuncs.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SourceFuncs struct;
        
        private Builder() {
            struct = SourceFuncs.allocate();
        }
        
        /**
         * Finish building the {@link SourceFuncs} struct.
         * @return A new instance of {@code SourceFuncs} with the fields 
         *         that were set in the Builder object.
         */
        public SourceFuncs build() {
            return struct;
        }
        
        public Builder setPrepare(PrepareCallback prepare) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare.toCallback()));
                return this;
            }
        }
        
        public Builder setCheck(CheckCallback check) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("check"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (check == null ? MemoryAddress.NULL : check.toCallback()));
                return this;
            }
        }
        
        public Builder setDispatch(DispatchCallback dispatch) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dispatch"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dispatch == null ? MemoryAddress.NULL : dispatch.toCallback()));
                return this;
            }
        }
        
        public Builder setFinalize(FinalizeCallback finalize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize.toCallback()));
                return this;
            }
        }
        
        public Builder setClosureCallback(org.gtk.glib.SourceFunc closureCallback) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("closure_callback"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closureCallback == null ? MemoryAddress.NULL : (Addressable) closureCallback.toCallback()));
                return this;
            }
        }
        
        public Builder setClosureMarshal(org.gtk.glib.SourceDummyMarshal closureMarshal) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("closure_marshal"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closureMarshal == null ? MemoryAddress.NULL : (Addressable) closureMarshal.toCallback()));
                return this;
            }
        }
    }
}
