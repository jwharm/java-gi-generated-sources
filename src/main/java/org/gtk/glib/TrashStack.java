package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Each piece of memory that is pushed onto the stack
 * is cast to a GTrashStack*.
 */
public class TrashStack extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTrashStack";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("next")
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
    
    public static TrashStack allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TrashStack newInstance = new TrashStack(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code next}
     * @return The value of the field {@code next}
     */
    public org.gtk.glib.TrashStack next$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.TrashStack(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code next}
     * @param next The new value of the field {@code next}
     */
    public void next$set(org.gtk.glib.TrashStack next) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), next.handle());
    }
    
    /**
     * Create a TrashStack proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TrashStack(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
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
    public static int height(@NotNull PointerProxy<org.gtk.glib.TrashStack> stackP) {
        java.util.Objects.requireNonNull(stackP, "Parameter 'stackP' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_trash_stack_height.invokeExact(
                    stackP.handle());
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
    public static @Nullable java.lang.foreign.MemoryAddress peek(@NotNull PointerProxy<org.gtk.glib.TrashStack> stackP) {
        java.util.Objects.requireNonNull(stackP, "Parameter 'stackP' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_trash_stack_peek.invokeExact(
                    stackP.handle());
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
    public static @Nullable java.lang.foreign.MemoryAddress pop(@NotNull PointerProxy<org.gtk.glib.TrashStack> stackP) {
        java.util.Objects.requireNonNull(stackP, "Parameter 'stackP' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_trash_stack_pop.invokeExact(
                    stackP.handle());
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
    public static void push(@NotNull PointerProxy<org.gtk.glib.TrashStack> stackP, @NotNull java.lang.foreign.MemoryAddress dataP) {
        java.util.Objects.requireNonNull(stackP, "Parameter 'stackP' must not be null");
        java.util.Objects.requireNonNull(dataP, "Parameter 'dataP' must not be null");
        try {
            DowncallHandles.g_trash_stack_push.invokeExact(
                    stackP.handle(),
                    dataP);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_trash_stack_height = Interop.downcallHandle(
            "g_trash_stack_height",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_trash_stack_peek = Interop.downcallHandle(
            "g_trash_stack_peek",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_trash_stack_pop = Interop.downcallHandle(
            "g_trash_stack_pop",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_trash_stack_push = Interop.downcallHandle(
            "g_trash_stack_push",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
