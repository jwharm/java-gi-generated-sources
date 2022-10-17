package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Binding} is the representation of a binding between a property on a
 * {@link Object} instance (or source) and another property on another {@link Object}
 * instance (or target).
 * <p>
 * Whenever the source property changes, the same value is applied to the
 * target property; for instance, the following binding:
 * <p>
 * <pre>{@code <!-- language="C" -->
 *   g_object_bind_property (object1, "property-a",
 *                           object2, "property-b",
 *                           G_BINDING_DEFAULT);
 * }</pre>
 * <p>
 * will cause the property named "property-b" of {@code object2} to be updated
 * every time g_object_set() or the specific accessor changes the value of
 * the property "property-a" of {@code object1}.
 * <p>
 * It is possible to create a bidirectional binding between two properties
 * of two {@link Object} instances, so that if either property changes, the
 * other is updated as well, for instance:
 * <p>
 * <pre>{@code <!-- language="C" -->
 *   g_object_bind_property (object1, "property-a",
 *                           object2, "property-b",
 *                           G_BINDING_BIDIRECTIONAL);
 * }</pre>
 * <p>
 * will keep the two properties in sync.
 * <p>
 * It is also possible to set a custom transformation function (in both
 * directions, in case of a bidirectional binding) to apply a custom
 * transformation from the source value to the target value before
 * applying it; for instance, the following binding:
 * <p>
 * <pre>{@code <!-- language="C" -->
 *   g_object_bind_property_full (adjustment1, "value",
 *                                adjustment2, "value",
 *                                G_BINDING_BIDIRECTIONAL,
 *                                celsius_to_fahrenheit,
 *                                fahrenheit_to_celsius,
 *                                NULL, NULL);
 * }</pre>
 * <p>
 * will keep the "value" property of the two adjustments in sync; the
 * {@code celsius_to_fahrenheit} function will be called whenever the "value"
 * property of {@code adjustment1} changes and will transform the current value
 * of the property before applying it to the "value" property of {@code adjustment2}.
 * <p>
 * Vice versa, the {@code fahrenheit_to_celsius} function will be called whenever
 * the "value" property of {@code adjustment2} changes, and will transform the
 * current value of the property before applying it to the "value" property
 * of {@code adjustment1}.
 * <p>
 * Note that {@link Binding} does not resolve cycles by itself; a cycle like
 * <p>
 * <pre>{@code 
 *   object1:propertyA -> object2:propertyB
 *   object2:propertyB -> object3:propertyC
 *   object3:propertyC -> object1:propertyA
 * }</pre>
 * <p>
 * might lead to an infinite loop. The loop, in this particular case,
 * can be avoided if the objects emit the {@link Object}::notify signal only
 * if the value has effectively been changed. A binding is implemented
 * using the {@link Object}::notify signal, so it is susceptible to all the
 * various ways of blocking a signal emission, like g_signal_stop_emission()
 * or g_signal_handler_block().
 * <p>
 * A binding will be severed, and the resources it allocates freed, whenever
 * either one of the {@link Object} instances it refers to are finalized, or when
 * the {@link Binding} instance loses its last reference.
 * <p>
 * Bindings for languages with garbage collection can use
 * g_binding_unbind() to explicitly release a binding between the source
 * and target properties, instead of relying on the last reference on the
 * binding, source, and target instances to drop.
 * <p>
 * {@link Binding} is available since GObject 2.26
 */
public class Binding extends Object {

    public Binding(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Binding */
    public static Binding castFrom(org.gtk.gobject.Object gobject) {
        return new Binding(gobject.refcounted());
    }
    
    private static final MethodHandle g_binding_dup_source = Interop.downcallHandle(
        "g_binding_dup_source",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@link Object} instance used as the source of the binding.
     * <p>
     * A {@link Binding} can outlive the source {@link Object} as the binding does not hold a
     * strong reference to the source. If the source is destroyed before the
     * binding then this function will return {@code null}.
     */
    public @Nullable Object dupSource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_binding_dup_source.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Object(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_binding_dup_target = Interop.downcallHandle(
        "g_binding_dup_target",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@link Object} instance used as the target of the binding.
     * <p>
     * A {@link Binding} can outlive the target {@link Object} as the binding does not hold a
     * strong reference to the target. If the target is destroyed before the
     * binding then this function will return {@code null}.
     */
    public @Nullable Object dupTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_binding_dup_target.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Object(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_binding_get_flags = Interop.downcallHandle(
        "g_binding_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the flags passed when constructing the {@link Binding}.
     */
    public @NotNull BindingFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) g_binding_get_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BindingFlags(RESULT);
    }
    
    private static final MethodHandle g_binding_get_source_property = Interop.downcallHandle(
        "g_binding_get_source_property",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the name of the property of {@link Binding}:source used as the source
     * of the binding.
     */
    public @NotNull java.lang.String getSourceProperty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_binding_get_source_property.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_binding_get_target_property = Interop.downcallHandle(
        "g_binding_get_target_property",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the name of the property of {@link Binding}:target used as the target
     * of the binding.
     */
    public @NotNull java.lang.String getTargetProperty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_binding_get_target_property.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_binding_unbind = Interop.downcallHandle(
        "g_binding_unbind",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Explicitly releases the binding between the source and the target
     * property expressed by {@code binding}.
     * <p>
     * This function will release the reference that is being held on
     * the {@code binding} instance if the binding is still bound; if you want to hold on
     * to the {@link Binding} instance after calling g_binding_unbind(), you will need
     * to hold a reference to it.
     * <p>
     * Note however that this function does not take ownership of {@code binding}, it
     * only unrefs the reference that was initially created by
     * g_object_bind_property() and is owned by the binding.
     */
    public @NotNull void unbind() {
        try {
            g_binding_unbind.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
