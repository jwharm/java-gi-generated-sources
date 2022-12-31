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
public class OptionGroup extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GOptionGroup";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link OptionGroup}
     * @return A new, uninitialized @{link OptionGroup}
     */
    public static OptionGroup allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OptionGroup newInstance = new OptionGroup(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a OptionGroup proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected OptionGroup(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, OptionGroup> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new OptionGroup(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String name, java.lang.String description, java.lang.String helpDescription, @Nullable org.gtk.glib.DestroyNotify destroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_option_group_new.invokeExact(
                    Marshal.stringToAddress.marshal(name, null),
                    Marshal.stringToAddress.marshal(description, null),
                    Marshal.stringToAddress.marshal(helpDescription, null),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
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
     * @param destroy a function that will be called to free {@code user_data}, or {@code null}
     */
    public OptionGroup(java.lang.String name, java.lang.String description, java.lang.String helpDescription, @Nullable org.gtk.glib.DestroyNotify destroy) {
        super(constructNew(name, description, helpDescription, destroy), Ownership.FULL);
    }
    
    /**
     * Adds the options specified in {@code entries} to {@code group}.
     * @param entries a {@code null}-terminated array of {@code GOptionEntrys}
     */
    public void addEntries(org.gtk.glib.OptionEntry[] entries) {
        try {
            DowncallHandles.g_option_group_add_entries.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(entries, org.gtk.glib.OptionEntry.getMemoryLayout(), false));
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
            DowncallHandles.g_option_group_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increments the reference count of {@code group} by one.
     * @return a {@link OptionGroup}
     */
    public org.gtk.glib.OptionGroup ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_option_group_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.OptionGroup.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Associates a function with {@code group} which will be called
     * from g_option_context_parse() when an error occurs.
     * <p>
     * Note that the user data to be passed to {@code error_func} can be
     * specified when constructing the group with g_option_group_new().
     * @param errorFunc a function to call when an error occurs
     */
    public void setErrorHook(org.gtk.glib.OptionErrorFunc errorFunc) {
        try {
            DowncallHandles.g_option_group_set_error_hook.invokeExact(
                    handle(),
                    (Addressable) errorFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.g_option_group_set_parse_hooks.invokeExact(
                    handle(),
                    (Addressable) (preParseFunc == null ? MemoryAddress.NULL : (Addressable) preParseFunc.toCallback()),
                    (Addressable) (postParseFunc == null ? MemoryAddress.NULL : (Addressable) postParseFunc.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the function which is used to translate user-visible strings,
     * for {@code --help} output. Different groups can use different
     * {@code GTranslateFuncs}. If {@code func} is {@code null}, strings are not translated.
     * <p>
     * If you are using gettext(), you only need to set the translation
     * domain, see g_option_group_set_translation_domain().
     * @param func the {@link TranslateFunc}, or {@code null}
     * @param destroyNotify a function which gets called to free {@code data}, or {@code null}
     */
    public void setTranslateFunc(@Nullable org.gtk.glib.TranslateFunc func, @Nullable org.gtk.glib.DestroyNotify destroyNotify) {
        try {
            DowncallHandles.g_option_group_set_translate_func.invokeExact(
                    handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (destroyNotify == null ? MemoryAddress.NULL : (Addressable) destroyNotify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A convenience function to use gettext() for translating
     * user-visible strings.
     * @param domain the domain to use
     */
    public void setTranslationDomain(java.lang.String domain) {
        try {
            DowncallHandles.g_option_group_set_translation_domain.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(domain, null));
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
            DowncallHandles.g_option_group_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_option_group_new = Interop.downcallHandle(
            "g_option_group_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_group_add_entries = Interop.downcallHandle(
            "g_option_group_add_entries",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_group_free = Interop.downcallHandle(
            "g_option_group_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_group_ref = Interop.downcallHandle(
            "g_option_group_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_group_set_error_hook = Interop.downcallHandle(
            "g_option_group_set_error_hook",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_group_set_parse_hooks = Interop.downcallHandle(
            "g_option_group_set_parse_hooks",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_group_set_translate_func = Interop.downcallHandle(
            "g_option_group_set_translate_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_group_set_translation_domain = Interop.downcallHandle(
            "g_option_group_set_translation_domain",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_group_unref = Interop.downcallHandle(
            "g_option_group_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
