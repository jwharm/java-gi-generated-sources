package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link HookList} struct represents a list of hook functions.
 */
public class HookList extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GHookList";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_LONG.withName("seq_id"),
        Interop.valueLayout.C_INT.withName("hook_size"),
        Interop.valueLayout.C_INT.withName("is_setup"),
        Interop.valueLayout.ADDRESS.withName("hooks"),
        Interop.valueLayout.ADDRESS.withName("dummy3"),
        Interop.valueLayout.ADDRESS.withName("finalize_hook"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("dummy")
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
     * Allocate a new {@link HookList}
     * @return A new, uninitialized @{link HookList}
     */
    public static HookList allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        HookList newInstance = new HookList(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code seq_id}
     * @return The value of the field {@code seq_id}
     */
    public long seq_id$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seq_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code seq_id}
     * @param seq_id The new value of the field {@code seq_id}
     */
    public void seq_id$set(long seq_id) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seq_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), seq_id);
    }
    
    /**
     * Get the value of the field {@code hook_size}
     * @return The value of the field {@code hook_size}
     */
    public int hook_size$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hook_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code hook_size}
     * @param hook_size The new value of the field {@code hook_size}
     */
    public void hook_size$set(int hook_size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hook_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), hook_size);
    }
    
    /**
     * Get the value of the field {@code is_setup}
     * @return The value of the field {@code is_setup}
     */
    public int is_setup$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_setup"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_setup}
     * @param is_setup The new value of the field {@code is_setup}
     */
    public void is_setup$set(int is_setup) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_setup"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_setup);
    }
    
    /**
     * Get the value of the field {@code hooks}
     * @return The value of the field {@code hooks}
     */
    public org.gtk.glib.Hook hooks$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hooks"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Hook(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code hooks}
     * @param hooks The new value of the field {@code hooks}
     */
    public void hooks$set(org.gtk.glib.Hook hooks) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hooks"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), hooks.handle());
    }
    
    /**
     * Get the value of the field {@code dummy3}
     * @return The value of the field {@code dummy3}
     */
    public java.lang.foreign.MemoryAddress dummy3$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dummy3"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code dummy3}
     * @param dummy3 The new value of the field {@code dummy3}
     */
    public void dummy3$set(java.lang.foreign.MemoryAddress dummy3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dummy3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) dummy3);
    }
    
    /**
     * Get the value of the field {@code finalize_hook}
     * @return The value of the field {@code finalize_hook}
     */
    public org.gtk.glib.HookFinalizeFunc finalize_hook$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finalize_hook"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a HookList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public HookList(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Removes all the {@link Hook} elements from a {@link HookList}.
     */
    public void clear() {
        try {
            DowncallHandles.g_hook_list_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes a {@link HookList}.
     * This must be called before the {@link HookList} is used.
     * @param hookSize the size of each element in the {@link HookList},
     *     typically {@code sizeof (GHook)}.
     */
    public void init(int hookSize) {
        try {
            DowncallHandles.g_hook_list_init.invokeExact(
                    handle(),
                    hookSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls all of the {@link Hook} functions in a {@link HookList}.
     * @param mayRecurse {@code true} if functions which are already running
     *     (e.g. in another thread) can be called. If set to {@code false},
     *     these are skipped
     */
    public void invoke(boolean mayRecurse) {
        try {
            DowncallHandles.g_hook_list_invoke.invokeExact(
                    handle(),
                    mayRecurse ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls all of the {@link Hook} functions in a {@link HookList}.
     * Any function which returns {@code false} is removed from the {@link HookList}.
     * @param mayRecurse {@code true} if functions which are already running
     *     (e.g. in another thread) can be called. If set to {@code false},
     *     these are skipped
     */
    public void invokeCheck(boolean mayRecurse) {
        try {
            DowncallHandles.g_hook_list_invoke_check.invokeExact(
                    handle(),
                    mayRecurse ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls a function on each valid {@link Hook}.
     * @param mayRecurse {@code true} if hooks which are currently running
     *     (e.g. in another thread) are considered valid. If set to {@code false},
     *     these are skipped
     * @param marshaller the function to call for each {@link Hook}
     */
    public void marshal(boolean mayRecurse, @NotNull org.gtk.glib.HookMarshaller marshaller) {
        java.util.Objects.requireNonNull(marshaller, "Parameter 'marshaller' must not be null");
        try {
            DowncallHandles.g_hook_list_marshal.invokeExact(
                    handle(),
                    mayRecurse ? 1 : 0,
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbHookMarshaller",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(marshaller)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls a function on each valid {@link Hook} and destroys it if the
     * function returns {@code false}.
     * @param mayRecurse {@code true} if hooks which are currently running
     *     (e.g. in another thread) are considered valid. If set to {@code false},
     *     these are skipped
     * @param marshaller the function to call for each {@link Hook}
     */
    public void marshalCheck(boolean mayRecurse, @NotNull org.gtk.glib.HookCheckMarshaller marshaller) {
        java.util.Objects.requireNonNull(marshaller, "Parameter 'marshaller' must not be null");
        try {
            DowncallHandles.g_hook_list_marshal_check.invokeExact(
                    handle(),
                    mayRecurse ? 1 : 0,
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbHookCheckMarshaller",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(marshaller)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_hook_list_clear = Interop.downcallHandle(
            "g_hook_list_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_list_init = Interop.downcallHandle(
            "g_hook_list_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_hook_list_invoke = Interop.downcallHandle(
            "g_hook_list_invoke",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_hook_list_invoke_check = Interop.downcallHandle(
            "g_hook_list_invoke_check",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_hook_list_marshal = Interop.downcallHandle(
            "g_hook_list_marshal",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_list_marshal_check = Interop.downcallHandle(
            "g_hook_list_marshal_check",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private HookList struct;
        
         /**
         * A {@link HookList.Build} object constructs a {@link HookList} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = HookList.allocate();
        }
        
         /**
         * Finish building the {@link HookList} struct.
         * @return A new instance of {@code HookList} with the fields 
         *         that were set in the Build object.
         */
        public HookList construct() {
            return struct;
        }
        
        /**
         * the next free {@link Hook} id
         * @param seq_id The value for the {@code seq_id} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSeqId(long seq_id) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seq_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), seq_id);
            return this;
        }
        
        /**
         * the size of the {@link HookList} elements, in bytes
         * @param hook_size The value for the {@code hook_size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHookSize(int hook_size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hook_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), hook_size);
            return this;
        }
        
        /**
         * 1 if the {@link HookList} has been initialized
         * @param is_setup The value for the {@code is_setup} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsSetup(int is_setup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_setup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_setup);
            return this;
        }
        
        /**
         * the first {@link Hook} element in the list
         * @param hooks The value for the {@code hooks} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHooks(org.gtk.glib.Hook hooks) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hooks"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hooks == null ? MemoryAddress.NULL : hooks.handle()));
            return this;
        }
        
        /**
         * unused
         * @param dummy3 The value for the {@code dummy3} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDummy3(java.lang.foreign.MemoryAddress dummy3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dummy3 == null ? MemoryAddress.NULL : (Addressable) dummy3));
            return this;
        }
        
        /**
         * the function to call to finalize a {@link Hook} element.
         *     The default behaviour is to call the hooks {@code destroy} function
         * @param finalize_hook The value for the {@code finalize_hook} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFinalizeHook(java.lang.foreign.MemoryAddress finalize_hook) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finalize_hook"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finalize_hook == null ? MemoryAddress.NULL : finalize_hook));
            return this;
        }
        
        /**
         * unused
         * @param dummy The value for the {@code dummy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDummy(java.lang.foreign.MemoryAddress[] dummy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dummy == null ? MemoryAddress.NULL : Interop.allocateNativeArray(dummy, false)));
            return this;
        }
    }
}
