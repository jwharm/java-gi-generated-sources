package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrShape} structure is used to represent attributes which
 * impose shape restrictions.
 */
public class AttrShape extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttrShape";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.pango.Attribute.getMemoryLayout().withName("attr"),
        org.pango.Rectangle.getMemoryLayout().withName("ink_rect"),
        org.pango.Rectangle.getMemoryLayout().withName("logical_rect"),
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.ADDRESS.withName("copy_func"),
        Interop.valueLayout.ADDRESS.withName("destroy_func")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static AttrShape allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AttrShape newInstance = new AttrShape(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code attr}
     * @return The value of the field {@code attr}
     */
    public org.pango.Attribute attr$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("attr"));
        return new org.pango.Attribute(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    /**
     * Get the value of the field {@code ink_rect}
     * @return The value of the field {@code ink_rect}
     */
    public org.pango.Rectangle ink_rect$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("ink_rect"));
        return new org.pango.Rectangle(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    /**
     * Get the value of the field {@code logical_rect}
     * @return The value of the field {@code logical_rect}
     */
    public org.pango.Rectangle logical_rect$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("logical_rect"));
        return new org.pango.Rectangle(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void data$set(java.lang.foreign.MemoryAddress data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), data);
    }
    
    /**
     * Get the value of the field {@code copy_func}
     * @return The value of the field {@code copy_func}
     */
    public org.pango.AttrDataCopyFunc copy_func$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code destroy_func}
     * @return The value of the field {@code destroy_func}
     */
    public org.gtk.glib.DestroyNotify destroy_func$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destroy_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    @ApiStatus.Internal
    public AttrShape(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Create a new shape attribute.
     * <p>
     * A shape is used to impose a particular ink and logical
     * rectangle on the result of shaping a particular glyph.
     * This might be used, for instance, for embedding a picture
     * or a widget inside a {@code PangoLayout}.
     * @param inkRect ink rectangle to assign to each character
     * @param logicalRect logical rectangle to assign to each character
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute new_(@NotNull org.pango.Rectangle inkRect, @NotNull org.pango.Rectangle logicalRect) {
        java.util.Objects.requireNonNull(inkRect, "Parameter 'inkRect' must not be null");
        java.util.Objects.requireNonNull(logicalRect, "Parameter 'logicalRect' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_shape_new.invokeExact(
                    inkRect.handle(),
                    logicalRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new shape attribute.
     * <p>
     * Like {@link AttrShape#new_}, but a user data pointer
     * is also provided; this pointer can be accessed when later
     * rendering the glyph.
     * @param inkRect ink rectangle to assign to each character
     * @param logicalRect logical rectangle to assign to each character
     * @param copyFunc function to copy {@code data} when the
     *   attribute is copied. If {@code null}, {@code data} is simply copied
     *   as a pointer
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute newWithData(@NotNull org.pango.Rectangle inkRect, @NotNull org.pango.Rectangle logicalRect, @Nullable org.pango.AttrDataCopyFunc copyFunc) {
        java.util.Objects.requireNonNull(inkRect, "Parameter 'inkRect' must not be null");
        java.util.Objects.requireNonNull(logicalRect, "Parameter 'logicalRect' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_shape_new_with_data.invokeExact(
                    inkRect.handle(),
                    logicalRect.handle(),
                    (Addressable) (copyFunc == null ? MemoryAddress.NULL : Interop.registerCallback(copyFunc)),
                    (Addressable) (copyFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Pango.Callbacks.class, "cbAttrDataCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_attr_shape_new = Interop.downcallHandle(
            "pango_attr_shape_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_attr_shape_new_with_data = Interop.downcallHandle(
            "pango_attr_shape_new_with_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
