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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_LONG.withName("seq_id"),
            Interop.valueLayout.C_INT.withName("hook_size"),
            Interop.valueLayout.C_INT.withName("is_setup"),
            Interop.valueLayout.ADDRESS.withName("hooks"),
            Interop.valueLayout.ADDRESS.withName("dummy3"),
            Interop.valueLayout.ADDRESS.withName("finalize_hook"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("dummy")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link HookList}
     * @return A new, uninitialized @{link HookList}
     */
    public static HookList allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        HookList newInstance = new HookList(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code seq_id}
     * @return The value of the field {@code seq_id}
     */
    public long getSeqId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seq_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code seq_id}
     * @param seqId The new value of the field {@code seq_id}
     */
    public void setSeqId(long seqId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seq_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), seqId);
        }
    }
    
    /**
     * Get the value of the field {@code hook_size}
     * @return The value of the field {@code hook_size}
     */
    public int getHookSize() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hook_size"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code hook_size}
     * @param hookSize The new value of the field {@code hook_size}
     */
    public void setHookSize(int hookSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hook_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), hookSize);
        }
    }
    
    /**
     * Get the value of the field {@code is_setup}
     * @return The value of the field {@code is_setup}
     */
    public int getIsSetup() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_setup"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_setup}
     * @param isSetup The new value of the field {@code is_setup}
     */
    public void setIsSetup(int isSetup) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_setup"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isSetup);
        }
    }
    
    /**
     * Get the value of the field {@code hooks}
     * @return The value of the field {@code hooks}
     */
    public org.gtk.glib.Hook getHooks() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hooks"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gtk.glib.Hook.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code hooks}
     * @param hooks The new value of the field {@code hooks}
     */
    public void setHooks(org.gtk.glib.Hook hooks) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hooks"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hooks == null ? MemoryAddress.NULL : hooks.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code dummy3}
     * @return The value of the field {@code dummy3}
     */
    public java.lang.foreign.MemoryAddress getDummy3() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy3"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code dummy3}
     * @param dummy3 The new value of the field {@code dummy3}
     */
    public void setDummy3(java.lang.foreign.MemoryAddress dummy3) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy3"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dummy3 == null ? MemoryAddress.NULL : (Addressable) dummy3));
        }
    }
    
    /**
     * Get the value of the field {@code finalize_hook}
     * @return The value of the field {@code finalize_hook}
     */
    public org.gtk.glib.HookFinalizeFunc getFinalizeHook() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finalize_hook"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code finalize_hook}
     * @param finalizeHook The new value of the field {@code finalize_hook}
     */
    public void setFinalizeHook(org.gtk.glib.HookFinalizeFunc finalizeHook) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finalize_hook"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (finalizeHook == null ? MemoryAddress.NULL : (Addressable) finalizeHook.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code dummy}
     * @return The value of the field {@code dummy}
     */
    public java.lang.foreign.MemoryAddress[] getDummy() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Interop.getAddressArrayFrom(RESULT, 2);
        }
    }
    
    /**
     * Change the value of the field {@code dummy}
     * @param dummy The new value of the field {@code dummy}
     */
    public void setDummy(java.lang.foreign.MemoryAddress[] dummy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dummy == null ? MemoryAddress.NULL : Interop.allocateNativeArray(dummy, false, SCOPE)));
        }
    }
    
    /**
     * Create a HookList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected HookList(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, HookList> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new HookList(input);
    
    /**
     * Removes all the {@link Hook} elements from a {@link HookList}.
     */
    public void clear() {
        try {
            DowncallHandles.g_hook_list_clear.invokeExact(handle());
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
                    Marshal.booleanToInteger.marshal(mayRecurse, null).intValue());
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
                    Marshal.booleanToInteger.marshal(mayRecurse, null).intValue());
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
    public void marshal(boolean mayRecurse, org.gtk.glib.HookMarshaller marshaller) {
        try {
            DowncallHandles.g_hook_list_marshal.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(mayRecurse, null).intValue(),
                    (Addressable) marshaller.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
    public void marshalCheck(boolean mayRecurse, org.gtk.glib.HookCheckMarshaller marshaller) {
        try {
            DowncallHandles.g_hook_list_marshal_check.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(mayRecurse, null).intValue(),
                    (Addressable) marshaller.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
     * A {@link HookList.Builder} object constructs a {@link HookList} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link HookList.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final HookList struct;
        
        private Builder() {
            struct = HookList.allocate();
        }
        
        /**
         * Finish building the {@link HookList} struct.
         * @return A new instance of {@code HookList} with the fields 
         *         that were set in the Builder object.
         */
        public HookList build() {
            return struct;
        }
        
        /**
         * the next free {@link Hook} id
         * @param seqId The value for the {@code seqId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSeqId(long seqId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("seq_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), seqId);
                return this;
            }
        }
        
        /**
         * the size of the {@link HookList} elements, in bytes
         * @param hookSize The value for the {@code hookSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHookSize(int hookSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("hook_size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), hookSize);
                return this;
            }
        }
        
        /**
         * 1 if the {@link HookList} has been initialized
         * @param isSetup The value for the {@code isSetup} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsSetup(int isSetup) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_setup"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isSetup);
                return this;
            }
        }
        
        /**
         * the first {@link Hook} element in the list
         * @param hooks The value for the {@code hooks} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHooks(org.gtk.glib.Hook hooks) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("hooks"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hooks == null ? MemoryAddress.NULL : hooks.handle()));
                return this;
            }
        }
        
        /**
         * unused
         * @param dummy3 The value for the {@code dummy3} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDummy3(java.lang.foreign.MemoryAddress dummy3) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dummy3"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dummy3 == null ? MemoryAddress.NULL : (Addressable) dummy3));
                return this;
            }
        }
        
        /**
         * the function to call to finalize a {@link Hook} element.
         *     The default behaviour is to call the hooks {@code destroy} function
         * @param finalizeHook The value for the {@code finalizeHook} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFinalizeHook(org.gtk.glib.HookFinalizeFunc finalizeHook) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("finalize_hook"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (finalizeHook == null ? MemoryAddress.NULL : (Addressable) finalizeHook.toCallback()));
                return this;
            }
        }
        
        /**
         * unused
         * @param dummy The value for the {@code dummy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDummy(java.lang.foreign.MemoryAddress[] dummy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dummy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dummy == null ? MemoryAddress.NULL : Interop.allocateNativeArray(dummy, false, SCOPE)));
                return this;
            }
        }
    }
}
