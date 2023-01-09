package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link WeakNotify} function can be added to an object as a callback that gets
 * triggered when the object is finalized.
 * <p>
 * Since the object is already being disposed when the {@link WeakNotify} is called,
 * there's not much you could do with the object, apart from e.g. using its
 * address as hash-index or the like.
 * <p>
 * In particular, this means it’s invalid to call g_object_ref(),
 * g_weak_ref_init(), g_weak_ref_set(), g_object_add_toggle_ref(),
 * g_object_weak_ref(), g_object_add_weak_pointer() or any function which calls
 * them on the object from this callback.
 */
/**
 * Functional interface declaration of the {@code WeakNotify} callback.
 */
@FunctionalInterface
public interface WeakNotify {

    /**
     * A {@link WeakNotify} function can be added to an object as a callback that gets
     * triggered when the object is finalized.
     * <p>
     * Since the object is already being disposed when the {@link WeakNotify} is called,
     * there's not much you could do with the object, apart from e.g. using its
     * address as hash-index or the like.
     * <p>
     * In particular, this means it’s invalid to call g_object_ref(),
     * g_weak_ref_init(), g_weak_ref_set(), g_object_add_toggle_ref(),
     * g_object_weak_ref(), g_object_add_weak_pointer() or any function which calls
     * them on the object from this callback.
     */
    void run(org.gtk.gobject.GObject whereTheObjectWas);
    
    @ApiStatus.Internal default void upcall(MemoryAddress data, MemoryAddress whereTheObjectWas) {
        run((org.gtk.gobject.GObject) Interop.register(whereTheObjectWas, org.gtk.gobject.GObject.fromAddress).marshal(whereTheObjectWas, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WeakNotify.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
