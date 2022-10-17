package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure used as the base of all classes.
 */
public class TypeClass extends io.github.jwharm.javagi.ResourceBase {

    public TypeClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_type_class_get_instance_private_offset = Interop.downcallHandle(
        "g_type_class_get_instance_private_offset",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the offset of the private data for instances of {@code g_class}.
     * <p>
     * This is how many bytes you should add to the instance pointer of a
     * class in order to get the private data for the type represented by
     * {@code g_class}.
     * <p>
     * You can only call this function after you have registered a private
     * data area for {@code g_class} using g_type_class_add_private().
     */
    public int getInstancePrivateOffset() {
        int RESULT;
        try {
            RESULT = (int) g_type_class_get_instance_private_offset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_type_class_get_private = Interop.downcallHandle(
        "g_type_class_get_private",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public @Nullable java.lang.foreign.MemoryAddress getPrivate(@NotNull org.gtk.gobject.Type privateType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_class_get_private.invokeExact(handle(), privateType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_type_class_peek_parent = Interop.downcallHandle(
        "g_type_class_peek_parent",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This is a convenience function often needed in class initializers.
     * It returns the class structure of the immediate parent type of the
     * class passed in.  Since derived classes hold a reference count on
     * their parent classes as long as they are instantiated, the returned
     * class will always exist.
     * <p>
     * This function is essentially equivalent to:
     * g_type_class_peek (g_type_parent (G_TYPE_FROM_CLASS (g_class)))
     */
    public @NotNull TypeClass peekParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_class_peek_parent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeClass(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_class_unref = Interop.downcallHandle(
        "g_type_class_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count of the class structure being passed in.
     * Once the last reference count of a class has been released, classes
     * may be finalized by the type system, so further dereferencing of a
     * class pointer after g_type_class_unref() are invalid.
     */
    public @NotNull void unref() {
        try {
            g_type_class_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_class_unref_uncached = Interop.downcallHandle(
        "g_type_class_unref_uncached",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * A variant of g_type_class_unref() for use in {@link TypeClassCacheFunc}
     * implementations. It unreferences a class without consulting the chain
     * of {@code GTypeClassCacheFuncs}, avoiding the recursion which would occur
     * otherwise.
     */
    public @NotNull void unrefUncached() {
        try {
            g_type_class_unref_uncached.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_class_adjust_private_offset = Interop.downcallHandle(
        "g_type_class_adjust_private_offset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static @NotNull void adjustPrivateOffset(@Nullable java.lang.foreign.MemoryAddress gClass, @NotNull PointerInteger privateSizeOrOffset) {
        try {
            g_type_class_adjust_private_offset.invokeExact(gClass, privateSizeOrOffset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_class_peek = Interop.downcallHandle(
        "g_type_class_peek",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * This function is essentially the same as g_type_class_ref(),
     * except that the classes reference count isn't incremented.
     * As a consequence, this function may return {@code null} if the class
     * of the type passed in does not currently exist (hasn't been
     * referenced before).
     */
    public static @NotNull TypeClass peek(@NotNull org.gtk.gobject.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_class_peek.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeClass(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_class_peek_static = Interop.downcallHandle(
        "g_type_class_peek_static",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * A more efficient version of g_type_class_peek() which works only for
     * static types.
     */
    public static @NotNull TypeClass peekStatic(@NotNull org.gtk.gobject.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_class_peek_static.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeClass(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_class_ref = Interop.downcallHandle(
        "g_type_class_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Increments the reference count of the class structure belonging to
     * {@code type}. This function will demand-create the class if it doesn't
     * exist already.
     */
    public static @NotNull TypeClass ref(@NotNull org.gtk.gobject.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_class_ref.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeClass(Refcounted.get(RESULT, false));
    }
    
}
