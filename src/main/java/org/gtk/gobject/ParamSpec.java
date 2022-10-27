package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ParamSpec} is an object structure that encapsulates the metadata
 * required to specify parameters, such as e.g. {@link Object} properties.
 * <p>
 * <strong>Parameter names # {#canonical-parameter-names}</strong><br/>
 * A property name consists of one or more segments consisting of ASCII letters
 * and digits, separated by either the {@code -} or {@code _} character. The first
 * character of a property name must be a letter. These are the same rules as
 * for signal naming (see g_signal_new()).
 * <p>
 * When creating and looking up a {@link ParamSpec}, either separator can be
 * used, but they cannot be mixed. Using {@code -} is considerably more
 * efficient, and is the ‘canonical form’. Using {@code _} is discouraged.
 */
public class ParamSpec extends org.gtk.gobject.Object {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInstance.getMemoryLayout().withName("g_type_instance"),
        Interop.valueLayout.ADDRESS.withName("name"),
        org.gtk.gobject.ParamFlags.getMemoryLayout().withName("flags"),
        ValueLayout.JAVA_LONG.withName("value_type"),
        ValueLayout.JAVA_LONG.withName("owner_type"),
        Interop.valueLayout.ADDRESS.withName("_nick"),
        Interop.valueLayout.ADDRESS.withName("_blurb"),
        org.gtk.glib.Data.getMemoryLayout().withName("qdata"),
        ValueLayout.JAVA_INT.withName("ref_count"),
        ValueLayout.JAVA_INT.withName("param_id")
    ).withName("GParamSpec");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ParamSpec(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpec */
    public static ParamSpec castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpec(gobject.refcounted());
    }
    
    /**
     * Get the short description of a {@link ParamSpec}.
     * @return the short description of {@code pspec}.
     */
    public @Nullable java.lang.String getBlurb() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_blurb.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the default value of {@code pspec} as a pointer to a {@link Value}.
     * <p>
     * The {@link Value} will remain valid for the life of {@code pspec}.
     * @return a pointer to a {@link Value} which must not be modified
     */
    public @NotNull org.gtk.gobject.Value getDefaultValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_default_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(Refcounted.get(RESULT, false));
    }
    
    /**
     * Get the name of a {@link ParamSpec}.
     * <p>
     * The name is always an "interned" string (as per g_intern_string()).
     * This allows for pointer-value comparisons.
     * @return the name of {@code pspec}.
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the GQuark for the name.
     * @return the GQuark for {@code pspec}-&gt;name.
     */
    public @NotNull org.gtk.glib.Quark getNameQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_param_spec_get_name_quark.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Get the nickname of a {@link ParamSpec}.
     * @return the nickname of {@code pspec}.
     */
    public @NotNull java.lang.String getNick() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_nick.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata().
     * @param quark a {@link org.gtk.glib.Quark}, naming the user data pointer
     * @return the user data pointer set, or {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress getQdata(@NotNull org.gtk.glib.Quark quark) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_qdata.invokeExact(handle(), quark.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * If the paramspec redirects operations to another paramspec,
     * returns that paramspec. Redirect is used typically for
     * providing a new implementation of a property in a derived
     * type while preserving all the properties from the parent
     * type. Redirection is established by creating a property
     * of type {@link ParamSpecOverride}. See g_object_class_override_property()
     * for an example of the use of this capability.
     * @return paramspec to which requests on this
     *          paramspec should be redirected, or {@code null} if none.
     */
    public @Nullable org.gtk.gobject.ParamSpec getRedirectTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_redirect_target.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, false));
    }
    
    /**
     * Increments the reference count of {@code pspec}.
     * @return the {@link ParamSpec} that was passed into this function
     */
    public @NotNull org.gtk.gobject.ParamSpec ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Convenience function to ref and sink a {@link ParamSpec}.
     * @return the {@link ParamSpec} that was passed into this function
     */
    public @NotNull org.gtk.gobject.ParamSpec refSink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_ref_sink.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Sets an opaque, named pointer on a {@link ParamSpec}. The name is
     * specified through a {@link org.gtk.glib.Quark} (retrieved e.g. via
     * g_quark_from_static_string()), and the pointer can be gotten back
     * from the {@code pspec} with g_param_spec_get_qdata().  Setting a
     * previously set user data pointer, overrides (frees) the old pointer
     * set, using {@code null} as pointer essentially removes the data stored.
     * @param quark a {@link org.gtk.glib.Quark}, naming the user data pointer
     * @param data an opaque user data pointer
     */
    public void setQdata(@NotNull org.gtk.glib.Quark quark, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        try {
            DowncallHandles.g_param_spec_set_qdata.invokeExact(handle(), quark.getValue(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function works like g_param_spec_set_qdata(), but in addition,
     * a {@code void (*destroy) (gpointer)} function may be
     * specified which is called with {@code data} as argument when the {@code pspec} is
     * finalized, or the data is being overwritten by a call to
     * g_param_spec_set_qdata() with the same {@code quark}.
     * @param quark a {@link org.gtk.glib.Quark}, naming the user data pointer
     * @param data an opaque user data pointer
     * @param destroy function to invoke with {@code data} as argument, when {@code data} needs to
     *  be freed
     */
    public void setQdataFull(@NotNull org.gtk.glib.Quark quark, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.gtk.glib.DestroyNotify destroy) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        try {
            DowncallHandles.g_param_spec_set_qdata_full.invokeExact(handle(), quark.getValue(), data, 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The initial reference count of a newly created {@link ParamSpec} is 1,
     * even though no one has explicitly called g_param_spec_ref() on it
     * yet. So the initial reference count is flagged as "floating", until
     * someone calls {@code g_param_spec_ref (pspec); g_param_spec_sink
     * (pspec);} in sequence on it, taking over the initial
     * reference count (thus ending up with a {@code pspec} that has a reference
     * count of 1 still, but is not flagged "floating" anymore).
     */
    public void sink() {
        try {
            DowncallHandles.g_param_spec_sink.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata()
     * and removes the {@code data} from {@code pspec} without invoking its destroy()
     * function (if any was set).  Usually, calling this function is only
     * required to update user data pointers with a destroy notifier.
     * @param quark a {@link org.gtk.glib.Quark}, naming the user data pointer
     * @return the user data pointer set, or {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress stealQdata(@NotNull org.gtk.glib.Quark quark) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_steal_qdata.invokeExact(handle(), quark.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Decrements the reference count of a {@code pspec}.
     */
    public void unref() {
        try {
            DowncallHandles.g_param_spec_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link ParamSpec} instance.
     * <p>
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for {@code name}. Names which violate these rules lead to undefined
     * behaviour.
     * <p>
     * Beyond the name, {@code GParamSpecs} have two more descriptive
     * strings associated with them, the {@code nick}, which should be suitable
     * for use as a label for the property in a property editor, and the
     * {@code blurb}, which should be a somewhat longer description, suitable for
     * e.g. a tooltip. The {@code nick} and {@code blurb} should ideally be localized.
     * @param paramType the {@link Type} for the property; must be derived from {@code G_TYPE_PARAM}
     * @param name the canonical name of the property
     * @param nick the nickname of the property
     * @param blurb a short description of the property
     * @param flags a combination of {@link ParamFlags}
     * @return (transfer floating): a newly allocated
     *     {@link ParamSpec} instance, which is initially floating
     */
    public static @NotNull org.gtk.gobject.ParamSpec internal(@NotNull org.gtk.glib.Type paramType, @NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(paramType, "Parameter 'paramType' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(nick, "Parameter 'nick' must not be null");
        java.util.Objects.requireNonNull(blurb, "Parameter 'blurb' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_internal.invokeExact(paramType.getValue(), Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, false));
    }
    
    /**
     * Validate a property name for a {@link ParamSpec}. This can be useful for
     * dynamically-generated properties which need to be validated at run-time
     * before actually trying to create them.
     * <p>
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for valid names.
     * @param name the canonical name of the property
     * @return {@code true} if {@code name} is a valid property name, {@code false} otherwise.
     */
    public static boolean isValidName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_param_spec_is_valid_name.invokeExact(Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_param_spec_get_blurb = Interop.downcallHandle(
            "g_param_spec_get_blurb",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_param_spec_get_default_value = Interop.downcallHandle(
            "g_param_spec_get_default_value",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_param_spec_get_name = Interop.downcallHandle(
            "g_param_spec_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_param_spec_get_name_quark = Interop.downcallHandle(
            "g_param_spec_get_name_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_param_spec_get_nick = Interop.downcallHandle(
            "g_param_spec_get_nick",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_param_spec_get_qdata = Interop.downcallHandle(
            "g_param_spec_get_qdata",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_param_spec_get_redirect_target = Interop.downcallHandle(
            "g_param_spec_get_redirect_target",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_param_spec_ref = Interop.downcallHandle(
            "g_param_spec_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_param_spec_ref_sink = Interop.downcallHandle(
            "g_param_spec_ref_sink",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_param_spec_set_qdata = Interop.downcallHandle(
            "g_param_spec_set_qdata",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_param_spec_set_qdata_full = Interop.downcallHandle(
            "g_param_spec_set_qdata_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_param_spec_sink = Interop.downcallHandle(
            "g_param_spec_sink",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_param_spec_steal_qdata = Interop.downcallHandle(
            "g_param_spec_steal_qdata",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_param_spec_unref = Interop.downcallHandle(
            "g_param_spec_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_param_spec_internal = Interop.downcallHandle(
            "g_param_spec_internal",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_param_spec_is_valid_name = Interop.downcallHandle(
            "g_param_spec_is_valid_name",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
