package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure used as the base of all classes.
 */
public class TypeClass extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_LONG.withName("g_type")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TypeClass}
     * @return A new, uninitialized @{link TypeClass}
     */
    public static TypeClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TypeClass newInstance = new TypeClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TypeClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TypeClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TypeClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TypeClass(input);
    
    /**
     * Registers a private structure for an instantiatable type.
     * <p>
     * When an object is allocated, the private structures for
     * the type and all of its parent types are allocated
     * sequentially in the same memory block as the public
     * structures, and are zero-filled.
     * <p>
     * Note that the accumulated size of the private structures of
     * a type and all its parent types cannot exceed 64 KiB.
     * <p>
     * This function should be called in the type's class_init() function.
     * The private structure can be retrieved using the
     * G_TYPE_INSTANCE_GET_PRIVATE() macro.
     * <p>
     * The following example shows attaching a private structure
     * MyObjectPrivate to an object MyObject defined in the standard
     * GObject fashion in the type's class_init() function.
     * <p>
     * Note the use of a structure member "priv" to avoid the overhead
     * of repeatedly calling MY_OBJECT_GET_PRIVATE().
     * <pre>{@code <!-- language="C" -->
     * typedef struct _MyObject        MyObject;
     * typedef struct _MyObjectPrivate MyObjectPrivate;
     * 
     * struct _MyObject {
     *  GObject parent;
     * 
     *  MyObjectPrivate *priv;
     * };
     * 
     * struct _MyObjectPrivate {
     *   int some_field;
     * };
     * 
     * static void
     * my_object_class_init (MyObjectClass *klass)
     * {
     *   g_type_class_add_private (klass, sizeof (MyObjectPrivate));
     * }
     * 
     * static void
     * my_object_init (MyObject *my_object)
     * {
     *   my_object->priv = G_TYPE_INSTANCE_GET_PRIVATE (my_object,
     *                                                  MY_TYPE_OBJECT,
     *                                                  MyObjectPrivate);
     *   // my_object->priv->some_field will be automatically initialised to 0
     * }
     * 
     * static int
     * my_object_get_some_field (MyObject *my_object)
     * {
     *   MyObjectPrivate *priv;
     * 
     *   g_return_val_if_fail (MY_IS_OBJECT (my_object), 0);
     * 
     *   priv = my_object->priv;
     * 
     *   return priv->some_field;
     * }
     * }</pre>
     * @param privateSize size of private structure
     * @deprecated Use the G_ADD_PRIVATE() macro with the {@code G_DEFINE_*}
     *   family of macros to add instance private data to a type
     */
    @Deprecated
    public void addPrivate(long privateSize) {
        try {
            DowncallHandles.g_type_class_add_private.invokeExact(
                    handle(),
                    privateSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the offset of the private data for instances of {@code g_class}.
     * <p>
     * This is how many bytes you should add to the instance pointer of a
     * class in order to get the private data for the type represented by
     * {@code g_class}.
     * <p>
     * You can only call this function after you have registered a private
     * data area for {@code g_class} using g_type_class_add_private().
     * @return the offset, in bytes
     */
    public int getInstancePrivateOffset() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_class_get_instance_private_offset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @Nullable java.lang.foreign.MemoryAddress getPrivate(org.gtk.glib.Type privateType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_class_get_private.invokeExact(
                    handle(),
                    privateType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This is a convenience function often needed in class initializers.
     * It returns the class structure of the immediate parent type of the
     * class passed in.  Since derived classes hold a reference count on
     * their parent classes as long as they are instantiated, the returned
     * class will always exist.
     * <p>
     * This function is essentially equivalent to:
     * g_type_class_peek (g_type_parent (G_TYPE_FROM_CLASS (g_class)))
     * @return the parent class
     *     of {@code g_class}
     */
    public org.gtk.gobject.TypeClass peekParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_class_peek_parent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.TypeClass.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Decrements the reference count of the class structure being passed in.
     * Once the last reference count of a class has been released, classes
     * may be finalized by the type system, so further dereferencing of a
     * class pointer after g_type_class_unref() are invalid.
     */
    public void unref() {
        try {
            DowncallHandles.g_type_class_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A variant of g_type_class_unref() for use in {@link TypeClassCacheFunc}
     * implementations. It unreferences a class without consulting the chain
     * of {@code GTypeClassCacheFuncs}, avoiding the recursion which would occur
     * otherwise.
     */
    public void unrefUncached() {
        try {
            DowncallHandles.g_type_class_unref_uncached.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void adjustPrivateOffset(@Nullable java.lang.foreign.MemoryAddress gClass, PointerInteger privateSizeOrOffset) {
        try {
            DowncallHandles.g_type_class_adjust_private_offset.invokeExact(
                    (Addressable) (gClass == null ? MemoryAddress.NULL : (Addressable) gClass),
                    privateSizeOrOffset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function is essentially the same as g_type_class_ref(),
     * except that the classes reference count isn't incremented.
     * As a consequence, this function may return {@code null} if the class
     * of the type passed in does not currently exist (hasn't been
     * referenced before).
     * @param type type ID of a classed type
     * @return the {@link TypeClass}
     *     structure for the given type ID or {@code null} if the class does not
     *     currently exist
     */
    public static org.gtk.gobject.TypeClass peek(org.gtk.glib.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_class_peek.invokeExact(type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.TypeClass.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * A more efficient version of g_type_class_peek() which works only for
     * static types.
     * @param type type ID of a classed type
     * @return the {@link TypeClass}
     *     structure for the given type ID or {@code null} if the class does not
     *     currently exist or is dynamically loaded
     */
    public static org.gtk.gobject.TypeClass peekStatic(org.gtk.glib.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_class_peek_static.invokeExact(type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.TypeClass.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Increments the reference count of the class structure belonging to
     * {@code type}. This function will demand-create the class if it doesn't
     * exist already.
     * @param type type ID of a classed type
     * @return the {@link TypeClass}
     *     structure for the given type ID
     */
    public static org.gtk.gobject.TypeClass ref(org.gtk.glib.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_class_ref.invokeExact(type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.TypeClass.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_type_class_add_private = Interop.downcallHandle(
                "g_type_class_add_private",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_type_class_get_instance_private_offset = Interop.downcallHandle(
                "g_type_class_get_instance_private_offset",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_type_class_get_private = Interop.downcallHandle(
                "g_type_class_get_private",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_type_class_peek_parent = Interop.downcallHandle(
                "g_type_class_peek_parent",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_type_class_unref = Interop.downcallHandle(
                "g_type_class_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_type_class_unref_uncached = Interop.downcallHandle(
                "g_type_class_unref_uncached",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_type_class_adjust_private_offset = Interop.downcallHandle(
                "g_type_class_adjust_private_offset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_type_class_peek = Interop.downcallHandle(
                "g_type_class_peek",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_type_class_peek_static = Interop.downcallHandle(
                "g_type_class_peek_static",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_type_class_ref = Interop.downcallHandle(
                "g_type_class_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * A {@link TypeClass.Builder} object constructs a {@link TypeClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TypeClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TypeClass struct;
        
        private Builder() {
            struct = TypeClass.allocate();
        }
        
        /**
         * Finish building the {@link TypeClass} struct.
         * @return A new instance of {@code TypeClass} with the fields 
         *         that were set in the Builder object.
         */
        public TypeClass build() {
            return struct;
        }
        
        public Builder setGType(org.gtk.glib.Type gType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gType == null ? MemoryAddress.NULL : gType.getValue().longValue()));
                return this;
            }
        }
    }
}
