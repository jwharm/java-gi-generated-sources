package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Each piece of memory that is pushed onto the stack
 * is cast to a GTrashStack*.
 */
public class TrashStack extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTrashStack";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("next")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TrashStack}
     * @return A new, uninitialized @{link TrashStack}
     */
    public static TrashStack allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TrashStack newInstance = new TrashStack(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code next}
     * @return The value of the field {@code next}
     */
    public org.gtk.glib.TrashStack getNext() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gtk.glib.TrashStack.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code next}
     * @param next The new value of the field {@code next}
     */
    public void setNext(org.gtk.glib.TrashStack next) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (next == null ? MemoryAddress.NULL : next.handle()));
        }
    }
    
    /**
     * Create a TrashStack proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TrashStack(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TrashStack> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TrashStack(input);
    
    /**
     * Returns the height of a {@link TrashStack}.
     * <p>
     * Note that execution of this function is of O(N) complexity
     * where N denotes the number of items on the stack.
     * @param stackP a {@link TrashStack}
     * @return the height of the stack
     * @deprecated {@link TrashStack} is deprecated without replacement
     */
    @Deprecated
    public static int height(PointerProxy<org.gtk.glib.TrashStack> stackP) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_trash_stack_height.invokeExact(stackP.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the element at the top of a {@link TrashStack}
     * which may be {@code null}.
     * @param stackP a {@link TrashStack}
     * @return the element at the top of the stack
     * @deprecated {@link TrashStack} is deprecated without replacement
     */
    @Deprecated
    public static @Nullable java.lang.foreign.MemoryAddress peek(PointerProxy<org.gtk.glib.TrashStack> stackP) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_trash_stack_peek.invokeExact(stackP.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Pops a piece of memory off a {@link TrashStack}.
     * @param stackP a {@link TrashStack}
     * @return the element at the top of the stack
     * @deprecated {@link TrashStack} is deprecated without replacement
     */
    @Deprecated
    public static @Nullable java.lang.foreign.MemoryAddress pop(PointerProxy<org.gtk.glib.TrashStack> stackP) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_trash_stack_pop.invokeExact(stackP.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Pushes a piece of memory onto a {@link TrashStack}.
     * @param stackP a {@link TrashStack}
     * @param dataP the piece of memory to push on the stack
     * @deprecated {@link TrashStack} is deprecated without replacement
     */
    @Deprecated
    public static void push(PointerProxy<org.gtk.glib.TrashStack> stackP, java.lang.foreign.MemoryAddress dataP) {
        try {
            DowncallHandles.g_trash_stack_push.invokeExact(
                    stackP.handle(),
                    (Addressable) dataP);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_trash_stack_height = Interop.downcallHandle(
                "g_trash_stack_height",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_trash_stack_peek = Interop.downcallHandle(
                "g_trash_stack_peek",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_trash_stack_pop = Interop.downcallHandle(
                "g_trash_stack_pop",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_trash_stack_push = Interop.downcallHandle(
                "g_trash_stack_push",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link TrashStack.Builder} object constructs a {@link TrashStack} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TrashStack.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TrashStack struct;
        
        private Builder() {
            struct = TrashStack.allocate();
        }
        
        /**
         * Finish building the {@link TrashStack} struct.
         * @return A new instance of {@code TrashStack} with the fields 
         *         that were set in the Builder object.
         */
        public TrashStack build() {
            return struct;
        }
        
        /**
         * pointer to the previous element of the stack,
         *     gets stored in the first {@code sizeof (gpointer)}
         *     bytes of the element
         * @param next The value for the {@code next} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNext(org.gtk.glib.TrashStack next) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("next"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (next == null ? MemoryAddress.NULL : next.handle()));
                return this;
            }
        }
    }
}
