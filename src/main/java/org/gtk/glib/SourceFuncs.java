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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SourceFuncs newInstance = new SourceFuncs(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface PrepareCallback {
        boolean run(org.gtk.glib.Source source, PointerInteger timeout);

        @ApiStatus.Internal default int upcall(MemoryAddress source, MemoryAddress timeout) {
            var RESULT = run(org.gtk.glib.Source.fromAddress.marshal(source, Ownership.NONE), new PointerInteger(timeout));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrepareCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare}
     * @param prepare The new value of the field {@code prepare}
     */
    public void setPrepare(PrepareCallback prepare) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare.toCallback()));
    }
    
    @FunctionalInterface
    public interface CheckCallback {
        boolean run(org.gtk.glib.Source source);

        @ApiStatus.Internal default int upcall(MemoryAddress source) {
            var RESULT = run(org.gtk.glib.Source.fromAddress.marshal(source, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CheckCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code check}
     * @param check The new value of the field {@code check}
     */
    public void setCheck(CheckCallback check) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("check"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (check == null ? MemoryAddress.NULL : check.toCallback()));
    }
    
    @FunctionalInterface
    public interface DispatchCallback {
        boolean run(org.gtk.glib.Source source, org.gtk.glib.SourceFunc callback);

        @ApiStatus.Internal default int upcall(MemoryAddress source, MemoryAddress callback, MemoryAddress userData) {
            var RESULT = run(org.gtk.glib.Source.fromAddress.marshal(source, Ownership.NONE), null /* Unsupported parameter type */);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DispatchCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dispatch}
     * @param dispatch The new value of the field {@code dispatch}
     */
    public void setDispatch(DispatchCallback dispatch) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dispatch"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispatch == null ? MemoryAddress.NULL : dispatch.toCallback()));
    }
    
    @FunctionalInterface
    public interface FinalizeCallback {
        void run(org.gtk.glib.Source source);

        @ApiStatus.Internal default void upcall(MemoryAddress source) {
            run(org.gtk.glib.Source.fromAddress.marshal(source, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FinalizeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code finalize}
     * @param finalize The new value of the field {@code finalize}
     */
    public void setFinalize(FinalizeCallback finalize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize.toCallback()));
    }
    
    /**
     * Create a SourceFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SourceFuncs(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SourceFuncs> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SourceFuncs(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare.toCallback()));
            return this;
        }
        
        public Builder setCheck(CheckCallback check) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("check"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (check == null ? MemoryAddress.NULL : check.toCallback()));
            return this;
        }
        
        public Builder setDispatch(DispatchCallback dispatch) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispatch"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispatch == null ? MemoryAddress.NULL : dispatch.toCallback()));
            return this;
        }
        
        public Builder setFinalize(FinalizeCallback finalize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize.toCallback()));
            return this;
        }
        
        public Builder setClosureCallback(org.gtk.glib.SourceFunc closureCallback) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("closure_callback"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closureCallback == null ? MemoryAddress.NULL : (Addressable) closureCallback.toCallback()));
            return this;
        }
        
        public Builder setClosureMarshal(org.gtk.glib.SourceDummyMarshal closureMarshal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("closure_marshal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closureMarshal == null ? MemoryAddress.NULL : (Addressable) closureMarshal.toCallback()));
            return this;
        }
    }
}
