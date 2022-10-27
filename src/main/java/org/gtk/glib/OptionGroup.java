package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GOptionGroup} struct defines the options in a single
 * group. The struct has only private fields and should not be directly accessed.
 * <p>
 * All options in a group share the same translation function. Libraries which
 * need to parse commandline options are expected to provide a function for
 * getting a {@code GOptionGroup} holding their options, which
 * the application can then add to its {@link OptionContext}.
 */
public class OptionGroup extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public OptionGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String name, @NotNull java.lang.String description, @NotNull java.lang.String helpDescription, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify destroy) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        java.util.Objects.requireNonNull(helpDescription, "Parameter 'helpDescription' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_option_group_new.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(description), Interop.allocateNativeString(helpDescription), userData, 
                    Interop.cbDestroyNotifySymbol()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link OptionGroup}.
     * @param name the name for the option group, this is used to provide
     *   help for the options in this group with {@code --help-}{@code name}
     * @param description a description for this group to be shown in
     *   {@code --help}. This string is translated using the translation
     *   domain or translation function of the group
     * @param helpDescription a description for the {@code --help-}{@code name} option.
     *   This string is translated using the translation domain or translation function
     *   of the group
     * @param userData user data that will be passed to the pre- and post-parse hooks,
     *   the error hook and to callbacks of {@link OptionArg#CALLBACK} options, or {@code null}
     * @param destroy a function that will be called to free {@code user_data}, or {@code null}
     */
    public OptionGroup(@NotNull java.lang.String name, @NotNull java.lang.String description, @NotNull java.lang.String helpDescription, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify destroy) {
        super(constructNew(name, description, helpDescription, userData, destroy));
    }
    
    /**
     * Adds the options specified in {@code entries} to {@code group}.
     * @param entries a {@code null}-terminated array of {@code GOptionEntrys}
     */
    public void addEntries(org.gtk.glib.OptionEntry[] entries) {
        java.util.Objects.requireNonNull(entries, "Parameter 'entries' must not be null");
        try {
            DowncallHandles.g_option_group_add_entries.invokeExact(handle(), Interop.allocateNativeArray(entries, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees a {@link OptionGroup}. Note that you must not free groups
     * which have been added to a {@link OptionContext}.
     * @deprecated Use g_option_group_unref() instead.
     */
    @Deprecated
    public void free() {
        try {
            DowncallHandles.g_option_group_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increments the reference count of {@code group} by one.
     * @return a {@link OptionGroup}
     */
    public @NotNull org.gtk.glib.OptionGroup ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_option_group_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.OptionGroup(Refcounted.get(RESULT, true));
    }
    
    /**
     * Associates a function with {@code group} which will be called
     * from g_option_context_parse() when an error occurs.
     * <p>
     * Note that the user data to be passed to {@code error_func} can be
     * specified when constructing the group with g_option_group_new().
     * @param errorFunc a function to call when an error occurs
     */
    public void setErrorHook(@NotNull org.gtk.glib.OptionErrorFunc errorFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Associates two functions with {@code group} which will be called
     * from g_option_context_parse() before the first option is parsed
     * and after the last option has been parsed, respectively.
     * <p>
     * Note that the user data to be passed to {@code pre_parse_func} and
     * {@code post_parse_func} can be specified when constructing the group
     * with g_option_group_new().
     * @param preParseFunc a function to call before parsing, or {@code null}
     * @param postParseFunc a function to call after parsing, or {@code null}
     */
    public void setParseHooks(@Nullable org.gtk.glib.OptionParseFunc preParseFunc, @Nullable org.gtk.glib.OptionParseFunc postParseFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Sets the function which is used to translate user-visible strings,
     * for {@code --help} output. Different groups can use different
     * {@code GTranslateFuncs}. If {@code func} is {@code null}, strings are not translated.
     * <p>
     * If you are using gettext(), you only need to set the translation
     * domain, see g_option_group_set_translation_domain().
     * @param func the {@link TranslateFunc}, or {@code null}
     */
    public void setTranslateFunc(@Nullable org.gtk.glib.TranslateFunc func) {
        java.util.Objects.requireNonNullElse(func, MemoryAddress.NULL);
        try {
            DowncallHandles.g_option_group_set_translate_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbTranslateFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (func == null ? MemoryAddress.NULL : Interop.registerCallback(func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A convenience function to use gettext() for translating
     * user-visible strings.
     * @param domain the domain to use
     */
    public void setTranslationDomain(@NotNull java.lang.String domain) {
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        try {
            DowncallHandles.g_option_group_set_translation_domain.invokeExact(handle(), Interop.allocateNativeString(domain));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decrements the reference count of {@code group} by one.
     * If the reference count drops to 0, the {@code group} will be freed.
     * and all memory allocated by the {@code group} is released.
     */
    public void unref() {
        try {
            DowncallHandles.g_option_group_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_option_group_new = Interop.downcallHandle(
            "g_option_group_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_option_group_add_entries = Interop.downcallHandle(
            "g_option_group_add_entries",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_option_group_free = Interop.downcallHandle(
            "g_option_group_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_option_group_ref = Interop.downcallHandle(
            "g_option_group_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_option_group_set_error_hook = Interop.downcallHandle(
            "g_option_group_set_error_hook",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_option_group_set_parse_hooks = Interop.downcallHandle(
            "g_option_group_set_parse_hooks",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_option_group_set_translate_func = Interop.downcallHandle(
            "g_option_group_set_translate_func",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_option_group_set_translation_domain = Interop.downcallHandle(
            "g_option_group_set_translation_domain",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_option_group_unref = Interop.downcallHandle(
            "g_option_group_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
