package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ParamSpec} is an object structure that encapsulates the metadata
 * required to specify parameters, such as e.g. {@link Object} properties.
 * 
 * <h2>Parameter names # {#canonical-parameter-names}</h2>
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

    public ParamSpec(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpec */
    public static ParamSpec castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpec(gobject.refcounted());
    }
    
    private static final MethodHandle g_param_spec_get_blurb = Interop.downcallHandle(
        "g_param_spec_get_blurb",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the short description of a {@link ParamSpec}.
     */
    public @Nullable java.lang.String getBlurb() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_get_blurb.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_param_spec_get_default_value = Interop.downcallHandle(
        "g_param_spec_get_default_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default value of {@code pspec} as a pointer to a {@link Value}.
     * <p>
     * The {@link Value} will remain valid for the life of {@code pspec}.
     */
    public @NotNull Value getDefaultValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_get_default_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Value(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_param_spec_get_name = Interop.downcallHandle(
        "g_param_spec_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the name of a {@link ParamSpec}.
     * <p>
     * The name is always an "interned" string (as per g_intern_string()).
     * This allows for pointer-value comparisons.
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_param_spec_get_name_quark = Interop.downcallHandle(
        "g_param_spec_get_name_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the GQuark for the name.
     */
    public @NotNull org.gtk.glib.Quark getNameQuark() {
        int RESULT;
        try {
            RESULT = (int) g_param_spec_get_name_quark.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static final MethodHandle g_param_spec_get_nick = Interop.downcallHandle(
        "g_param_spec_get_nick",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the nickname of a {@link ParamSpec}.
     */
    public @NotNull java.lang.String getNick() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_get_nick.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_param_spec_get_qdata = Interop.downcallHandle(
        "g_param_spec_get_qdata",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata().
     */
    public @Nullable java.lang.foreign.MemoryAddress getQdata(@NotNull org.gtk.glib.Quark quark) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_get_qdata.invokeExact(handle(), quark.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_param_spec_get_redirect_target = Interop.downcallHandle(
        "g_param_spec_get_redirect_target",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If the paramspec redirects operations to another paramspec,
     * returns that paramspec. Redirect is used typically for
     * providing a new implementation of a property in a derived
     * type while preserving all the properties from the parent
     * type. Redirection is established by creating a property
     * of type {@link ParamSpecOverride}. See g_object_class_override_property()
     * for an example of the use of this capability.
     */
    public @Nullable ParamSpec getRedirectTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_get_redirect_target.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_param_spec_ref = Interop.downcallHandle(
        "g_param_spec_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increments the reference count of {@code pspec}.
     */
    public @NotNull ParamSpec ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_ref_sink = Interop.downcallHandle(
        "g_param_spec_ref_sink",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function to ref and sink a {@link ParamSpec}.
     */
    public @NotNull ParamSpec refSink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_ref_sink.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_set_qdata = Interop.downcallHandle(
        "g_param_spec_set_qdata",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets an opaque, named pointer on a {@link ParamSpec}. The name is
     * specified through a {@link org.gtk.glib.Quark} (retrieved e.g. via
     * g_quark_from_static_string()), and the pointer can be gotten back
     * from the {@code pspec} with g_param_spec_get_qdata().  Setting a
     * previously set user data pointer, overrides (frees) the old pointer
     * set, using {@code null} as pointer essentially removes the data stored.
     */
    public @NotNull void setQdata(@NotNull org.gtk.glib.Quark quark, @Nullable java.lang.foreign.MemoryAddress data) {
        try {
            g_param_spec_set_qdata.invokeExact(handle(), quark.getValue(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_param_spec_set_qdata_full = Interop.downcallHandle(
        "g_param_spec_set_qdata_full",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function works like g_param_spec_set_qdata(), but in addition,
     * a {@code void (*destroy) (gpointer)} function may be
     * specified which is called with {@code data} as argument when the {@code pspec} is
     * finalized, or the data is being overwritten by a call to
     * g_param_spec_set_qdata() with the same {@code quark}.
     */
    public @NotNull void setQdataFull(@NotNull org.gtk.glib.Quark quark, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.gtk.glib.DestroyNotify destroy) {
        try {
            g_param_spec_set_qdata_full.invokeExact(handle(), quark.getValue(), data, 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_param_spec_sink = Interop.downcallHandle(
        "g_param_spec_sink",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * The initial reference count of a newly created {@link ParamSpec} is 1,
     * even though no one has explicitly called g_param_spec_ref() on it
     * yet. So the initial reference count is flagged as "floating", until
     * someone calls {@code g_param_spec_ref (pspec); g_param_spec_sink
     * (pspec);} in sequence on it, taking over the initial
     * reference count (thus ending up with a {@code pspec} that has a reference
     * count of 1 still, but is not flagged "floating" anymore).
     */
    public @NotNull void sink() {
        try {
            g_param_spec_sink.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_param_spec_steal_qdata = Interop.downcallHandle(
        "g_param_spec_steal_qdata",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata()
     * and removes the {@code data} from {@code pspec} without invoking its destroy()
     * function (if any was set).  Usually, calling this function is only
     * required to update user data pointers with a destroy notifier.
     */
    public @Nullable java.lang.foreign.MemoryAddress stealQdata(@NotNull org.gtk.glib.Quark quark) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_steal_qdata.invokeExact(handle(), quark.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_param_spec_unref = Interop.downcallHandle(
        "g_param_spec_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count of a {@code pspec}.
     */
    public @NotNull void unref() {
        try {
            g_param_spec_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_param_spec_internal = Interop.downcallHandle(
        "g_param_spec_internal",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public static @NotNull ParamSpec internal(@NotNull org.gtk.gobject.Type paramType, @NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_internal.invokeExact(paramType.getValue(), Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_param_spec_is_valid_name = Interop.downcallHandle(
        "g_param_spec_is_valid_name",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Validate a property name for a {@link ParamSpec}. This can be useful for
     * dynamically-generated properties which need to be validated at run-time
     * before actually trying to create them.
     * <p>
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for valid names.
     */
    public static boolean isValidName(@NotNull java.lang.String name) {
        int RESULT;
        try {
            RESULT = (int) g_param_spec_is_valid_name.invokeExact(Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
}
